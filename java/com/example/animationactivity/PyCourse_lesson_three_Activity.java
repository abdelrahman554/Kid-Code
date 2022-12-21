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

public class PyCourse_lesson_three_Activity extends AppCompatActivity {

    static PyCourse_lesson_three_Activity INSTANCE;
    public TextView usergrade;
    String data;


    Button answer1;
    Button answer2;
    Button answer3;

    Button answer4;
    Button answer5;
    Button answer6;

    Button answer7;
    Button answer8;
    Button answer9;

    Button nextlesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        INSTANCE=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_py_course_lesson_three);

        nextlesson =(Button)findViewById(R.id.btn_next_one_py);
        nextlesson.setEnabled(false);

        //lesson one video from python course
        VideoView videoView = findViewById(R.id.videoView_py1);
        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.kidcode_intro;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);


        usergrade = (TextView)findViewById(R.id.py_L1_usergrade);

        //Answers of question 1
        answer1 =(Button)findViewById(R.id.btn_A1_char_py);
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer1.setBackgroundColor(Color.GREEN);
                answer1.setTextColor(Color.WHITE);
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


                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                if(usergrade.getText().toString().equals(" 3"))
                {
                    nextlesson.setEnabled(true);
                }


            }
        });


        answer2 =(Button)findViewById(R.id.btn_A1_int_py);
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer2.setBackgroundColor(Color.RED);
                answer2.setTextColor(Color.WHITE);
                answer1.setBackgroundColor(Color.GREEN);
                answer1.setTextColor(Color.WHITE);

                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
            }
        });


        answer3 =(Button)findViewById(R.id.btn_A1_string_py);
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer3.setBackgroundColor(Color.RED);
                answer3.setTextColor(Color.WHITE);
                answer1.setBackgroundColor(Color.GREEN);
                answer1.setTextColor(Color.WHITE);

                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);

            }
        });

        //Answers of question 2
        answer4 =(Button)findViewById(R.id.btn_A2_char_py);
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer4.setBackgroundColor(Color.RED);
                answer4.setTextColor(Color.WHITE);
                answer6.setBackgroundColor(Color.GREEN);
                answer6.setTextColor(Color.WHITE);

                answer4.setEnabled(false);
                answer5.setEnabled(false);
                answer6.setEnabled(false);
            }
        });


        answer5 =(Button)findViewById(R.id.btn_A2_int_py);
        answer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer5.setBackgroundColor(Color.RED);
                answer5.setTextColor(Color.WHITE);
                answer6.setBackgroundColor(Color.GREEN);
                answer6.setTextColor(Color.WHITE);

                answer4.setEnabled(false);
                answer5.setEnabled(false);
                answer6.setEnabled(false);
            }
        });


        answer6 =(Button)findViewById(R.id.btn_A2_string_py);
        answer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer6.setBackgroundColor(Color.GREEN);
                answer6.setTextColor(Color.WHITE);
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


                answer4.setEnabled(false);
                answer5.setEnabled(false);
                answer6.setEnabled(false);
                if(usergrade.getText().toString().equals(" 3"))
                {
                    nextlesson.setEnabled(true);
                }


            }
        });


        //Answers of question 3
        answer7 =(Button)findViewById(R.id.btn_A3_char_py);
        answer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer7.setBackgroundColor(Color.RED);
                answer7.setTextColor(Color.WHITE);
                answer8.setBackgroundColor(Color.GREEN);
                answer8.setTextColor(Color.WHITE);

                answer7.setEnabled(false);
                answer8.setEnabled(false);
                answer9.setEnabled(false);
            }
        });


        answer8 =(Button)findViewById(R.id.btn_A3_int_py);
        answer8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer8.setBackgroundColor(Color.GREEN);
                answer8.setTextColor(Color.WHITE);
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




                answer7.setEnabled(false);
                answer8.setEnabled(false);
                answer9.setEnabled(false);
                if(usergrade.getText().toString().equals(" 3"))
                {
                    nextlesson.setEnabled(true);
                }



            }
        });


        answer9 =(Button)findViewById(R.id.btn_A3_string_py);
        answer9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer9.setBackgroundColor(Color.RED);
                answer9.setTextColor(Color.WHITE);
                answer8.setBackgroundColor(Color.GREEN);
                answer8.setTextColor(Color.WHITE);

                answer7.setEnabled(false);
                answer8.setEnabled(false);
                answer9.setEnabled(false);


            }
        });




        //next button : from lesson 1 to lesson 2


        nextlesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= usergrade.getText().toString();
                Intent intent = new Intent(PyCourse_lesson_three_Activity.this,PyCourse_lesson_four_Activity.class);
                startActivity(intent);
            }
        });

    }
    public void toastmessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }


    public static PyCourse_lesson_three_Activity getActivityInstance()
    {
        return INSTANCE;
    }

    public String getData()
    {
        return this.data;
    }

}