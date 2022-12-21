package com.example.animationactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;

public class StartActivity extends AppCompatActivity {

    Button create;
    Button login;
    RadioButton rbenglish, rbarabic;
    RadioGroup rblanguage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        rblanguage = (RadioGroup) findViewById(R.id.rb_language);
        rbenglish = (RadioButton) findViewById(R.id.rb_btn_english);
        rbarabic = (RadioButton) findViewById(R.id.rb_btn_arabic);

        //create account button in start page
        create = (Button) findViewById(R.id.btn_create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StartActivity.this, CreateaccountActivity.class);
                startActivity(i);
            }
        });

        //login button in start page
        login = (Button) findViewById(R.id.btn_login2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        rblanguage.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb_btn_english:
                        String language = "en";
                        setlocale(language);
                        break;
                    case R.id.rb_btn_arabic:
                        setlocale("ar");
                        break;
                }
            }
        });


    }

    private void setlocale(String language) {
        Resources resources = getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = new Locale(language);
        resources.updateConfiguration(configuration, metrics);
        onConfigurationChanged(configuration);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        rbarabic.setText(R.string.arabic);
        rbenglish.setText(R.string.english);
        create.setText(R.string.create_account);
        login.setText(R.string.log_in);
    }


}