package com.example.facultyweightedaverage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ClassesNamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes_names);
        ArrayList<String> classesNamesArrayList = new ArrayList<>();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(60,40,60,40);
        Bundle bundle = getIntent().getExtras();
        int numberOfClasses = bundle.getInt("NUMBER_OF_CLASSES");

        Button nextButton = findViewById(R.id.nextButton);
        LinearLayout linearLayout = findViewById(R.id.classesNamesLinearLayout);

        int textViewBackground = R.drawable.textview_background_rounded_slim_stroke;

        for (int i = 0; i < numberOfClasses; i++) {
            EditText nameEditText = createEditText("Class " + (i + 1), textViewBackground, layoutParams);
            linearLayout.addView(nameEditText);
        }

        nextButton.setOnClickListener(v -> {
            buttonVibrate();
            boolean isComplete = true;
            for(int i = 0 ; i < linearLayout.getChildCount() ; i++){
                View view = linearLayout.getChildAt(i);
                if(((EditText) view).getText().toString().isEmpty()){
                    isComplete = false;
                }
            }

            if(isComplete){
                for(int i = 0 ; i < linearLayout.getChildCount() ; i++){
                    View view = linearLayout.getChildAt(i);
                    if (view instanceof EditText){
                        classesNamesArrayList.add(((EditText) view).getText().toString());
                    }
                }
                Intent intent = new Intent(ClassesNamesActivity.this, SolveActivity.class);
                Bundle bundle1 = new Bundle();
                bundle1.putInt("CLASSES_NUMBER", numberOfClasses);
                bundle1.putStringArrayList("CLASSES_NAMES_ARRAY", classesNamesArrayList);
                intent.putExtras(bundle1);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Empty field", Toast.LENGTH_SHORT).show();
            }


        });

    }

    private EditText createEditText(String hintText, int background, LinearLayout.LayoutParams params) {

        EditText editText = new EditText(this);
        editText.setHint(hintText);
        editText.setHintTextColor(Color.parseColor("#000000"));
        editText.setTextSize((float) 20);
        editText.setTextColor(Color.parseColor("#000000"));
        editText.setGravity(Gravity.CENTER);
        editText.setBackgroundResource(background);
        editText.setLayoutParams(params);

        return editText;
    }

    private void buttonVibrate (){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        int VIBRATE_TIME = 4;
        vibrator.vibrate(VibrationEffect.createOneShot(VIBRATE_TIME, VibrationEffect.DEFAULT_AMPLITUDE));
    }
}