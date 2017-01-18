package com.missingbismarcktons.exam_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Product extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Product");
        setTextBtn1("動作一 : 顯示alertDialog");
        setTextBtn2("動作二 : 無");
        getBtn1().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog("目前沒有產品", "將於稍後提供服務");
            }
        });
    }

    //public int getLayoutResource(){return R.layout.activity_product;}
}
