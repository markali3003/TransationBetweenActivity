package com.harch.transationbetweenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goTo3(View view) {
        startActivity(new Intent(this,MainActivity3.class));
        // overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }



    @Override
    public void finish() {
        super.finish();
        Toast.makeText(this,"finish",Toast.LENGTH_LONG).show();
      //  overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}