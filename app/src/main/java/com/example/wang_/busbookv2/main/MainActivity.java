package com.example.wang_.busbookv2.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wang_.busbookv2.R;

public class MainActivity extends AppCompatActivity implements IVewMain{

    Button button_load;
    IPresenterMain presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterMain(MainActivity.this);
        button_load = findViewById(R.id.button_load);
        button_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               presenter.loadDataBase();

            }
        });



    }
}
