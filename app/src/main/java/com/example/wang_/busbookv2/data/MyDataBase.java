package com.example.wang_.busbookv2.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDataBase extends SQLiteOpenHelper{

    private static final String TEXT_TYPE = " TEXT";
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Contract.Entry.TABLE_NAME + " (" +
                    Contract.Entry._ID + " INTEGER PRIMARY KEY," +
                    Contract.Entry.COLUMN_DATE + TEXT_TYPE + COMMA_SEP +
                    Contract.Entry.COLUMN_TIME + TEXT_TYPE + COMMA_SEP +
                    Contract.Entry.COLUMN_HOME + TEXT_TYPE + COMMA_SEP +
                    Contract.Entry.COLUMN_AWAY + TEXT_TYPE + " )";

    public MyDataBase(Context context) {
        super(context, "BusBookDB", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
