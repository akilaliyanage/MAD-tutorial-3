package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private int val1,val2;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private EditText txt1;
    private  EditText txt2;
    private TextView answer;
    private String answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        txt1 = findViewById(R.id.number_one_2_text);
        txt2 = findViewById(R.id.number_two_2_text);
        answer = findViewById(R.id.answer);

        Intent intent = getIntent();
        val1 = Integer.parseInt(intent.getStringExtra("value1"));
        val2 = Integer.parseInt(intent.getStringExtra("value2"));

        txt1.setText(intent.getStringExtra("value1"));
        txt2.setText(intent.getStringExtra("value2"));

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerText = String.valueOf(val1+val2);
                answer.setText(answerText);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerText = String.valueOf(val1 - val2);
                answer.setText(answerText);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerText = String.valueOf(val1 * val2);
                answer.setText(answerText);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerText = String.valueOf(val1 / val2);
                answer.setText(answerText);
            }
        });
    }
}