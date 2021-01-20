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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {

        EditText inputOne = findViewById(R.id.input1);
        String answer1 = inputOne.getText().toString();
        EditText editView2 = findViewById(R.id.input2);
        String answer2 = editView2.getText().toString();
        RadioButton answer3 = findViewById(R.id.radioButton4);
        CheckBox answer4 = findViewById(R.id.checkBox1);
        EditText editView5 = findViewById(R.id.input5);
        String answer5 = editView5.getText().toString();

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
    }

    private void display(){
        TextView result = findViewById(R.id.quizResult);
        result.setText(String.valueOf(score));
    }
}