package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C_infoActivity extends AppCompatActivity {

    Button btn_c_startcourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinfo);

        btn_c_startcourse = (Button)findViewById(R.id.btn_c_startcourse);
        btn_c_startcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C_infoActivity.this,C_CourseActivity.class);
                startActivity(intent);
            }
        });

    }
}