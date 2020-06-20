package com.harch.transationbetweenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
/*

on utilide deux methode
1 avec code in activity.class
2 use style methode




 */

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    @Override
    public void finish() {
        super.finish();
        Toast.makeText(this,"finish",Toast.LENGTH_LONG).show();
        //overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}