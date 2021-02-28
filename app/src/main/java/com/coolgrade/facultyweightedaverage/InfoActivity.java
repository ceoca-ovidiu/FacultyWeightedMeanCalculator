package com.coolgrade.facultyweightedaverage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class InfoActivity extends AppCompatActivity {

    private boolean isDarkModeActivated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("Shared Preferences", 0);
        boolean isDarkModeActive = preferences.getBoolean("DARK_MODE_STATUS", false);

        ConstraintLayout infoPortraitConstraintLayout = findViewById(R.id.infoPortraitConstraintLayout);
        ConstraintLayout infoLandscapeConstraintLayout = findViewById(R.id.infoLandscapeConstraintLayout);

        Button plusGradeButton = findViewById(R.id.plusGradeButton);
        Button minusGradeButton = findViewById(R.id.minusGradeButton);
        Button plusWeightButton = findViewById(R.id.plusWeightButton);
        Button minusWeightButton = findViewById(R.id.minusWeightButton);
        Button darkModeButton = findViewById(R.id.toggleDarkModeButton);

        if (InfoActivity.this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

            if (!isDarkModeActive) {
                infoPortraitConstraintLayout.setBackgroundResource(R.drawable.info_activity);
                darkModeButton.setText("Dark Mode");
            } else {
                infoPortraitConstraintLayout.setBackgroundResource(R.drawable.info_activity_dark_mode);
                darkModeButton.setText("Light Mode");
            }

        } else {

            if (!isDarkModeActive) {
                infoLandscapeConstraintLayout.setBackgroundResource(R.drawable.info_activity_landscape);
                darkModeButton.setText("Dark Mode");
            } else {
                infoLandscapeConstraintLayout.setBackgroundResource(R.drawable.info_activity_landscape_dark_mode);
                darkModeButton.setText("Light Mode");
            }
        }

        plusGradeButton.setOnClickListener(v -> buttonVibrate());

        plusWeightButton.setOnClickListener(v -> buttonVibrate());

        minusGradeButton.setOnClickListener(v -> buttonVibrate());

        minusWeightButton.setOnClickListener(v -> buttonVibrate());

        darkModeButton.setOnClickListener(v -> {

            if (InfoActivity.this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {


                if (isDarkModeActivated) {
                    infoPortraitConstraintLayout.setBackgroundResource(R.drawable.info_activity);
                    darkModeButton.setText("Dark Mode");
                    isDarkModeActivated = false;
                } else {
                    infoPortraitConstraintLayout.setBackgroundResource(R.drawable.info_activity_dark_mode);
                    darkModeButton.setText("Light Mode");
                    isDarkModeActivated = true;
                }

            } else {

                if (isDarkModeActivated) {
                    infoLandscapeConstraintLayout.setBackgroundResource(R.drawable.info_activity_landscape);
                    darkModeButton.setText("Dark Mode");
                    isDarkModeActivated = false;
                } else {
                    infoLandscapeConstraintLayout.setBackgroundResource(R.drawable.info_activity_landscape_dark_mode);
                    darkModeButton.setText("Light Mode");
                    isDarkModeActivated = true;
                }

            }

        });

    }

    private void buttonVibrate() {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        int VIBRATE_TIME = 4;
        vibrator.vibrate(VibrationEffect.createOneShot(VIBRATE_TIME, VibrationEffect.DEFAULT_AMPLITUDE));
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        SharedPreferences settings = getApplicationContext().getSharedPreferences("Shared Preferences", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("DARK_MODE_STATUS", isDarkModeActivated);
        editor.apply();
        Intent intent = new Intent(InfoActivity.this, MainActivity.class);
        startActivity(intent);
    }

}