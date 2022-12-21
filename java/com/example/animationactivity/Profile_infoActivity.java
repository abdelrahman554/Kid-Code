package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Profile_infoActivity extends AppCompatActivity {

    ImageView imageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_info);

        imageView=(ImageView)findViewById(R.id.imageView);

    }
}