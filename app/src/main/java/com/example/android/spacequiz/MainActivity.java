package com.example.android.spacequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    EditText inputOne;
    EditText inputTwo;
    RadioButton answer3;
    RadioButton answer3Wrong;
    CheckBox answer4;
    CheckBox answer4Wrong;
    EditText inputFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View v) {

        inputOne = findViewById(R.id.input1);
        String answer1 = inputOne.getText().toString();
        inputTwo = findViewById(R.id.input2);
        String answer2 = inputTwo.getText().toString();
        answer3 = findViewById(R.id.radioButton4);
        answer3Wrong = findViewById(R.id.radioButton5);
        answer4 = findViewById(R.id.checkBox1);
        answer4Wrong = findViewById(R.id.checkBox2);
        inputFive = findViewById(R.id.input5);
        String answer5 = inputFive.getText().toString();

        if(answer1.equals("andromeda")) {
            score = score + 1;
        }
        if(answer2.equals("8")) {
            score = score + 1;
        }
        if(answer3.isChecked()) {
            score = score + 1;
        }
        if(answer4.isChecked()) {
            score = score + 1;
        }
        if(answer5.equals("earth")) {
            score = score + 1;
        }

        display();
        score = 0;
    }

    public void reset(View v) {

        inputOne.setText("");
        inputTwo.setText("");
        answer3.setChecked(false);
        answer3Wrong.setChecked(false);
        answer4.setChecked(false);
        answer4Wrong.setChecked(false);
        inputFive.setText("");
        score = 0;
        display();
    }

    private void display(){
        TextView result = findViewById(R.id.quizResult);
        result.setText(String.valueOf(score));
    }
}