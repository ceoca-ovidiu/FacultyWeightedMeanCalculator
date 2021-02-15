package com.example.facultyweightedaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plusButton = (Button) findViewById(R.id.plusButton);
        Button minusButton = (Button) findViewById(R.id.minusButton);
        Button doneButton = (Button) findViewById(R.id.doneButton);
        TextView numberOfClassesTextView = (TextView) findViewById(R.id.numberOfClassesTextView);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String auxString = numberOfClassesTextView.getText().toString();
                if(auxString.isEmpty()){
                    numberOfClassesTextView.setText("1");
                }else{
                    int auxInt = Integer.parseInt(auxString);
                    if(auxInt > 19)
                        Toast.makeText(MainActivity.this, "Number too high", Toast.LENGTH_SHORT).show();
                    else
                        numberOfClassesTextView.setText(String.valueOf(auxInt+1));
                }
            }
        });


        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String auxString = numberOfClassesTextView.getText().toString();
                if(auxString.isEmpty()){
                    numberOfClassesTextView.setText("1");
                }else{
                    int auxInt = Integer.parseInt(auxString);
                    if(auxInt <= 1)
                        Toast.makeText(MainActivity.this, "Number too low", Toast.LENGTH_SHORT).show();
                    else
                        numberOfClassesTextView.setText(String.valueOf(auxInt-1));
                }
            }
        });


        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String auxString = numberOfClassesTextView.getText().toString();
                int numberOfClasses = Integer.parseInt(auxString);
                Bundle bundle = new Bundle();
                bundle.putInt("NUMBER_OF_CLASSES", numberOfClasses);
                Intent intent = new Intent(MainActivity.this, SolveActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}