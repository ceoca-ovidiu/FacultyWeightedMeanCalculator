package com.coolgrade.facultyweightedaverage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class InfoActivity extends AppCompatActivity {

    private boolean isDarkModeActivated;

    @SuppressLint("SetTextI18n")
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
        TextView infoTextView = findViewById(R.id.infoTextView);

        int portraitLightMode = R.drawable.info_activity_portrait_light;
        int portraitDarkMode = R.drawable.info_activity_portrait_dark_mode;
        int landscapeLightMode = R.drawable.info_activity_landscape_light;
        int landscapeDarkMode = R.drawable.info_activity_landscape_dark_mode;


        darkModeButton.setText("Tap to change the dark/light mode");
        darkModeButton.setTextColor(Color.parseColor("#000000"));

        if (InfoActivity.this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

            if (!isDarkModeActive) {
                infoPortraitConstraintLayout.setBackgroundResource(portraitLightMode);
            } else {
                infoPortraitConstraintLayout.setBackgroundResource(portraitDarkMode);
            }


        } else {

            if (!isDarkModeActive) {
                infoLandscapeConstraintLayout.setBackgroundResource(landscapeLightMode);
            } else {
                infoLandscapeConstraintLayout.setBackgroundResource(landscapeDarkMode);
                infoTextView.setTextColor(Color.parseColor("#FFFFFF"));
            }

        }

        plusGradeButton.setOnClickListener(v -> buttonVibrate());

        plusWeightButton.setOnClickListener(v -> buttonVibrate());

        minusGradeButton.setOnClickListener(v -> buttonVibrate());

        minusWeightButton.setOnClickListener(v -> buttonVibrate());

        darkModeButton.setOnClickListener(v -> {

            if (InfoActivity.this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                if (isDarkModeActivated) {
                    infoPortraitConstraintLayout.setBackgroundResource(portraitLightMode);
                    darkModeButton.setText("Dark Mode");
                    isDarkModeActivated = false;
                } else {
                    infoPortraitConstraintLayout.setBackgroundResource(portraitDarkMode);
                    darkModeButton.setText("Light Mode");
                    isDarkModeActivated = true;
                }
            } else {
                if (isDarkModeActivated) {
                    infoLandscapeConstraintLayout.setBackgroundResource(landscapeLightMode);
                    darkModeButton.setText("Dark Mode");
                    isDarkModeActivated = false;
                } else {
                    infoLandscapeConstraintLayout.setBackgroundResource(landscapeDarkMode);
                    darkModeButton.setText("Light Mode");
                    isDarkModeActivated = true;
                }
            }

            SharedPreferences settings = getApplicationContext().getSharedPreferences("Shared Preferences", 0);
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("DARK_MODE_STATUS", isDarkModeActivated);
            editor.apply();
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
        Intent intent = new Intent(InfoActivity.this, MainActivity.class);
        startActivity(intent);
    }

}