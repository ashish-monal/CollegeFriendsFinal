package com.example.collegefriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplaceScreenActivity extends AppCompatActivity {

    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace_screen);

        //getWindow().setFlags(
               // WindowManager.LayoutParams.FLAG_FULLSCREEN,
               // WindowManager.LayoutParams.FLAG_FULLSCREEN
      //  );
        h.postDelayed(() -> {
            Intent splaceScreen = new Intent(SplaceScreenActivity.this,MainActivity.class);
            startActivity(splaceScreen);
            finish();
        },1500);
    }
}