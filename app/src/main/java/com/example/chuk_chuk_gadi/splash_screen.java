package com.example.chuk_chuk_gadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class splash_screen extends AppCompatActivity {

    LottieAnimationView  back ;
    TextView name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        name = findViewById(R.id.name);
        back = findViewById(R.id.back);
//        name.setText("chuk-chuk-gadi");
        name.animate().setDuration(1000).setStartDelay(4000);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        }, 5000);




    }
}