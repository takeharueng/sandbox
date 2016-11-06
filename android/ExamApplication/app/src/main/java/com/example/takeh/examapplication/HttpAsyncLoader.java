package com.example.takeh.examapplication;

import android.content.Context;

/**
 * Created by takeh on 2016/11/06.
 */

public class HttpAsyncLoader {

    private String url = null; // WebAPIのURL

    public HttpAsyncLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    public String loadInBackground() {
        // ここでWebAPIの呼び出し（HTTP通信）を行う
        return null;
    }


}
