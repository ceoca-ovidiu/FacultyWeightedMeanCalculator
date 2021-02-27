package com.coolgrade.facultyweightedaverage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<String> classesNamesArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("Shared Preferences", 0);
        boolean isDarkModeActive = preferences.getBoolean("DARK_MODE_STATUS", false);

        ConstraintLayout mainConstraintLayout = findViewById(R.id.mainConstraintLayout);

        if (isDarkModeActive) {
            mainConstraintLayout.setBackgroundResource(R.drawable.main_activity);
        } else {
            mainConstraintLayout.setBackgroundResource(R.drawable.main_activity_dark_mode);
        }

        Button plusButton = findViewById(R.id.plusButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button doneButton = findViewById(R.id.doneButton);
        ImageButton infoButton = findViewById(R.id.infoImageButton);
        TextView numberOfClassesTextView = findViewById(R.id.numberOfClassesTextView);
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch skipClassesNamesSwitch = findViewById(R.id.skipClassesNamesSwitch);

        setDefaultClassesNames();
        // setBackground(isDarkModeActive);

        plusButton.setOnClickListener(v -> {
            String auxString = numberOfClassesTextView.getText().toString();
            if (auxString.isEmpty()) {
                buttonVibrate();
                numberOfClassesTextView.setText("1");
            } else {
                int auxInt = Integer.parseInt(auxString);
                if (auxInt > 19) {
                    buttonVibrate();
                    Toast.makeText(MainActivity.this, "Number too high", Toast.LENGTH_SHORT).show();
                } else {
                    buttonVibrate();
                    numberOfClassesTextView.setText(String.valueOf(auxInt + 1));
                }

            }
        });

        minusButton.setOnClickListener(v -> {
            String auxString = numberOfClassesTextView.getText().toString();
            if (auxString.isEmpty()) {
                buttonVibrate();
                numberOfClassesTextView.setText("1");
            } else {
                int auxInt = Integer.parseInt(auxString);
                if (auxInt <= 1) {
                    buttonVibrate();
                    Toast.makeText(MainActivity.this, "Number too low", Toast.LENGTH_SHORT).show();
                } else {
                    buttonVibrate();
                    numberOfClassesTextView.setText(String.valueOf(auxInt - 1));
                }

            }
        });

        doneButton.setOnClickListener(v -> {
            buttonVibrate();
            String numberOfClassesAsString = numberOfClassesTextView.getText().toString();
            if (numberOfClassesAsString.isEmpty()) {
                Toast.makeText(this, "Use the buttons to enter the number of classes", Toast.LENGTH_SHORT).show();
            } else {
                int numberOfClasses = Integer.parseInt(numberOfClassesAsString);
                Bundle bundle = new Bundle();
                bundle.putInt("NUMBER_OF_CLASSES", numberOfClasses);
                int sharedNumberOfClasses = preferences.getInt("numberOfClasses", 0);
                if (sharedNumberOfClasses == numberOfClasses && skipClassesNamesSwitch.isChecked()) {
                    Set<String> classesNamesStringSet = preferences.getStringSet("classesNames", null); //TODO : de vazut faza cu null
                    classesNamesArray.clear();
                    classesNamesArray.addAll(classesNamesStringSet);
                    bundle.putStringArrayList("CLASSES_NAMES_ARRAY", classesNamesArray);
                    Intent intent = new Intent(MainActivity.this, SolveActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                } else if (sharedNumberOfClasses != numberOfClasses && skipClassesNamesSwitch.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, SolveActivity.class);
                    bundle.putStringArrayList("CLASSES_NAMES_ARRAY", classesNamesArray);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                } else {
                    Intent intent = new Intent(MainActivity.this, ClassesNamesActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            }
        });

        infoButton.setOnClickListener(v -> {
            buttonVibrate();
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    protected void onPause() {
        super.onPause();
        classesNamesArray.clear();
        for (int i = 0; i < 20; i++) {
            classesNamesArray.add("Class " + (i + 1));
        }
    }

    private void buttonVibrate() {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        int VIBRATE_TIME = 4;
        vibrator.vibrate(VibrationEffect.createOneShot(VIBRATE_TIME, VibrationEffect.DEFAULT_AMPLITUDE));
    }

    private void setDefaultClassesNames() {
        for (int i = 0; i < 20; i++) {
            classesNamesArray.add("Class " + (i + 1));
        }
    }

/*    private void setBackground(Boolean isDarkModeActive){

        if(isDarkModeActive){
            mainConstraintLayout.setBackgroundResource(R.drawable.main_activity);
        }else{
            mainConstraintLayout.setBackgroundResource(R.drawable.main_activity_dark_mode);
        }

    }*/

}
