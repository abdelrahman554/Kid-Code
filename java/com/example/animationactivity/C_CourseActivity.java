package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C_CourseActivity extends AppCompatActivity {

    Button c_lesson1;
    Button c_lesson2;
    Button c_lesson3;
    Button c_lesson4;
    Button c_lesson5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccourse);

        //c lesson 1
        c_lesson1 = (Button)findViewById(R.id.btn_c_lesson1);
        c_lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(C_CourseActivity.this,C_Course_lesson_one_Activity.class);
                startActivity(intent);
            }
        });

        //c lesson 2
        c_lesson2 = (Button)findViewById(R.id.btn_c_lesson2);
        c_lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(C_CourseActivity.this,C_Course_lesson_two_Activity.class);
                startActivity(intent);
            }
        });

        //c lesson 3
        c_lesson3 = (Button)findViewById(R.id.btn_c_lesson3);
        c_lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(C_CourseActivity.this,C_Course_lesson_three_Activity.class);
                startActivity(intent);
            }
        });

        //c lesson 4
        c_lesson4 = (Button)findViewById(R.id.btn_c_lesson4);
        c_lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(C_CourseActivity.this,C_Course_lesson_four_Activity.class);
                startActivity(intent);
            }
        });

        //c lesson 5
        c_lesson5 = (Button)findViewById(R.id.btn_c_lesson5);
        c_lesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(C_CourseActivity.this,C_Course_lesson_five_Activity.class);
                startActivity(intent);
            }
        });
    }
}