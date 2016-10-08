package com.example.takeh.getpostalcode;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity implements OnClickListener {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private EditText editText;
    private EditText edittext2;
    private TextView outputtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buttonを設定する
        Button button  = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        // テキストViewを設定する
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView outputtext = (TextView) findViewById(R.id.outputtext);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

    }

    public void onClick(View v) {
        outputtext.setText(editText.getText());

    }

}
