package com.example.facultyweightedaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Bundle resultBundle = getIntent().getExtras();
        double finalGrade = resultBundle.getDouble("RESULT");

        TextView displayTextView = findViewById(R.id.displayTextView);
        displayTextView.setText(numberFormat.format(finalGrade));


    }
}