package com.example.wang_.busbookv2.data;

import android.content.Context;

public class DBManager implements IDBManager{

    IDBHelper dbHelper;

    public DBManager(Context context) {
        dbHelper = new DBHelper(context);
    }

    @Override
    public void loadDataBase() {
        dbHelper.loadDataBase();
    }
}
