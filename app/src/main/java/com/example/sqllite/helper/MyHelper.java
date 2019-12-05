package com.example.sqllite.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper {
    private static final String db_name = "Dictionary";
    private static final int db_version = 1;
    //table name
    private static final String tblname = "tblWord";
    //    columns
    private static final String wordId = "wordId";
    private static final String wordName = "wordName";
    private static final String wordMeaning = "wordMeaning";


    //    this is constructor
    public MyHelper(@Nullable Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + tblname + " ( " + wordId + " INTEGER PRIMARY KEY AUTOINCREMENT ," + wordName + " TEXT ," + wordMeaning + " TEXT " + ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
