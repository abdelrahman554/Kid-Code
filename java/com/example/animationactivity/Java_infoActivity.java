package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Java_infoActivity extends AppCompatActivity {

    Button btn_java_startcourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_info);

        btn_java_startcourse = (Button)findViewById(R.id.btn_java_startcourse);
        btn_java_startcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Java_infoActivity.this,JavaCourseActivity.class);
                startActivity(intent);
            }
        });

    }
}