package com.coolgrade.facultyweightedaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ResultActivity extends AppCompatActivity {

    private boolean alreadySaved = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Bundle bundle = getIntent().getExtras();
        double finalGrade = bundle.getDouble("RESULT");
        int numberOfClasses = bundle.getInt("NUMBER_OF_CLASSES");
        ArrayList<String> classesNamesArrayList = bundle.getStringArrayList("CLASSES_NAMES_ARRAY");
        Set<String> classesNamesStringSet = new HashSet<>(classesNamesArrayList);

        Button saveButton = findViewById(R.id.saveButton);
        TextView displayTextView = findViewById(R.id.displayTextView);
        displayTextView.setText(numberFormat.format(finalGrade));


        saveButton.setOnClickListener(v -> {
            buttonVibrate();
            if(!alreadySaved){
                SharedPreferences settings = getApplicationContext().getSharedPreferences("Shared Preferences", 0);
                SharedPreferences.Editor editor = settings.edit();
                editor.clear();
                editor.apply();
                editor.putInt("numberOfClasses", numberOfClasses);
                editor.putStringSet("classesNames", classesNamesStringSet);
                editor.apply();
                alreadySaved = true;
            }else{
                Toast.makeText(ResultActivity.this, "Already saved", Toast.LENGTH_SHORT).show();
            }
        });

        saveButton.setOnLongClickListener(new View.OnLongClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public boolean onLongClick(View v) {

                Dialog dialog = new Dialog(ResultActivity.this);
                dialog.setContentView(R.layout.activity_dialog);
                dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialog_background));
                dialog.getWindow().setLayout(1200, 1200);
                dialog.setCancelable(true);
                dialog.show();

                return true;
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
    }
}