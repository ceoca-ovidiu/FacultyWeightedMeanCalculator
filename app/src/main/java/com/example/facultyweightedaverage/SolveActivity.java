package com.example.facultyweightedaverage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SolveActivity extends AppCompatActivity {

    private final ArrayList<TextView> textViewArrayList = new ArrayList<>();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);
        Bundle bundle = getIntent().getExtras();
        RelativeLayout relativeLayout = findViewById(R.id.solveRelativeLayout);
        int numberOfClasses = bundle.getInt("NUMBER_OF_CLASSES");
        ViewGroup.LayoutParams parameters = relativeLayout.getLayoutParams();
        parameters.height = numberOfClasses * 450;
        relativeLayout.setLayoutParams(parameters);
        Button calculateButton = findViewById(R.id.calculateButton);
        int yCord = 140;

        View.OnClickListener buttonClick = view -> {

            switch (view.getId()) {
                case 21: // prima materie
                    addGrade(0);
                    break;
                case 22:
                    substractGrade(0);
                    break;
                case 23:
                    addWeight(1);
                    break;
                case 24:
                    substractWeight(1);
                    break;


                case 25: // a doua materie
                    addGrade(2);
                    break;
                case 26:
                    substractGrade(2);
                    break;
                case 27:
                    addWeight(3);
                    break;
                case 28:
                    substractWeight(3);
                    break;


                case 29: // a 3-a materie
                    addGrade(4);
                    break;
                case 30:
                    substractGrade(4);
                    break;
                case 31:
                    addWeight(5);
                    break;
                case 32:
                    substractWeight(5);
                    break;


                case 33: // a 4-a materie
                    addGrade(6);
                    break;
                case 34:
                    substractGrade(6);
                    break;
                case 35:
                    addWeight(7);
                    break;
                case 36:
                    substractWeight(7);
                    break;


                case 37: // a 5-a materie
                    addGrade(8);
                    break;
                case 38:
                    substractGrade(8);
                    break;
                case 39:
                    addWeight(9);
                    break;
                case 40:
                    substractWeight(9);
                    break;


                case 41: // a 6-a materie
                    addGrade(10);
                    break;
                case 42:
                    substractGrade(10);
                    break;
                case 43:
                    addWeight(11);
                    break;
                case 44:
                    substractWeight(11);
                    break;


                case 45: // a 7-a materie
                    addGrade(12);
                    break;
                case 46:
                    substractGrade(12);
                    break;
                case 47:
                    addWeight(13);
                    break;
                case 48:
                    substractWeight(13);
                    break;


                case 49: // a 8-a materie
                    addGrade(14);
                    break;
                case 50:
                    substractGrade(14);
                    break;
                case 51:
                    addWeight(15);
                    break;
                case 52:
                    substractWeight(15);
                    break;


                case 53: // a 9-a materie
                    addGrade(16);
                    break;
                case 54:
                    substractGrade(16);
                    break;
                case 55:
                    addWeight(17);
                    break;
                case 56:
                    substractWeight(17);
                    break;


                case 57: // a 10-a materie
                    addGrade(18);
                    break;
                case 58:
                    substractGrade(18);
                    break;
                case 59:
                    addWeight(19);
                    break;
                case 60:
                    substractWeight(19);
                    break;


                case 61: // a 11-a materie
                    addGrade(20);
                    break;
                case 62:
                    substractGrade(20);
                    break;
                case 63:
                    addWeight(21);
                    break;
                case 64:
                    substractWeight(21);
                    break;


                case 65: // a 12-a materie
                    addGrade(22);
                    break;
                case 66:
                    substractGrade(22);
                    break;
                case 67:
                    addWeight(23);
                    break;
                case 68:
                    substractWeight(23);
                    break;


                case 69: // a 13-a materie
                    addGrade(24);
                    break;
                case 70:
                    substractGrade(24);
                    break;
                case 71:
                    addWeight(25);
                    break;
                case 72:
                    substractWeight(25);
                    break;


                case 73: // a 14-a materie
                    addGrade(26);
                    break;
                case 74:
                    substractGrade(26);
                    break;
                case 75:
                    addWeight(27);
                    break;
                case 76:
                    substractWeight(27);
                    break;


                case 77: // a 15-a materie
                    addGrade(28);
                    break;
                case 78:
                    substractGrade(28);
                    break;
                case 79:
                    addWeight(29);
                    break;
                case 80:
                    substractWeight(29);
                    break;


                case 81: // a 16-a materie
                    addGrade(30);
                    break;
                case 82:
                    substractGrade(30);
                    break;
                case 83:
                    addWeight(31);
                    break;
                case 84:
                    substractWeight(31);
                    break;


                case 85: // a 17-a materie
                    addGrade(32);
                    break;
                case 86:
                    substractGrade(32);
                    break;
                case 87:
                    addWeight(33);
                    break;
                case 88:
                    substractWeight(33);
                    break;


                case 89: // a 18-a materie
                    addGrade(34);
                    break;
                case 90:
                    substractGrade(34);
                    break;
                case 91:
                    addWeight(35);
                    break;
                case 92:
                    substractWeight(35);
                    break;


                case 93: // a 19-a materie
                    addGrade(36);
                    break;
                case 94:
                    substractGrade(36);
                    break;
                case 95:
                    addWeight(37);
                    break;
                case 96:
                    substractWeight(37);
                    break;


                case 97: // a 20-a materie
                    addGrade(38);
                    break;
                case 98:
                    substractGrade(38);
                    break;
                case 99:
                    addWeight(39);
                    break;
                case 100:
                    substractWeight(39);
                    break;
                default:
                    break;
            }
        };

        for (int i = 0; i < numberOfClasses; i++) {
            int textViewBackground = R.drawable.textview_background_rounded_lightgrey;
            EditText nameEditText = createEditText(yCord + 15, "Materia " + (i + 1), textViewBackground, new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
            TextView gradeTextView = createTextView(480, yCord + 15, "5", textViewBackground, new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));

            TextView weightTextView = createTextView(650, yCord + 15, "1", textViewBackground, new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));

            textViewArrayList.add(gradeTextView);
            textViewArrayList.add(weightTextView);

            relativeLayout.addView(gradeTextView);
            relativeLayout.addView(nameEditText);
            relativeLayout.addView(weightTextView);

            yCord += 430;
        }

        yCord = 20;
        int buttonId = 21;
        int buttonBackground = R.drawable.button_background_rounded_orange_bluestroke;
        for (int i = 0; i < numberOfClasses; i++) {

            Button plusGradeButton = createButton(buttonId, buttonClick, 480, yCord, "+", buttonBackground, new RelativeLayout.LayoutParams(150, 120));
            buttonId++;
            Button minusGradeButton = createButton(buttonId, buttonClick, 480, yCord + 270, "-", buttonBackground, new RelativeLayout.LayoutParams(150, 120));
            buttonId++;
            Button plusWeightButton = createButton(buttonId, buttonClick, 650, yCord, "+", buttonBackground, new RelativeLayout.LayoutParams(150, 120));
            buttonId++;
            Button minusWeightButton = createButton(buttonId, buttonClick, 650, yCord + 270, "-", buttonBackground, new RelativeLayout.LayoutParams(150, 120));
            buttonId++;

            relativeLayout.addView(plusGradeButton);
            relativeLayout.addView(minusGradeButton);
            relativeLayout.addView(plusWeightButton);
            relativeLayout.addView(minusWeightButton);

            yCord += 430;
        }

        calculateButton.setOnClickListener(v -> {
            ArrayList<Double> gradesList = new ArrayList<>();
            ArrayList<Double> weightsList = new ArrayList<>();
            double weightSum = 0;
            double gradeWeightSum = 0;

            for(int i = 0 ; i < textViewArrayList.size();i=i+2){
                double aux = Double.parseDouble(textViewArrayList.get(i).getText().toString());
                gradesList.add(aux);
            }

            for(int i = 1 ; i < textViewArrayList.size();i=i+2){
                double aux = Double.parseDouble(textViewArrayList.get(i).getText().toString());
                weightsList.add(aux);
            }
            for(int i = 0 ; i < gradesList.size() ; i++){
                gradeWeightSum = gradeWeightSum + gradesList.get(i)*weightsList.get(i);
                weightSum = weightSum + weightsList.get(i);
            }
            double finalGrade = gradeWeightSum/weightSum;
            Bundle resultBundle = new Bundle();
            resultBundle.putDouble("RESULT", finalGrade);
            Intent intent = new Intent(SolveActivity.this, ResultActivity.class);
            intent.putExtras(resultBundle);
            startActivity(intent);
        });

    }

    private void addGrade(int indexTextView) {
        if (Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 10)
            Toast.makeText(SolveActivity.this, "The maximum grade is 10", Toast.LENGTH_SHORT).show();
        else
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) + 1));
    }

    private void substractGrade(int indexTextView) {
        if (Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 5)
            Toast.makeText(SolveActivity.this, "The minimum grade is 5", Toast.LENGTH_SHORT).show();
        else
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) - 1));
    }

    private void addWeight(int indexTextView) {
        textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) + 1));
    }

    private void substractWeight(int indexTextView) {
        if (Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 1)
            Toast.makeText(SolveActivity.this, "The minimum amount of points is 1", Toast.LENGTH_SHORT).show();
        else
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) - 1));
    }

    private Button createButton(int id, View.OnClickListener buttonClick, float xCoord, float yCoord,
                                String text, int background,
                                RelativeLayout.LayoutParams layoutParams) {
        Button button = new Button(this);
        button.setId(id);
        button.setOnClickListener(buttonClick);
        button.setX(xCoord);
        button.setY(yCoord);
        button.setText(text);
        button.setTextSize((float) 20);
        button.setPadding(10,10,10,10);
        button.setBackgroundResource(background);
        button.setLayoutParams(layoutParams);

        return button;
    }

    private TextView createTextView(float xCoord, float yCoord, String text, int background, RelativeLayout.LayoutParams params) {

        TextView textView = new TextView(this);
        textView.setHeight(120);
        textView.setWidth(150);
        textView.setX(xCoord);
        textView.setY(yCoord);
        textView.setText(text);
        textView.setTextSize((float) 20);
        textView.setTextColor(Color.parseColor("#000000"));
        textView.setGravity(Gravity.CENTER);
        textView.setBackgroundResource(background);
        textView.setLayoutParams(params);

        return textView;
    }

    private EditText createEditText(float yCoord, String hintText, int background, RelativeLayout.LayoutParams params) {

        EditText editText = new EditText(this);
        editText.setHeight(120);
        editText.setWidth(400);
        editText.setX((float) 60);
        editText.setY(yCoord);
        editText.setHint(hintText);
        editText.setHintTextColor(Color.parseColor("#000000"));
        editText.setTextSize((float) 20);
        editText.setTextColor(Color.parseColor("#000000"));
        editText.setPadding(50,10,10,10);
        editText.setBackgroundResource(background);
        editText.setLayoutParams(params);

        return editText;
    }
}