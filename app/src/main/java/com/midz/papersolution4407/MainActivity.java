package com.midz.papersolution4407;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.midz.papersolution4407.Q1.Question1;
import com.midz.papersolution4407.Q10.Question10;
import com.midz.papersolution4407.Q2.Question2;
import com.midz.papersolution4407.Q3.Question3;
import com.midz.papersolution4407.Q4.Question4;
import com.midz.papersolution4407.Q5.Question5;
import com.midz.papersolution4407.Q6.Question6;
import com.midz.papersolution4407.Q7.Question7;
import com.midz.papersolution4407.Q8.Question8;
import com.midz.papersolution4407.Q9.Question9;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button qno1,qno2,qno3,qno4,qno5,qno6,qno7,qno8,qno9,qno10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    qno1 = findViewById(R.id.qno1);
    qno2 = findViewById(R.id.qno2);
    qno3 = findViewById(R.id.qno3);
    qno4 = findViewById(R.id.qno4);
    qno5 = findViewById(R.id.qno5);
    qno6 = findViewById(R.id.qno6);
    qno7 = findViewById(R.id.qno7);
    qno8 = findViewById(R.id.qno8);
    qno9 = findViewById(R.id.qno9);
    qno10 =findViewById(R.id.qno10);

        qno1.setOnClickListener(this);
        qno2.setOnClickListener(this);
        qno3.setOnClickListener(this);
        qno4.setOnClickListener(this);
        qno5.setOnClickListener(this);
        qno6.setOnClickListener(this);
        qno7.setOnClickListener(this);
        qno8.setOnClickListener(this);
        qno9.setOnClickListener(this);
        qno10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.qno1:
                startActivity(new Intent(MainActivity.this, Question1.class));
                break;
            case R.id.qno2:
                startActivity(new Intent(MainActivity.this, Question2.class));
                break;
            case R.id.qno3:
                startActivity(new Intent(MainActivity.this, Question3.class));
                break;
            case R.id.qno4:
                startActivity(new Intent(MainActivity.this, Question4.class));
                break;
            case R.id.qno5:
                startActivity(new Intent(MainActivity.this, Question5.class));
                break;
            case R.id.qno6:
                startActivity(new Intent(MainActivity.this, Question6.class));
                break;
            case R.id.qno7:
                startActivity(new Intent(MainActivity.this, Question7.class));
                break;
            case R.id.qno8:
                startActivity(new Intent(MainActivity.this, Question8.class));
                break;
            case R.id.qno9:
                startActivity(new Intent(MainActivity.this, Question9.class));
                break;
            case R.id.qno10:
                startActivity(new Intent(MainActivity.this, Question10.class));
                break;

        }
    }}