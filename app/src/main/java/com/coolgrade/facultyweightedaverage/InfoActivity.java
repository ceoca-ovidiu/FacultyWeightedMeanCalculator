package com.coolgrade.facultyweightedaverage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class InfoActivity extends AppCompatActivity {

    private boolean isDarkModeActivated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ConstraintLayout infoConstraintLayout = findViewById(R.id.infoConstraintLayout);
        Button plusGradeButton = findViewById(R.id.plusGradeButton);
        Button minusGradeButton = findViewById(R.id.minusGradeButton);
        Button plusWeightButton = findViewById(R.id.plusWeightButton);
        Button minusWeightButton = findViewById(R.id.minusWeightButton);
        Button darkModeButton = findViewById(R.id.toggleDarkModeButton);

        plusGradeButton.setOnClickListener(v -> buttonVibrate());

        plusWeightButton.setOnClickListener(v -> buttonVibrate());

        minusGradeButton.setOnClickListener(v -> buttonVibrate());

        minusWeightButton.setOnClickListener(v -> buttonVibrate());

        darkModeButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (isDarkModeActivated) {
                    infoConstraintLayout.setBackgroundResource(R.drawable.info_activity);
                    darkModeButton.setText("Dark Mode");
                    isDarkModeActivated = false;
                } else {
                    infoConstraintLayout.setBackgroundResource(R.drawable.info_activity_dark_mode);
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
    }

}