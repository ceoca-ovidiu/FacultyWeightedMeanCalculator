package com.example.facultyweightedaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button plusGradeButton = findViewById(R.id.plusGradeButton);
        Button minusGradeButton = findViewById(R.id.minusGradeButton);
        Button plusWeightButton = findViewById(R.id.plusWeightButton);
        Button minusWeightButton = findViewById(R.id.minusWeightButton);

        plusGradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonVibrate ();
            }
        });


        plusWeightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonVibrate ();
            }
        });

        minusGradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonVibrate ();
            }
        });

        minusWeightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonVibrate ();
            }
        });

    }

    private void buttonVibrate (){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        int VIBRATE_TIME = 4;
        vibrator.vibrate(VibrationEffect.createOneShot(VIBRATE_TIME, VibrationEffect.DEFAULT_AMPLITUDE));
    }

}