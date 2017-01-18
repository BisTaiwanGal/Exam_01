package com.missingbismarcktons.exam_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Message extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public int getLayoutResource(){
        return R.layout.activity_message;
    }
}
