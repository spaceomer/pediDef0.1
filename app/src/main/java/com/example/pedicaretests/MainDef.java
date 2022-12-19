package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.view.autofill.AutofillValue;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;



public class MainDef extends AppCompatActivity {

    ToggleButton button1;
    Button button2;
    Button button3;
    RadioGroup radr;
    int hirser;
    RadioButton rab;
    boolean tarhis1;
    boolean tarhis2;
    boolean tarhis3;
    boolean mamluz;
    String getTarhis;
    ProgressBar progressBar;
    int counter = 0;
    TextView momlaz;
    boolean ions;
    MediaPlayer mediaPlayer1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_def);

        tarhis1 = false;
        tarhis2 = false;
        tarhis3 = false;
        mamluz = false;
        progressBar = findViewById(R.id.progressBar3);
        button1 = findViewById(R.id.toggleButton);
        button2 = findViewById(R.id.Button99);
        button3 = findViewById(R.id.button20);
        radr = findViewById(R.id.rgs);
        momlaz = findViewById(R.id.textView10);
        mediaPlayer1 = MediaPlayer.create(MainDef.this, R.raw.conectmad);
        Timer timer = new Timer();


        TimerTask timerTask1 = new TimerTask() {
            @Override
            public void run() {
                button3.setBackgroundResource(R.drawable.raondang2);
            }
        };
        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                mediaPlayer1.start();
                button3.setBackgroundResource(R.drawable.raondang);
            }
        };



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.isChecked())
                    button3.setEnabled(true);
                    timer.scheduleAtFixedRate(timerTask1, 500, 1000);
                    timer.scheduleAtFixedRate(timerTask2, 500, 1000);

            };
        });

        //if not powered for 30 sec

        button3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mediaPlayer1.stop();
                timer.cancel();
                button3.setBackgroundResource(R.drawable.raondang);
                Timer timer2 = new Timer();
                TimerTask timerTask4 = new TimerTask() {
                    @Override
                    public void run() {
                        hirser = radr.getCheckedRadioButtonId();
                        rab = findViewById(hirser);
                        getTarhis = (String) rab.getText();

                        if(getTarhis=="תרחיש 1")
                            tarhis1 = true;
                        if(getTarhis=="תרחיש 2")
                            tarhis2 = true;
                        if(getTarhis=="תרחיש 3")
                            tarhis3 = true;
                    }
                };
                timer2.schedule(timerTask4, 0);
                Timer timer3 = new Timer();
                TimerTask tk45 = new TimerTask() {
                    @Override
                    public void run() {
                        momlaz.setText("מומלץ שוק");
                    }
                };
                TimerTask tk46 = new TimerTask() {
                    @Override
                    public void run() {
                        button2.setVisibility(View.INVISIBLE);
                        momlaz.setText("טוען...");
                    }
                };
                TimerTask tk48 = new TimerTask() {
                    @Override
                    public void run() {
                        button2.setVisibility(View.VISIBLE);
                        momlaz.setText("");
                    }
                };

                if(tarhis1 == true)
                    timer3.schedule(tk45, 2000);
                    timer3.schedule(tk46, 2000);
                    timer3.schedule(tk48, 2000);

            }
        });
    }
}