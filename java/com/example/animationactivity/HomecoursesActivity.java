package com.example.animationactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class HomecoursesActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    //buttons
    Button btn_Introduction_info ;
    Button btn_Python_info ;
    Button btn_java_info ;
    Button btn_C_info ;
    FloatingActionButton btn_profile_info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homecourses);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setBackground(null);

        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        return true;

                    case R.id.Dashboard:
                        startActivity(new Intent(getApplicationContext(),DashboardActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.help:
                        startActivity(new Intent(getApplicationContext(),HelpActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Settings:
                        startActivity(new Intent(getApplicationContext(),settingsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        //introduction activity
        btn_Introduction_info =(Button)findViewById(R.id.btn_intro_to_programming);
        btn_Introduction_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomecoursesActivity.this,Introduction_infoActivity.class);
                startActivity(intent);
            }
        });

        //python information course activity
        btn_Python_info =(Button)findViewById(R.id.btn_info_python);
        btn_Python_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomecoursesActivity.this,Python_infoActivity.class);
                startActivity(intent);
            }
        });

        //java information course activity
        btn_java_info =(Button)findViewById(R.id.btn_info_java);
        btn_java_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomecoursesActivity.this,Java_infoActivity.class);
                startActivity(intent);
            }
        });

        //C++ information course activity
        btn_C_info =(Button)findViewById(R.id.btn_info_c);
        btn_C_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomecoursesActivity.this,C_infoActivity.class);
                startActivity(intent);
            }
        });

        btn_profile_info=(FloatingActionButton)findViewById(R.id.btn_profile_info);
        btn_profile_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomecoursesActivity.this,Profile_infoActivity.class);
                startActivity(intent);
            }
        });

    }
}