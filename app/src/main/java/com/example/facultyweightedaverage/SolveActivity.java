package com.example.facultyweightedaverage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
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

    private ArrayList<TextView> textViewArrayList = new ArrayList<>();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);
        Bundle bundle = getIntent().getExtras();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.solveRelativeLayout);
        int numberOfClasses = bundle.getInt("NUMBER_OF_CLASSES");
        ViewGroup.LayoutParams parameters = relativeLayout.getLayoutParams();
        parameters.height = numberOfClasses * 450;
        relativeLayout.setLayoutParams(parameters);
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
            EditText nameEditText = new EditText(this);
            TextView gradeTextView = new TextView(this);
            TextView weightTextView = new TextView(this);

            nameEditText.setHeight(120);
            gradeTextView.setHeight(120);
            weightTextView.setHeight(120);

            nameEditText.setWidth(400);
            gradeTextView.setWidth(150);
            weightTextView.setWidth(150);

            nameEditText.setX(60);
            gradeTextView.setX(480);
            weightTextView.setX(650);

            nameEditText.setY(yCord + 15);
            gradeTextView.setY(yCord + 15);
            weightTextView.setY(yCord + 15);

            nameEditText.setHint("Materia " + (i + 1));
            gradeTextView.setText("5");
            weightTextView.setText("1");

            nameEditText.setTextSize(20);
            gradeTextView.setTextSize(20);
            weightTextView.setTextSize(20);

            nameEditText.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            gradeTextView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            weightTextView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

            nameEditText.setBackgroundResource(R.drawable.textview_background_rounded_lightgrey);
            gradeTextView.setBackgroundResource(R.drawable.textview_background_rounded_lightgrey);
            weightTextView.setBackgroundResource(R.drawable.textview_background_rounded_lightgrey);

            nameEditText.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
            gradeTextView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
            weightTextView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));

            textViewArrayList.add(gradeTextView);
            textViewArrayList.add(weightTextView);

            relativeLayout.addView(gradeTextView);
            relativeLayout.addView(nameEditText);
            relativeLayout.addView(weightTextView);

            yCord += 430;
        }
        yCord = 20;
        int buttonId = 21;
        for (int i = 0; i < numberOfClasses; i++) {

            Button plusGradeButton = new Button(this);
            Button minusGradeButton = new Button(this);
            Button plusWeightButton = new Button(this);
            Button minusWeightButton = new Button(this);

            plusGradeButton.setId(buttonId);
            buttonId++;
            minusGradeButton.setId(buttonId);
            buttonId++;
            plusWeightButton.setId(buttonId);
            buttonId++;
            minusWeightButton.setId(buttonId);
            buttonId++;


            plusGradeButton.setOnClickListener(buttonClick);
            minusGradeButton.setOnClickListener(buttonClick);
            plusWeightButton.setOnClickListener(buttonClick);
            minusWeightButton.setOnClickListener(buttonClick);

            plusGradeButton.setX(480);
            minusGradeButton.setX(480);
            plusWeightButton.setX(650);
            minusWeightButton.setX(650);

            plusGradeButton.setY(yCord);
            minusGradeButton.setY(yCord + 270);
            plusWeightButton.setY(yCord);
            minusWeightButton.setY(yCord + 270);

            plusGradeButton.setText("+");
            minusGradeButton.setText("-");
            plusWeightButton.setText("+");
            minusWeightButton.setText("-");

            plusGradeButton.setTextSize(20);
            minusGradeButton.setTextSize(20);
            plusWeightButton.setTextSize(20);
            minusWeightButton.setTextSize(20);

            plusGradeButton.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            minusGradeButton.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            plusWeightButton.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            minusWeightButton.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

            plusGradeButton.setBackgroundResource(R.drawable.button_background_rounded_orange_bluestroke);
            minusGradeButton.setBackgroundResource(R.drawable.button_background_rounded_orange_bluestroke);
            plusWeightButton.setBackgroundResource(R.drawable.button_background_rounded_orange_bluestroke);
            minusWeightButton.setBackgroundResource(R.drawable.button_background_rounded_orange_bluestroke);

            plusGradeButton.setLayoutParams(new RelativeLayout.LayoutParams(150, 120));
            minusGradeButton.setLayoutParams(new RelativeLayout.LayoutParams(150, 120));
            plusWeightButton.setLayoutParams(new RelativeLayout.LayoutParams(150, 120));
            minusWeightButton.setLayoutParams(new RelativeLayout.LayoutParams(150, 120));

            relativeLayout.addView(plusGradeButton);
            relativeLayout.addView(minusGradeButton);
            relativeLayout.addView(plusWeightButton);
            relativeLayout.addView(minusWeightButton);

            yCord += 430;
        }
    }

    private void addGrade (int indexTextView){
        if (Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 10)
            Toast.makeText(SolveActivity.this, "The maximum grade is 10", Toast.LENGTH_SHORT).show();
        else
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) + 1));
    }

    private void substractGrade (int indexTextView){
        if(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 5)
            Toast.makeText(SolveActivity.this, "The minimum grade is 5", Toast.LENGTH_SHORT).show();
        else
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) - 1));
    }

    private void addWeight (int indexTextView){
        textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) + 1));
    }

    private void substractWeight (int indexTextView){
        if(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 1)
            Toast.makeText(SolveActivity.this, "The minimum amount of points is 1", Toast.LENGTH_SHORT).show();
        else
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) - 1));
    }
}