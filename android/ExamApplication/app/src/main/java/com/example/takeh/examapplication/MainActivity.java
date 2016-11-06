package com.example.takeh.examapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // アプリ起動時の処理
        Toast.makeText(this,"起動しました", Toast.LENGTH_SHORT).show();

    }

    @Override
    //アプリ終了時の処理
    protected void onDestroy() {
        super.onDestroy();

        // アプリ起動時の処理
        Toast.makeText(this,"＼(^o^)／", Toast.LENGTH_SHORT).show();

    }

    // クリック処理
    public void onBottunlogin( View v){
        Intent intent = new Intent(this,Exeapi.class); // 画面指定
        startActivity(intent);                          //  画面を開く

        // アプリ起動時の処理
        //Toast.makeText(this,"＼(^o^)／", Toast.LENGTH_SHORT).show();

    }

}
