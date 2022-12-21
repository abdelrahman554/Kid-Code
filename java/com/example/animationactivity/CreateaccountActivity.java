package com.example.animationactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.IOException;

public class CreateaccountActivity extends AppCompatActivity {



    private TextView emptycheck;

    private EditText name;
    private EditText phone;
    private EditText email;
    private EditText password;
    private EditText con_password;


    private Button btn_createaccount;
    private Button btn_haveanaccount;


    private RadioButton male;
    private RadioButton female;

    // to image chooser
    private ImageView uploadimage;
    private static final int pick_image =1;
    Uri imageuri;

    //database
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);

        name = (EditText)findViewById(R.id.reg_name);
        phone = (EditText)findViewById(R.id.reg_phone);
        email = (EditText)findViewById(R.id.reg_email);
        password = (EditText)findViewById(R.id.reg_password);
        con_password = (EditText)findViewById(R.id.reg_confirmpassword);

        emptycheck = (TextView)findViewById(R.id.emptycheck);

        DB = new DBHelper(this);
        //male button
        male =(RadioButton)findViewById(R.id.rb_btn_male);
        //female button
        female =(RadioButton)findViewById(R.id.rb_btn_female);

        //Create account button in register page
        btn_createaccount=(Button)findViewById(R.id.btn_createaccount);
        btn_createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();
                String Email = email.getText().toString();
                String pass = password.getText().toString();

                if(name.getText().toString().trim().length()==0 || phone.getText().toString().trim().length()==0 || email.getText().toString().trim().length()==0 || password.getText().toString().trim().length()==0 ){
                    emptycheck.setText(R.string.enterallfields);

                    //set timer to remove the massage
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            emptycheck.setText("");
                        }
                    }, 5000 );
                }
                else
                {
                    if( ! password.getText().toString().equals(con_password.getText().toString()))
                    {
                        emptycheck.setText(R.string.geerg);
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                // Do something after 5s = 5000ms
                                emptycheck.setText("");
                            }
                        }, 5000);

                    }
                    else
                    {
                        Boolean checkuser=DB.checkusername(Email);
                        if(checkuser){
                            emptycheck.setText(R.string.user_alreadyexist);
                        }

                        else {
                            Toast.makeText(CreateaccountActivity.this, R.string.Registered_successfully,Toast.LENGTH_LONG).show();

                            String name1 = name.getText().toString();
                            String phone1 = phone.getText().toString();
                            String email1 = email.getText().toString();
                            String password1 = password.getText().toString();

                            adddata(name1, phone1, email1, password1);
                            Intent i = new Intent(CreateaccountActivity.this, HomecoursesActivity.class);
                            startActivity(i);

                            name.setText("");
                            phone.setText("");
                            email.setText("");
                            password.setText("");
                            con_password.setText("");
                    }

                    }
                }
            }
        });

        //have an account button : go to login page
        btn_haveanaccount=(Button)findViewById(R.id.btn_haveanaccount);
        btn_haveanaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateaccountActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

        //to image chooser/////////////////////////////////////////////////////////////////////////////////
        uploadimage =(ImageView)findViewById(R.id.uploadimage);
        uploadimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallery = new Intent();
                gallery.setType("image/*");
                gallery.setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(Intent.createChooser(gallery, "Select Picture"), pick_image);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == pick_image && resultCode == RESULT_OK){
            imageuri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageuri);
                uploadimage.setImageBitmap(bitmap);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void adddata(String name,String phone,String email,String password){
        boolean insertdata = DB.addData(name, phone, email, password);

        if(insertdata){
            toastmessage(getString(R.string.welcome_To_kid_code));
        }
        else{
            toastmessage(getString(R.string.something_went_wronge));
        }
    }

    public void toastmessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

}