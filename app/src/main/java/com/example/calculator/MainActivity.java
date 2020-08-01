package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnPoint;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        btnClicker();
    }

    private void btnClicker() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              textView.setText(btn1.getText());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn2.getText());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn3.getText());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn4.getText());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn5.getText());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn6.getText());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn7.getText());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn8.getText());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn9.getText());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btn0.getText());
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(btnPoint.getText());
            }
        });
    }

    private void initViews(){
        textView = findViewById(R.id.textView);
        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btnThree);
        btn4 = findViewById(R.id.btnFour);
        btn5 = findViewById(R.id.btnFive);
        btn6 = findViewById(R.id.btnSix);
        btn7 = findViewById(R.id.btnSeven);
        btn8 = findViewById(R.id.btnEith);
        btn9 = findViewById(R.id.btnNine);
        btn0 = findViewById(R.id.btnNull);
        btnPoint = findViewById(R.id.btnPoint);

    }

}