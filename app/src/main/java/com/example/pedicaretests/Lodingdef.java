package com.example.pedicaretests;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.NoCopySpan;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class Lodingdef extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 60000;

    ProgressBar progressBar;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodingdef);

        prog();
    }

    public void prog(){
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        Timer t =new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                counter++;
                progressBar.setProgress(counter);

                if(counter == 100) {
                    t.cancel();
                    Intent intent = new Intent(Lodingdef.this, MainDef2.class);
                    startActivity(intent);
                }

            };

        };

        t.schedule(tt, 0, 100);

    }

}
