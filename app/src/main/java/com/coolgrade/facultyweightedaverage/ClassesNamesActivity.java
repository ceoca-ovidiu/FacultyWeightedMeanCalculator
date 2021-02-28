package com.coolgrade.facultyweightedaverage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class ClassesNamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes_names);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("Shared Preferences", 0);
        boolean isDarkModeActive = preferences.getBoolean("DARK_MODE_STATUS", false);

        ConstraintLayout classesNamesPortraitConstraintLayout = findViewById(R.id.classesNamesPortraitConstraintLayout);
        ConstraintLayout classesNamesLandscapeConstraintLayout = findViewById(R.id.classesNamesLandscapeConstraintLayout);

        if (ClassesNamesActivity.this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

            if (!isDarkModeActive) {
                classesNamesPortraitConstraintLayout.setBackgroundResource(R.drawable.solve_activity);
            } else {
                classesNamesPortraitConstraintLayout.setBackgroundResource(R.drawable.enter_classes_names_activity_dark_mode);
            }

        } else {

            if (!isDarkModeActive) {
                classesNamesLandscapeConstraintLayout.setBackgroundResource(R.drawable.solve_activity_landscape);
            } else {
                classesNamesLandscapeConstraintLayout.setBackgroundResource(R.drawable.solve_activity_landscape_dark_mode);
            }

        }

        ArrayList<String> classesNamesArrayList = new ArrayList<>();
        Button nextButton = findViewById(R.id.nextButton);
        LinearLayout linearLayout = findViewById(R.id.classesNamesLinearLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(60, 40, 60, 40);

        Bundle bundle = getIntent().getExtras();
        int numberOfClasses = bundle.getInt("NUMBER_OF_CLASSES", 0);

        int textViewBackground = R.drawable.textview_background_rounded_slim_stroke_dark_blue_75;

        for (int i = 0; i < numberOfClasses; i++) {
            EditText nameEditText = createEditText("Class " + (i + 1), textViewBackground, layoutParams);
            linearLayout.addView(nameEditText);
        }

        nextButton.setOnClickListener(v -> {
            buttonVibrate();
            boolean isComplete = true;
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                View view = linearLayout.getChildAt(i);
                if (((EditText) view).getText().toString().isEmpty()) {
                    isComplete = false;
                }
            }

            if (isComplete) {
                for (int i = 0; i < linearLayout.getChildCount(); i++) {
                    View view = linearLayout.getChildAt(i);
                    if (view instanceof EditText) {
                        classesNamesArrayList.add(((EditText) view).getText().toString());
                    }
                }
                Intent intent = new Intent(ClassesNamesActivity.this, SolveActivity.class);
                bundle.putStringArrayList("CLASSES_NAMES_ARRAY", classesNamesArrayList);
                bundle.putInt("NUMBER_OF_CLASSES", numberOfClasses);
                intent.putExtras(bundle);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            } else {
                Toast.makeText(this, "Empty field", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private EditText createEditText(String hintText, int background, LinearLayout.LayoutParams params) {

        EditText editText = new EditText(this);
        editText.setHint(hintText);
        editText.setHintTextColor(Color.parseColor("#FFFFFF"));
        editText.setTextSize((float) 20);
        editText.setTextColor(Color.parseColor("#FFFFFF"));
        editText.setGravity(Gravity.CENTER);
        editText.setBackgroundResource(background);
        editText.setLayoutParams(params);
        return editText;
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