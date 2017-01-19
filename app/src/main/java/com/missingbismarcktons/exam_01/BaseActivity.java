package com.missingbismarcktons.exam_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.FragmentManager;
import android.view.MenuItem;

import android.app.AlertDialog;
import android.widget.Toast;


public abstract class BaseActivity extends AppCompatActivity {
    //private Toolbar toolbar;
    private TextView tv;
    private Button btnAction1, btnAction2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        //configureToolbar();

        //Enable or disable the "home" button in the corner of the action bar.
        // ***** Ummm.. looks like this doesn't matter???????????????????????
        getSupportActionBar().setHomeButtonEnabled(false);

        //true to show the user that selecting home will return one level up rather than to the top level of the app.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv = (TextView) findViewById(R.id.tv);
        btnAction1 = (Button) findViewById(R.id.btnAction1);
        btnAction2 = (Button) findViewById(R.id.btnAction2);
    }
    // 本來用這個abstract method 然後在那三個一樣的class裡return各自layout
    // 現在改成用一個layout就不需要了
    // protected abstract int getLayoutResource();

    /*private void configureToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }*/
    public void setTextBtn1(String s){
        btnAction1.setText(s);
    }
    public void setTextBtn2(String s){
        btnAction2.setText(s);
    }
    public Button getBtn1(){
        return btnAction1;
    }
    public Button getBtn2(){
        return btnAction2;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            /*
            ==== Below does work, too. ====
            BaseActivity.this.finish();
            */
            onBackPressed();  //return true;
        }
        return super.onOptionsItemSelected(item);
        /*
        ==== Below does work, too. ====
        switch (item.getItemId()) {
            case android.R.id.home:
                FragmentManager fm = getSupportFragmentManager();
                if (fm != null && fm.getBackStackEntryCount() > 0) {
                    fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                } else {
                    finish();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/
    }

    public void changeTvBackgroundColor(int color){
        tv.setBackgroundResource(color);
    }
    public void changeTvContent(String s){
        tv.setText(s);
    }
    public void alertDialog(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message)
                .setNegativeButton("確認", null);

        AlertDialog dialog = builder.create();
        dialog.getWindow().getAttributes().windowAnimations = 2;//fade in & out
        dialog.show();
    }


    public void toast (String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}