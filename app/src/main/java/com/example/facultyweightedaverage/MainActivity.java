package com.example.facultyweightedaverage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plusButton = findViewById(R.id.plusButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button doneButton = findViewById(R.id.doneButton);
        ImageButton infoButton = findViewById(R.id.infoImageButton);
        TextView numberOfClassesTextView = findViewById(R.id.numberOfClassesTextView);
        ArrayList<String> classesNamesArray = new ArrayList<>();
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch skipClassesNamesSwitch = findViewById(R.id.skipClassesNamesSwitch);

        for(int i = 0 ; i < 20 ; i++){
            classesNamesArray.add("Class " + (i+1));
        }

        plusButton.setOnClickListener(v -> {
            String auxString = numberOfClassesTextView.getText().toString();
            if (auxString.isEmpty()) {
                buttonVibrate();
                numberOfClassesTextView.setText("1");
            } else {
                int auxInt = Integer.parseInt(auxString);
                if (auxInt > 19){
                    buttonVibrate();
                    Toast.makeText(MainActivity.this, "Number too high", Toast.LENGTH_SHORT).show();
                }
                else{
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
                }
                else{
                    buttonVibrate();
                    numberOfClassesTextView.setText(String.valueOf(auxInt - 1));
                }

            }
        });

        doneButton.setOnClickListener(v -> {
            buttonVibrate();
            String auxString = numberOfClassesTextView.getText().toString();
            if(auxString.isEmpty()){
                Toast.makeText(this, "Use the buttons to enter the number of classes", Toast.LENGTH_SHORT).show();
            } else {
                int numberOfClasses = Integer.parseInt(auxString);
                Bundle bundle = new Bundle();
                bundle.putInt("NUMBER_OF_CLASSES",numberOfClasses);
                if(skipClassesNamesSwitch.isChecked()){
                    Intent intent = new Intent(MainActivity.this, SolveActivity.class);
                    bundle.putStringArrayList("CLASSES_NAMES_ARRAY",classesNamesArray);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainActivity.this, ClassesNamesActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

        infoButton.setOnClickListener(v -> {
            buttonVibrate();
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        });
    }

    private void buttonVibrate (){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        int VIBRATE_TIME = 4;
        vibrator.vibrate(VibrationEffect.createOneShot(VIBRATE_TIME, VibrationEffect.DEFAULT_AMPLITUDE));
    }
}