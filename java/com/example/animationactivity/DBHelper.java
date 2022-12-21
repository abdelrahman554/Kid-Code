package com.example.animationactivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String tag = "DBHelper";
    private static final String TABLE_NAME = "users";
    private static final String col1 = "name";
    private static final String col2 = "phone";
    private static final String col3 = "email";
    private static final String col4 = "password";

    public DBHelper(@Nullable Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createtable = "CREATE TABLE " + TABLE_NAME + " (name TEXT PRIMARY KEY , " + col2 + " TEXT ," + col3 + " TEXT, " + col4 + " TEXT)";
        db.execSQL(createtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(String name,String phone,String email,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col1, name);
        contentValues.put(col2, phone);
        contentValues.put(col3, email);
        contentValues.put(col4, password);

        Log.d(tag, "addData: Adding " + name + " to " + contentValues);
        Log.d(tag, "addData: Adding " + phone + " to " + contentValues);
        Log.d(tag, "addData: Adding " + email + " to " + contentValues);
        Log.d(tag, "addData: Adding " + password + " to " + contentValues);

        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result== -1) {
            return false;
        }
        else {
            return true;
        }
    }

    public Cursor getdata(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = " SELECT * FROM " + TABLE_NAME;
        Cursor data = db.rawQuery(query, null);
        return data;
    }

    public Boolean checkusername (String email){
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor cursor = mydb.rawQuery("Select * from users where email = ?",new String[] {email});
        if(cursor.getCount() > 0 )
            return true;
        else
            return false;
    }

    public Boolean checkusernamepassword (String email, String password){
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor cursor = mydb.rawQuery("Select * from users where email = ? and password=?",new String[] {email,password});
        if(cursor.getCount() > 0 )
            return true;
        else
            return false;
    }

}
