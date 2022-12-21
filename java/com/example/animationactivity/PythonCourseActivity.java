package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PythonCourseActivity extends AppCompatActivity {

    Button python_lesson1;
    Button python_lesson2;
    Button python_lesson3;
    Button python_lesson4;
    Button python_lesson5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_course);

        //python lesson 1
        python_lesson1 = (Button)findViewById(R.id.btn_py_lesson1);
        python_lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PythonCourseActivity.this,PyCourse_lesson_one_Activity.class);
                startActivity(intent);
            }
        });

        //python lesson 2
        python_lesson2 = (Button)findViewById(R.id.btn_py_lesson2);
        python_lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PythonCourseActivity.this,PyCourse_lesson_two_Activity.class);
                startActivity(intent);
            }
        });

        //python lesson 3
        python_lesson3 = (Button)findViewById(R.id.btn_py_lesson3);
        python_lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PythonCourseActivity.this,PyCourse_lesson_three_Activity.class);
                startActivity(intent);
            }
        });

        //python lesson 4
        python_lesson4 = (Button)findViewById(R.id.btn_py_lesson4);
        python_lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PythonCourseActivity.this,PyCourse_lesson_four_Activity.class);
                startActivity(intent);
            }
        });

        //python lesson 5
        python_lesson5 = (Button)findViewById(R.id.btn_py_lesson5);
        python_lesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PythonCourseActivity.this,PyCourse_lesson_five_Activity.class);
                startActivity(intent);
            }
        });

    }
}