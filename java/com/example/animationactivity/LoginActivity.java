package com.example.animationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btn_registernow;
    private Button btn_forgotpassword;
    private Button btn_login2;

    private EditText email;
    private EditText pass;

    DBHelper DB;

    CheckBox checkBox_remember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*
        //checkbox remember me
        SharedPreferences preferences = getSharedPreferences("checkbox" , MODE_PRIVATE);
        String checkbox = preferences.getString("remember","");
        if(checkbox.equals("true"))
        {
            Intent intent =new Intent(LoginActivity.this,HomecoursesActivity.class);
            startActivity(intent);
        }
        else if (checkbox.equals("false"))
        {
            Toast.makeText(LoginActivity.this,"Please sign in",Toast.LENGTH_LONG).show();
        }*/

        DB = new DBHelper(this);

        email=(EditText)findViewById(R.id.login_email);
        pass=(EditText)findViewById(R.id.login_password);

        //go to register page
        btn_registernow=(Button)findViewById(R.id.btn_registernow);
        btn_registernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,CreateaccountActivity.class);
                startActivity(i);
            }
        });


        //go to Home Courses page
        btn_login2=(Button)findViewById(R.id.btn_login2);

        //welcome to kid code sound
        //final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.welcometokidcode);
                   btn_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = email.getText().toString();
                String password = pass.getText().toString();

                // database login
                if(email.getText().toString().trim().length()==0 ||pass.getText().toString().trim().length()==0)
                    Toast.makeText(LoginActivity.this,R.string.enterallfields,Toast.LENGTH_LONG).show();
                else{
                    Boolean checkuserpass=DB.checkusernamepassword(user,password);
                    if(checkuserpass==true){
                        Toast.makeText(LoginActivity.this, R.string.signinsuccessfully,Toast.LENGTH_LONG).show();
                        Intent intent =new Intent(getApplicationContext(),HomecoursesActivity.class);
                        startActivity(intent);

                        //start sound "welcome to kid code"
                        //mediaPlayer.start();
                        email.setText("");
                        pass.setText("");
                    }
                    else {
                        Toast.makeText(LoginActivity.this, R.string.noinformation, Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

                   /*
        //Remember me button
        checkBox_remember = (CheckBox)findViewById(R.id.checkBox_remember);
        checkBox_remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                {
                    SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("checkBox_remember","true");
                    editor.apply();
                    Toast.makeText(LoginActivity.this,"checked",Toast.LENGTH_LONG).show();
                }
                else if (! compoundButton.isChecked())
                {
                    SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("checkBox_remember","false");
                    editor.apply();
                    Toast.makeText(LoginActivity.this,"unchecked",Toast.LENGTH_LONG).show();
                }
            }
        });*/
    }

}