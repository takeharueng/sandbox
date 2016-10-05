package com.example.takeh.testbotton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンを設定する
        Button button = (Button)findViewById(R.id.button);

        // テキストViewの設定
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag) {
                    textView.setText("Hello");
                    flag = false;
                }
                else
                {
                    textView.setText("World");
                    flag = true;
                }
            }
        });
    }
}
