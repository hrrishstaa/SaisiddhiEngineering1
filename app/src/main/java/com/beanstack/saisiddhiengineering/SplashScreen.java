package com.beanstack.saisiddhiengineering;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=2500;
    ImageView logoview;
    TextView Tv;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        logoview = (ImageView) findViewById(R.id.logoView);
       Tv = (TextView)findViewById(R.id.Tv);
        Tv.startAnimation(animation);
        //logoview.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // going to login activity
                Intent intent = new Intent(SplashScreen.this, Login_page.class);
                startActivity(intent);
                //invoke the SecondActivity.

                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
