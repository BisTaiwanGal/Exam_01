package com.missingbismarcktons.exam_01;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;

public class MainActivity extends BaseActivity{
    private Button btnProfile;
    private Button btnProduct;
    private Button btnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfile = (Button) findViewById(R.id.btnProfile);
        btnProduct = (Button) findViewById(R.id.btnProduct);
        btnMessage = (Button) findViewById(R.id.btnMessage);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Profile.class);
                startActivity(i);
            }
        });
        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Product.class);
                startActivity(i);
            }
        });
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Message.class);
                startActivity(i);
            }
        });

        Intent intent = this.getIntent();
        setTitle(intent.getStringExtra("id"));
    }
    public int getLayoutResource(){
        return R.layout.activity_main;
    }
}