package com.example.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConnectDB extends SQLiteOpenHelper {

    private SQLiteDatabase db;

    public  ConnectDB(Context Context) {
        super(Context, "school", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table students(id int primary key autoincrement, name varchar(20), surname varchar(20), age int, classroom varchar(20))");
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void read() {

        Cursor c = this.db.query("student", null, null, null, null, null, null);
        Student student = new Student();

        if(c.moveToNext()) {
            student = new Student(c.getString(1),c.getString(2),c.getString(3), c.getInt(4), c.getInt(5));
        }
    }

    public void add(String name, String surname, int age, String classroom) {
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("surname", surname);
        values.put("age", age);
        values.put("classroom", classroom);
        db.insert("school", null, values);
    }

    public void delete(int id) {
        this.getWritableDatabase().update("students", values,"")
    }
}
