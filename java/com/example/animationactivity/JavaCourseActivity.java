package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JavaCourseActivity extends AppCompatActivity {

    Button java_lesson1;
    Button java_lesson2;
    Button java_lesson3;
    Button java_lesson4;
    Button java_lesson5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_course);

        //java lesson 1
        java_lesson1 = (Button)findViewById(R.id.btn_java_lesson1);
        java_lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JavaCourseActivity.this,JavaCourse_lesson_one_Activity.class);
                startActivity(intent);
            }
        });

        //java lesson 2
        java_lesson2 = (Button)findViewById(R.id.btn_java_lesson2);
        java_lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JavaCourseActivity.this,JavaCourse_lesson_two_Activity.class);
                startActivity(intent);
            }
        });

        //java lesson 3
        java_lesson3 = (Button)findViewById(R.id.btn_java_lesson3);
        java_lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JavaCourseActivity.this,JavaCourse_lesson_three_Activity.class);
                startActivity(intent);
            }
        });

        //java lesson 4
        java_lesson4 = (Button)findViewById(R.id.btn_java_lesson4);
        java_lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JavaCourseActivity.this,JavaCourse_lesson_four_Activity.class);
                startActivity(intent);
            }
        });

        //java lesson 5
        java_lesson5 = (Button)findViewById(R.id.btn_java_lesson5);
        java_lesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JavaCourseActivity.this,JavaCourse_lesson_five_Activity.class);
                startActivity(intent);
            }
        });

    }
}