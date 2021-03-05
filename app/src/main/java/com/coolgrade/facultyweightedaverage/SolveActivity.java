package com.coolgrade.facultyweightedaverage;

import android.annotation.SuppressLint;
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
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class SolveActivity extends AppCompatActivity {

    private final ArrayList<TextView> textViewArrayList = new ArrayList<>();
    int counter = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("Shared Preferences", 0);
        boolean isDarkModeActive = preferences.getBoolean("DARK_MODE_STATUS", false);

        ConstraintLayout solvePortraitConstraintLayout = findViewById(R.id.solvePortraitConstraintLayout);
        ConstraintLayout solveLandscapeConstraintLayout = findViewById(R.id.solveLandscapeConstraintLayout);

        int portraitLightMode = R.drawable.solve_activity_portrait_light;
        int portraitDarkMode = R.drawable.solve_activity_portrait_dark_mode;
        int landscapeLightMode = R.drawable.solve_activity_landscape_light;
        int landscapeDarkMode = R.drawable.solve_activity_landscape_dark_mode;

        if (SolveActivity.this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            if (!isDarkModeActive) {
                solvePortraitConstraintLayout.setBackgroundResource(portraitLightMode);
            } else {
                solvePortraitConstraintLayout.setBackgroundResource(portraitDarkMode);
            }
        } else {
            if (!isDarkModeActive) {
                solveLandscapeConstraintLayout.setBackgroundResource(landscapeLightMode);
            } else {
                solveLandscapeConstraintLayout.setBackgroundResource(landscapeDarkMode);
            }
        }

        RelativeLayout relativeLayout = findViewById(R.id.solveRelativeLayout);
        float density = SolveActivity.this.getResources().getDisplayMetrics().density;
        Bundle bundle = getIntent().getExtras();
        int numberOfClasses = bundle.getInt("NUMBER_OF_CLASSES");
        ArrayList<String> classesNamesArrayList = bundle.getStringArrayList("CLASSES_NAMES_ARRAY");

        ViewGroup.LayoutParams parameters = relativeLayout.getLayoutParams();
        parameters.height = numberOfClasses * dpToPx(160); // 430 // 500
        relativeLayout.setLayoutParams(parameters);
        Button calculateButton = findViewById(R.id.calculateButton);
        View.OnClickListener buttonClick = view -> {

            switch (view.getId()) {
                case 21: // prima materie
                    buttonVibrate();
                    addGrade(0);
                    break;
                case 22:
                    buttonVibrate();
                    substractGrade(0);
                    break;
                case 23:
                    buttonVibrate();
                    addWeight(1);
                    break;
                case 24:
                    buttonVibrate();
                    substractWeight(1);
                    break;


                case 25: // a doua materie
                    buttonVibrate();
                    addGrade(2);
                    break;
                case 26:
                    buttonVibrate();
                    substractGrade(2);
                    break;
                case 27:
                    buttonVibrate();
                    addWeight(3);
                    break;
                case 28:
                    buttonVibrate();
                    substractWeight(3);
                    break;


                case 29: // a 3-a materie
                    buttonVibrate();
                    addGrade(4);
                    break;
                case 30:
                    buttonVibrate();
                    substractGrade(4);
                    break;
                case 31:
                    buttonVibrate();
                    addWeight(5);
                    break;
                case 32:
                    buttonVibrate();
                    substractWeight(5);
                    break;


                case 33: // a 4-a materie
                    buttonVibrate();
                    addGrade(6);
                    break;
                case 34:
                    buttonVibrate();
                    substractGrade(6);
                    break;
                case 35:
                    buttonVibrate();
                    addWeight(7);
                    break;
                case 36:
                    buttonVibrate();
                    substractWeight(7);
                    break;


                case 37: // a 5-a materie
                    buttonVibrate();
                    addGrade(8);
                    break;
                case 38:
                    buttonVibrate();
                    substractGrade(8);
                    break;
                case 39:
                    buttonVibrate();
                    addWeight(9);
                    break;
                case 40:
                    buttonVibrate();
                    substractWeight(9);
                    break;


                case 41: // a 6-a materie
                    buttonVibrate();
                    addGrade(10);
                    break;
                case 42:
                    buttonVibrate();
                    substractGrade(10);
                    break;
                case 43:
                    buttonVibrate();
                    addWeight(11);
                    break;
                case 44:
                    buttonVibrate();
                    substractWeight(11);
                    break;


                case 45: // a 7-a materie
                    buttonVibrate();
                    addGrade(12);
                    break;
                case 46:
                    buttonVibrate();
                    substractGrade(12);
                    break;
                case 47:
                    buttonVibrate();
                    addWeight(13);
                    break;
                case 48:
                    buttonVibrate();
                    substractWeight(13);
                    break;


                case 49: // a 8-a materie
                    buttonVibrate();
                    addGrade(14);
                    break;
                case 50:
                    buttonVibrate();
                    substractGrade(14);
                    break;
                case 51:
                    buttonVibrate();
                    addWeight(15);
                    break;
                case 52:
                    buttonVibrate();
                    substractWeight(15);
                    break;


                case 53: // a 9-a materie
                    buttonVibrate();
                    addGrade(16);
                    break;
                case 54:
                    buttonVibrate();
                    substractGrade(16);
                    break;
                case 55:
                    buttonVibrate();
                    addWeight(17);
                    break;
                case 56:
                    buttonVibrate();
                    substractWeight(17);
                    break;


                case 57: // a 10-a materie
                    buttonVibrate();
                    addGrade(18);
                    break;
                case 58:
                    buttonVibrate();
                    substractGrade(18);
                    break;
                case 59:
                    buttonVibrate();
                    addWeight(19);
                    break;
                case 60:
                    buttonVibrate();
                    substractWeight(19);
                    break;


                case 61: // a 11-a materie
                    buttonVibrate();
                    addGrade(20);
                    break;
                case 62:
                    buttonVibrate();
                    substractGrade(20);
                    break;
                case 63:
                    buttonVibrate();
                    addWeight(21);
                    break;
                case 64:
                    buttonVibrate();
                    substractWeight(21);
                    break;


                case 65: // a 12-a materie
                    buttonVibrate();
                    addGrade(22);
                    break;
                case 66:
                    buttonVibrate();
                    substractGrade(22);
                    break;
                case 67:
                    buttonVibrate();
                    addWeight(23);
                    break;
                case 68:
                    buttonVibrate();
                    substractWeight(23);
                    break;


                case 69: // a 13-a materie
                    buttonVibrate();
                    addGrade(24);
                    break;
                case 70:
                    buttonVibrate();
                    substractGrade(24);
                    break;
                case 71:
                    buttonVibrate();
                    addWeight(25);
                    break;
                case 72:
                    buttonVibrate();
                    substractWeight(25);
                    break;


                case 73: // a 14-a materie
                    buttonVibrate();
                    addGrade(26);
                    break;
                case 74:
                    buttonVibrate();
                    substractGrade(26);
                    break;
                case 75:
                    buttonVibrate();
                    addWeight(27);
                    break;
                case 76:
                    buttonVibrate();
                    substractWeight(27);
                    break;


                case 77: // a 15-a materie
                    buttonVibrate();
                    addGrade(28);
                    break;
                case 78:
                    buttonVibrate();
                    substractGrade(28);
                    break;
                case 79:
                    buttonVibrate();
                    addWeight(29);
                    break;
                case 80:
                    buttonVibrate();
                    substractWeight(29);
                    break;


                case 81: // a 16-a materie
                    buttonVibrate();
                    addGrade(30);
                    break;
                case 82:
                    buttonVibrate();
                    substractGrade(30);
                    break;
                case 83:
                    buttonVibrate();
                    addWeight(31);
                    break;
                case 84:
                    buttonVibrate();
                    substractWeight(31);
                    break;


                case 85: // a 17-a materie
                    buttonVibrate();
                    addGrade(32);
                    break;
                case 86:
                    buttonVibrate();
                    substractGrade(32);
                    break;
                case 87:
                    buttonVibrate();
                    addWeight(33);
                    break;
                case 88:
                    buttonVibrate();
                    substractWeight(33);
                    break;


                case 89: // a 18-a materie
                    buttonVibrate();
                    addGrade(34);
                    break;
                case 90:
                    buttonVibrate();
                    substractGrade(34);
                    break;
                case 91:
                    buttonVibrate();
                    addWeight(35);
                    break;
                case 92:
                    buttonVibrate();
                    substractWeight(35);
                    break;


                case 93: // a 19-a materie
                    buttonVibrate();
                    addGrade(36);
                    break;
                case 94:
                    buttonVibrate();
                    substractGrade(36);
                    break;
                case 95:
                    buttonVibrate();
                    addWeight(37);
                    break;
                case 96:
                    buttonVibrate();
                    substractWeight(37);
                    break;

                case 97: // a 20-a materie
                    buttonVibrate();
                    addGrade(38);
                    break;
                case 98:
                    buttonVibrate();
                    substractGrade(38);
                    break;
                case 99:
                    buttonVibrate();
                    addWeight(39);
                    break;
                case 100:
                    buttonVibrate();
                    substractWeight(39);
                    break;
                default:
                    break;
            }
        };

        int yCord = dpToPx(7);
        int textViewBackground = R.drawable.textview_background_rounded_slim_stroke_dark_blue_75;
        int yCoordIncrement = dpToPx(40);
        for (int i = 0; i < numberOfClasses; i++) {
            EditText nameEditText = createEditText(yCord + yCoordIncrement, textViewBackground, new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT), classesNamesArrayList);
            TextView gradeTextView = createTextView(dpToPx(140), yCord + yCoordIncrement, "5", textViewBackground, new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
            // 400
            TextView weightTextView = createTextView(dpToPx(235), yCord + yCoordIncrement, "1", textViewBackground, new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
            // 710
            textViewArrayList.add(gradeTextView);
            textViewArrayList.add(weightTextView);

            relativeLayout.addView(gradeTextView);
            relativeLayout.addView(nameEditText);
            relativeLayout.addView(weightTextView);

            yCord += dpToPx(160); // 430
        }

        yCord = dpToPx(0);
        int buttonId = 21;
        int buttonBackground = R.drawable.button_background_rounded_orange_slim_stroke;
        int widthButtonSize = 70;
        int heightButtonSize = 40;
        int xCoordGradesButton = dpToPx(135); // 340
        int xCoordWeightButton = dpToPx(230); // 650

        for (int i = 0; i < numberOfClasses; i++) {

            Button plusGradeButton = createButton(buttonId, buttonClick, xCoordGradesButton, yCord, "+", buttonBackground, new RelativeLayout.LayoutParams(dpToPx(widthButtonSize), dpToPx(heightButtonSize)));
            buttonId++;
            Button minusGradeButton = createButton(buttonId, buttonClick, xCoordGradesButton, yCord + dpToPx(95), "-", buttonBackground, new RelativeLayout.LayoutParams(dpToPx(widthButtonSize), dpToPx(heightButtonSize)));
            buttonId++;
            Button plusWeightButton = createButton(buttonId, buttonClick, xCoordWeightButton, yCord, "+", buttonBackground, new RelativeLayout.LayoutParams(dpToPx(widthButtonSize), dpToPx(heightButtonSize)));
            buttonId++;
            Button minusWeightButton = createButton(buttonId, buttonClick, xCoordWeightButton, yCord + dpToPx(95), "-", buttonBackground, new RelativeLayout.LayoutParams(dpToPx(widthButtonSize), dpToPx(heightButtonSize))); // 150 120
            buttonId++;

            relativeLayout.addView(plusGradeButton);
            relativeLayout.addView(minusGradeButton);
            relativeLayout.addView(plusWeightButton);
            relativeLayout.addView(minusWeightButton);

            yCord += dpToPx(160); // 430
        }

        calculateButton.setOnClickListener(v -> {
            buttonVibrate();
            ArrayList<Double> gradesList = new ArrayList<>();
            ArrayList<Double> weightsList = new ArrayList<>();
            double weightSum = 0;
            double gradeWeightSum = 0;

            for (int i = 0; i < textViewArrayList.size(); i = i + 2) {
                double aux = Double.parseDouble(textViewArrayList.get(i).getText().toString());
                gradesList.add(aux);
            }

            for (int i = 1; i < textViewArrayList.size(); i = i + 2) {
                double aux = Double.parseDouble(textViewArrayList.get(i).getText().toString());
                weightsList.add(aux);
            }
            for (int i = 0; i < gradesList.size(); i++) {
                gradeWeightSum = gradeWeightSum + gradesList.get(i) * weightsList.get(i);
                weightSum = weightSum + weightsList.get(i);
            }
            double finalGrade = gradeWeightSum / weightSum;
            bundle.putDouble("RESULT", finalGrade);
            bundle.putInt("NUMBER_OF_CLASSES", numberOfClasses);
            bundle.putStringArrayList("CLASSES_NAMES_ARRAY", classesNamesArrayList);
            Intent intent = new Intent(SolveActivity.this, ResultActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

    }

    public int dpToPx(int dp) {
        float density = SolveActivity.this.getResources()
                .getDisplayMetrics()
                .density;
        return Math.round((float) dp * density);
    }

    private void buttonVibrate() {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        int VIBRATE_TIME = 4;
        vibrator.vibrate(VibrationEffect.createOneShot(VIBRATE_TIME, VibrationEffect.DEFAULT_AMPLITUDE));
    }

    private void addGrade(int indexTextView) {
        textViewArrayList.get(indexTextView).setTextColor(Color.parseColor("#FFFFFF"));
        if (Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 10)
            Toast.makeText(SolveActivity.this, "The maximum grade is 10", Toast.LENGTH_SHORT).show();
        else
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) + 1));
    }

    private void substractGrade(int indexTextView) {
        if (Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 5) {
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) - 1));
            textViewArrayList.get(indexTextView).setTextColor(Color.parseColor("#cc0000"));
        } else if (Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 4) {
            Toast.makeText(SolveActivity.this, "The minimum grade is 4", Toast.LENGTH_SHORT).show();
        } else {
            textViewArrayList.get(indexTextView).setTextColor(Color.parseColor("#FFFFFF"));
            textViewArrayList.get(indexTextView).setText(String.valueOf(Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) - 1));
        }

    }

    private void addWeight(int indexTextView) {
        if (Integer.parseInt(textViewArrayList.get(indexTextView).getText().toString()) == 80)
            Toast.makeText(SolveActivity.this, "The maximum amount of points is 80", Toast.LENGTH_SHORT).show();
        else
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
        button.setTextColor(Color.parseColor("#03045E"));
        //button.setPadding(10,10,10,10);
        button.setBackgroundResource(background);
        button.setLayoutParams(layoutParams);

        return button;
    }

    private TextView createTextView(float xCoord, float yCoord, String text, int background, RelativeLayout.LayoutParams params) {
        // int padding = dpToPx(10);
        TextView textView = new TextView(this);
        textView.setHeight(dpToPx(40)); // 120
        textView.setWidth(dpToPx(60));
        textView.setX(xCoord);
        textView.setY(yCoord);
        textView.setText(text);
        textView.setTextSize(dpToPx(7)); // 20 TODO : spTopx
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        //textView.setPadding(padding, 0, padding, 0);
        textView.setGravity(Gravity.CENTER);
        textView.setBackgroundResource(background);
        textView.setLayoutParams(params);

        return textView;
    }

    private EditText createEditText(float yCoord, int background, RelativeLayout.LayoutParams params, ArrayList<String> classesNameArrayList) {

        EditText editText = new EditText(this);
        editText.setHeight(dpToPx(40));
        editText.setWidth(dpToPx(120));
        editText.setX(dpToPx(5));
        editText.setY(yCoord);
        editText.setText(classesNameArrayList.get(counter));
        counter++;
        editText.setFocusable(false);
        editText.setTextSize(dpToPx(7));
        editText.setTextColor(Color.parseColor("#FFFFFF"));
        editText.setGravity(Gravity.CENTER);
        editText.setPadding(0, dpToPx(2), 0, 10);
        // editText.setGravity(Gravity.CENTER);
        editText.setBackgroundResource(background);
        editText.setLayoutParams(params);

        return editText;
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}