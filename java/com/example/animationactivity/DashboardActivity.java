package com.example.animationactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.io.IOException;

public class DashboardActivity extends AppCompatActivity {

    String python_data_l1;
    String python_data_l2;
    String python_data_l3;
    String python_data_l4;
    String python_data_l5;

    String c_data_l1;
    String c_data_l2;
    String c_data_l3;
    String c_data_l4;
    String c_data_l5;

    String java_data_l1;
    String java_data_l2;
    String java_data_l3;
    String java_data_l4;
    String java_data_l5;


    BottomNavigationView bottomNavigationView;

    ProgressBar c_progressbar;
    ProgressBar java_progressbar;
    ProgressBar python_progressbar;

    View v_python;
    View v_c;
    View v_java;

    TextView tv_python;
    TextView tv_java;
    TextView tv_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        //get data from Quizzes




        tv_python =(TextView)findViewById(R.id.tv_python);
        tv_java =(TextView)findViewById(R.id.tv_java);
        tv_c =(TextView)findViewById(R.id.tv_c);


        v_python =(View)findViewById(R.id.v_python);
        v_c =(View)findViewById(R.id.v_c);
        v_java =(View)findViewById(R.id.v_java);

        c_progressbar =(ProgressBar)findViewById(R.id.c_progressbar);
        java_progressbar =(ProgressBar)findViewById(R.id.java_progressbar);
        python_progressbar =(ProgressBar)findViewById(R.id.python_progressbar);



        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setBackground(null);

        bottomNavigationView.setSelectedItemId(R.id.Dashboard);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Dashboard:
                        return true;

                    case R.id.help:
                        startActivity(new Intent(getApplicationContext(),HelpActivity.class));
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




        try {
            recievedata_py_l1();
            recievedata_py_l2();
            recievedata_py_l3();
            recievedata_py_l4();
            recievedata_py_l5();

        }catch (Exception e){
            System.out.println(e);
        }


        try {
            recievedata_java_l1();
            recievedata_java_l2();
            recievedata_java_l3();
            recievedata_java_l4();
            recievedata_java_l5();


        }catch (Exception e){
            System.out.println(e);
        }

        try {
            recievedata_c_l1();
            recievedata_c_l2();
            recievedata_c_l3();
            recievedata_c_l4();
            recievedata_c_l5();


        }catch (Exception e){
            System.out.println(e);
        }







    }

    //receive data from python lessons
    public void recievedata_py_l1(){
        python_data_l1=PyCourse_lesson_one_Activity.getActivityInstance().getData();
        if(python_data_l1.equals(" 3")) {
            python_progressbar.setProgress(20);
        }
        else if (python_data_l1.equals("")){
            python_progressbar.setProgress(0);
        }
    }

    public void recievedata_py_l2(){
        python_data_l2=PyCourse_lesson_two_Activity.getActivityInstance().getData();
        if(python_data_l2.equals(" 3")) {
            python_progressbar.setProgress(40);
        }
        else if (python_data_l2.equals("")){
            python_progressbar.setProgress(20);
        }
    }
    public void recievedata_py_l3(){
        python_data_l3=PyCourse_lesson_three_Activity.getActivityInstance().getData();
        if(python_data_l3.equals(" 3")) {
            python_progressbar.setProgress(60);
        }
        else if (python_data_l3.equals("")){
            python_progressbar.setProgress(40);
        }
    }
    public void recievedata_py_l4(){
        python_data_l4=PyCourse_lesson_four_Activity.getActivityInstance().getData();
        if(python_data_l4.equals(" 3")) {
            python_progressbar.setProgress(80);
        }
        else if (python_data_l4.equals("")){
            python_progressbar.setProgress(60);
        }
    }
    public void recievedata_py_l5(){
        python_data_l5=PyCourse_lesson_five_Activity.getActivityInstance().getData();
        if(python_data_l5.equals(" 3")) {
            python_progressbar.setProgress(100);
        }
        else if (python_data_l5.equals("")){
            python_progressbar.setProgress(80);
        }
    }

    //receive data from java lessons
    public void recievedata_java_l1(){
        java_data_l1=JavaCourse_lesson_one_Activity.getActivityInstance().getData();
        if(java_data_l1.equals(" 3")) {
            java_progressbar.setProgress(20);
        }
        else if (java_data_l1.equals("")){
            java_progressbar.setProgress(0);
        }
    }

    public void recievedata_java_l2(){
        java_data_l2=JavaCourse_lesson_two_Activity.getActivityInstance().getData();
        if(java_data_l2.equals(" 3")) {
            java_progressbar.setProgress(40);
        }
        else if (java_data_l2.equals("")){
            java_progressbar.setProgress(20);
        }
    }
    public void recievedata_java_l3(){
        java_data_l3=JavaCourse_lesson_three_Activity.getActivityInstance().getData();
        if(java_data_l3.equals(" 3")) {
            java_progressbar.setProgress(60);
        }
        else if (java_data_l3.equals("")){
            java_progressbar.setProgress(40);
        }
    }
    public void recievedata_java_l4(){
        java_data_l4=JavaCourse_lesson_four_Activity.getActivityInstance().getData();
        if(java_data_l4.equals(" 3")) {
            java_progressbar.setProgress(80);
        }
        else if (java_data_l4.equals("")){
            java_progressbar.setProgress(60);
        }
    }
    public void recievedata_java_l5(){
        java_data_l5=JavaCourse_lesson_five_Activity.getActivityInstance().getData();
        if(java_data_l5.equals(" 3")) {
            java_progressbar.setProgress(100);
        }
        else if (java_data_l5.equals("")){
            java_progressbar.setProgress(80);
        }
    }

    //receive data from C++ lessons
    public void recievedata_c_l1(){
        c_data_l1=C_Course_lesson_one_Activity.getActivityInstance().getData();
        if(c_data_l1.equals(" 3")) {
            c_progressbar.setProgress(20);
        }
        else if (c_data_l1.equals("")){
            c_progressbar.setProgress(0);
        }
    }

    public void recievedata_c_l2(){
        c_data_l2=C_Course_lesson_two_Activity.getActivityInstance().getData();
        if(c_data_l2.equals(" 3")) {
            c_progressbar.setProgress(40);
        }
        else if (c_data_l2.equals("")){
            c_progressbar.setProgress(20);
        }
    }
    public void recievedata_c_l3(){
        c_data_l3=C_Course_lesson_three_Activity.getActivityInstance().getData();
        if(c_data_l3.equals(" 3")) {
            c_progressbar.setProgress(60);
        }
        else if (c_data_l3.equals("")){
            c_progressbar.setProgress(40);
        }
    }
    public void recievedata_c_l4(){
        c_data_l4=C_Course_lesson_four_Activity.getActivityInstance().getData();
        if(c_data_l4.equals(" 3")) {
            c_progressbar.setProgress(80);
        }
        else if (c_data_l4.equals("")){
            c_progressbar.setProgress(60);
        }
    }
    public void recievedata_c_l5(){
        c_data_l5= C_Course_lesson_four_Activity.getActivityInstance().getData();
        if(c_data_l5.equals(" 3")) {
            c_progressbar.setProgress(100);
        }
        else if (c_data_l5.equals("")){
            c_progressbar.setProgress(80);
        }
    }

}