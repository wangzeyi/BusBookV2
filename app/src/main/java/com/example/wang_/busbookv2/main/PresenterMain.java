package com.example.wang_.busbookv2.main;

import com.example.wang_.busbookv2.data.DBManager;
import com.example.wang_.busbookv2.data.IDBManager;

public class PresenterMain implements IPresenterMain{

    IVewMain view;
    IDBManager dbManager;

    public PresenterMain(MainActivity mainActivity) {
        this.view = mainActivity;
        dbManager = new DBManager(mainActivity);

    }


    @Override
    public void loadDataBase() {
        dbManager.loadDataBase();
    }
}
