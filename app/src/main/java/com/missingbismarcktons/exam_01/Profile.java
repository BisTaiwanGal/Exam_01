package com.missingbismarcktons.exam_01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Profile");
        setTextBtn1("動作一 : 改變訊息背景顏色");
        setTextBtn2("動作二 : 改變訊息內容");
        getBtn1().setOnClickListener(new View.OnClickListener() {
            private boolean stateChanged = true;
            @Override
            public void onClick(View v) {
                if(stateChanged)
                    changeTvBackgroundColor(R.color.lightBlue);
                else
                    changeTvBackgroundColor(android.R.color.transparent);
                stateChanged = !stateChanged;
            }
        });
        getBtn2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTvContent("好想吃牛排");
            }
        });

    }
    //public int getLayoutResource(){return R.layout.activity_profile;}
}