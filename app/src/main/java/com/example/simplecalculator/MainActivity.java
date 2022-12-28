package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView answer;
    Button plusbtn, minesbtn, timesbtn, fractionbtn, clearbtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        answer = findViewById(R.id.answer);
        plusbtn = findViewById(R.id.plusbtn);
        minesbtn = findViewById(R.id.minesbtn);
        timesbtn = findViewById(R.id.timesbtn);
        fractionbtn = findViewById(R.id.fractionbtn);
        clearbtn = findViewById(R.id.clearbtn);


        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty()) {
                    num1 = "0";
                }
                if (num2.isEmpty()) {
                    num2 = "0";
                }

                float num1float = Float.parseFloat(num1);
                float num2float = Float.parseFloat(num2);

                answer.setText(String.valueOf(num1float + num2float));

            }
        });

        minesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty()) {
                    num1 = "0";
                }
                if (num2.isEmpty()) {
                    num2 = "0";
                }

                float num1float = Float.parseFloat(num1);
                float num2float = Float.parseFloat(num2);

                answer.setText(String.valueOf(num1float - num2float));

            }
        });

        timesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty()) {
                    num1 = "0";
                }
                if (num2.isEmpty()) {
                    num2 = "0";
                }

                float num1float = Float.parseFloat(num1);
                float num2float = Float.parseFloat(num2);

                answer.setText(String.valueOf(num1float * num2float));

            }
        });

        fractionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty()) {
                    num1 = "0";
                }
                if (num2.isEmpty()) {
                    num2 = "0";
                }

                float num1float = Float.parseFloat(num1);
                float num2float = Float.parseFloat(num2);

                answer.setText(String.valueOf(num1float / num2float));

            }
        });

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.isEmpty()) {
                    num1 = "0";
                }
                if (num2.isEmpty()) {
                    num2 = "0";
                }

                float num1float = Float.parseFloat(num1);
                float num2float = Float.parseFloat(num2);

                number1.setText("");
                number2.setText("");
                answer.setText("");

            }
        });

    }
}