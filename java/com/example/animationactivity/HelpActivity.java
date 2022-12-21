package com.example.animationactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HelpActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setBackground(null);


        bottomNavigationView.setSelectedItemId(R.id.help);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.help:
                        return true;

                    case R.id.Dashboard:
                        startActivity(new Intent(getApplicationContext(),DashboardActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),HomecoursesActivity.class));
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
    }
}