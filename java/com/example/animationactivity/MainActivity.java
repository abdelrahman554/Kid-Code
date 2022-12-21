package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.kidcode_logo_male_removebg);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        splash = findViewById(R.id.lottie);
        splash.animate().translationY(1600).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            // This method will be executed once the timer is over
            Intent i = new Intent(MainActivity.this, StartActivity.class);
            startActivity(i);
            finish();
        }
    }, 4000);




    }
}