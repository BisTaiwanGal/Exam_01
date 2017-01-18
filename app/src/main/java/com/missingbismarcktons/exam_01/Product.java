package com.missingbismarcktons.exam_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Product extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public int getLayoutResource(){
        return R.layout.activity_product;
    }
}
