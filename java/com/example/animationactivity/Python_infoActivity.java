package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Python_infoActivity extends AppCompatActivity {

    Button btn_python_startcourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_info);

        btn_python_startcourse = (Button)findViewById(R.id.btn_python_startcourse);
        btn_python_startcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Python_infoActivity.this,PythonCourseActivity.class);
                startActivity(intent);
            }
        });
    }
}