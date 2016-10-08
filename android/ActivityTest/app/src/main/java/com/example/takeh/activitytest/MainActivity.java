package com.example.takeh.activitytest;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1( View v){
        Intent intent = new Intent(this, Setting.class);
        startActivity(intent);

    }

    public void onButton2( View v){
        Intent intent = new Intent(this, Gallary.class);
        startActivity(intent);

    }


}
