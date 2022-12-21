package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class JavaCourse_lesson_four_Activity extends AppCompatActivity {

    static JavaCourse_lesson_four_Activity INSTANCE;
    public TextView usergrade;
    String data;


    Button answer1_l1;
    Button answer2_l1;
    Button answer3_l1;

    Button answer4_l1;
    Button answer5_l1;
    Button answer6_l1;

    Button answer7_l1;
    Button answer8_l1;
    Button answer9_l1;

    Button nextlesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        INSTANCE=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_course_lesson_four);

        nextlesson =(Button)findViewById(R.id.btn_next_one_py);
        nextlesson.setEnabled(false);

        VideoView videoView = findViewById(R.id.videoView_py1);
        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.kidcode_intro;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        usergrade = (TextView)findViewById(R.id.py_L1_usergrade);

        //Answers of question 1
        answer1_l1 =(Button)findViewById(R.id.btn_A1_char_py);
        answer1_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer1_l1.setBackgroundColor(Color.GREEN);
                answer1_l1.setTextColor(Color.WHITE);
                if(usergrade.getText().toString().equals(""))
                {
                    usergrade.setText(" 1");
                }
                else if(usergrade.getText().toString().equals(" 1"))
                {
                    usergrade.setText(" 2");
                }
                else
                {
                    usergrade.setText(" 3");
                }


                answer1_l1.setEnabled(false);
                answer2_l1.setEnabled(false);
                answer3_l1.setEnabled(false);
                if(usergrade.getText().toString().equals(" 3"))
                {
                    nextlesson.setEnabled(true);
                }


            }
        });


        answer2_l1 =(Button)findViewById(R.id.btn_A1_int_py);
        answer2_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer2_l1.setBackgroundColor(Color.RED);
                answer2_l1.setTextColor(Color.WHITE);
                answer1_l1.setBackgroundColor(Color.GREEN);
                answer1_l1.setTextColor(Color.WHITE);

                answer1_l1.setEnabled(false);
                answer2_l1.setEnabled(false);
                answer3_l1.setEnabled(false);
            }
        });


        answer3_l1 =(Button)findViewById(R.id.btn_A1_string_py);
        answer3_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer3_l1.setBackgroundColor(Color.RED);
                answer3_l1.setTextColor(Color.WHITE);
                answer1_l1.setBackgroundColor(Color.GREEN);
                answer1_l1.setTextColor(Color.WHITE);

                answer1_l1.setEnabled(false);
                answer2_l1.setEnabled(false);
                answer3_l1.setEnabled(false);

            }
        });

        //Answers of question 2
        answer4_l1 =(Button)findViewById(R.id.btn_A2_char_py);
        answer4_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer4_l1.setBackgroundColor(Color.RED);
                answer4_l1.setTextColor(Color.WHITE);
                answer6_l1.setBackgroundColor(Color.GREEN);
                answer6_l1.setTextColor(Color.WHITE);

                answer4_l1.setEnabled(false);
                answer5_l1.setEnabled(false);
                answer6_l1.setEnabled(false);
            }
        });


        answer5_l1 =(Button)findViewById(R.id.btn_A2_int_py);
        answer5_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer5_l1.setBackgroundColor(Color.RED);
                answer5_l1.setTextColor(Color.WHITE);
                answer6_l1.setBackgroundColor(Color.GREEN);
                answer6_l1.setTextColor(Color.WHITE);

                answer4_l1.setEnabled(false);
                answer5_l1.setEnabled(false);
                answer6_l1.setEnabled(false);
            }
        });


        answer6_l1 =(Button)findViewById(R.id.btn_A2_string_py);
        answer6_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer6_l1.setBackgroundColor(Color.GREEN);
                answer6_l1.setTextColor(Color.WHITE);
                if(usergrade.getText().toString().equals(""))
                {
                    usergrade.setText(" 1");
                }
                else if(usergrade.getText().toString().equals(" 1"))
                {
                    usergrade.setText(" 2");
                }
                else
                {
                    usergrade.setText(" 3");
                }


                answer4_l1.setEnabled(false);
                answer5_l1.setEnabled(false);
                answer6_l1.setEnabled(false);
                if(usergrade.getText().toString().equals(" 3"))
                {
                    nextlesson.setEnabled(true);
                }


            }
        });


        //Answers of question 3
        answer7_l1 =(Button)findViewById(R.id.btn_A3_char_py);
        answer7_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer7_l1.setBackgroundColor(Color.RED);
                answer7_l1.setTextColor(Color.WHITE);
                answer8_l1.setBackgroundColor(Color.GREEN);
                answer8_l1.setTextColor(Color.WHITE);

                answer7_l1.setEnabled(false);
                answer8_l1.setEnabled(false);
                answer9_l1.setEnabled(false);
            }
        });


        answer8_l1 =(Button)findViewById(R.id.btn_A3_int_py);
        answer8_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer8_l1.setBackgroundColor(Color.GREEN);
                answer8_l1.setTextColor(Color.WHITE);
                if(usergrade.getText().toString().equals(""))
                {
                    usergrade.setText(" 1");
                }
                else if(usergrade.getText().toString().equals(" 1"))
                {
                    usergrade.setText(" 2");
                }
                else
                {
                    usergrade.setText(" 3");
                }




                answer7_l1.setEnabled(false);
                answer8_l1.setEnabled(false);
                answer9_l1.setEnabled(false);
                if(usergrade.getText().toString().equals(" 3"))
                {
                    nextlesson.setEnabled(true);
                }



            }
        });


        answer9_l1 =(Button)findViewById(R.id.btn_A3_string_py);
        answer9_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer9_l1.setBackgroundColor(Color.RED);
                answer9_l1.setTextColor(Color.WHITE);
                answer8_l1.setBackgroundColor(Color.GREEN);
                answer8_l1.setTextColor(Color.WHITE);

                answer7_l1.setEnabled(false);
                answer8_l1.setEnabled(false);
                answer9_l1.setEnabled(false);


            }
        });




        //next button : from lesson 1 to lesson 2


        nextlesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= usergrade.getText().toString();
                Intent intent = new Intent(JavaCourse_lesson_four_Activity.this,JavaCourse_lesson_five_Activity.class);
                startActivity(intent);
            }
        });

    }
    public void toastmessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }


    public static JavaCourse_lesson_four_Activity getActivityInstance()
    {
        return INSTANCE;
    }

    public String getData()
    {
        return this.data;
    }
}