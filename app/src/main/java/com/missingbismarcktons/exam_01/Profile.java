package com.missingbismarcktons.exam_01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends BaseActivity {
    private TextView tv;
    private Button btnAction1, btnAction2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tv = (TextView) findViewById(R.id.tv);
        btnAction1 = (Button) findViewById(R.id.btnAction1);
        btnAction1.setOnClickListener(new View.OnClickListener() {
            private boolean stateChanged = true;
            @Override
            public void onClick(View v) {
                if(stateChanged)
                    changeTvBackgroundColor(tv, R.color.lightBlue);
                else
                    changeTvBackgroundColor(tv, android.R.color.transparent);
                stateChanged = !stateChanged;
            }
        });
        btnAction2 = (Button) findViewById(R.id.btnAction2);
        btnAction2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTvContent(tv, "好想吃牛排");
            }
        });

    }
    public int getLayoutResource(){
        return R.layout.activity_profile;
    }
}