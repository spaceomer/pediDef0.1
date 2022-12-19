package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Timer;
import java.util.TimerTask;


public class MainDef_V2 extends AppCompatActivity {

    ToggleButton toggleButton1;
    RadioGroup radioGroup1;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    Timer timer = new Timer();
    RadioButton testrad;
    ProgressBar pb1;
    Button button2;
    Button button3;
    TextView textView1;
    boolean tarhis1;
    boolean tarhis2;
    boolean tarhis3;
    MediaPlayer mp0;
    MediaPlayer mp01;
    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    MediaPlayer mp5;
    MediaPlayer mp6;
    MediaPlayer mp7;
    MediaPlayer mp8;
    MediaPlayer mp9;
    MediaPlayer mp10;
    int contain;

    //-----------------------------------------------------------------------

    @Override
    protected void onPause() {
        super.onPause();
        mp01.release();
        mp0.release();
        mp1.release();
        mp2.release();
        mp3.release();
        mp4.release();
        mp5.release();
        mp6.release();
        mp7.release();
        mp8.release();
        mp9.release();
        mp10.release();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_def_v2);

        //-----------------------------------------------------------------------
        toggleButton1 = findViewById(R.id.toggleButton3);
        radioGroup1 = findViewById(R.id.rgs2);
        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton5);
        radioButton3 = findViewById(R.id.radioButton6);
        button2 = findViewById(R.id.button25);
        button3 = findViewById(R.id.button24);
        textView1 = findViewById(R.id.textView11);
        mp0 = MediaPlayer.create(MainDef_V2.this, R.raw.presson);
        mp01 = MediaPlayer.create(MainDef_V2.this, R.raw.presstarhis);
        mp1 = MediaPlayer.create(MainDef_V2.this, R.raw.conectmad);
        mp2 = MediaPlayer.create(MainDef_V2.this, R.raw.chackheart);
        mp3 = MediaPlayer.create(MainDef_V2.this, R.raw.recomendshock);
        mp4 = MediaPlayer.create(MainDef_V2.this, R.raw.loadingshock);
        mp5 = MediaPlayer.create(MainDef_V2.this, R.raw.pressshock);
        mp6 = MediaPlayer.create(MainDef_V2.this, R.raw.ggghhhg);
        mp7 = MediaPlayer.create(MainDef_V2.this, R.raw.chargedef);
        mp8 = MediaPlayer.create(MainDef_V2.this, R.raw.shock);
        mp9 = MediaPlayer.create(MainDef_V2.this, R.raw.notrecomendetshock);
        mp10 = MediaPlayer.create(MainDef_V2.this, R.raw.startcpr);
        pb1 = findViewById(R.id.progressBar4);
        tarhis1=false;
        tarhis2=false;
        tarhis3=false;
        //-----------------------------------------------------------------------
        TimerTask tk0 = new TimerTask() {
            @Override
            public void run() {
                if(toggleButton1.isChecked()) {}
                else {
                mp0.start();
                }
            }
        };
        TimerTask tk01 = new TimerTask() {
            @Override
            public void run() {
                toggleButton1.setChecked(false);
                toggleButton1.setBackgroundResource(R.drawable.raondang);
            }
        };
        TimerTask tk101 = new TimerTask() {
            @Override
            public void run() {
                textView1.setText("בודק קצב לב");
                mp2.start();
            }
        };
        TimerTask tk1 = new TimerTask() {
            @Override
            public void run() {
                textView1.setText("ממליץ שוק");
                mp2.stop();
                mp3.start();
            }
        };
        TimerTask tk2 = new TimerTask() {
            @Override
            public void run() {
                textView1.setText("טוען...");
                mp3.stop();
                mp4.start();
            }
        };
        TimerTask tk3 = new TimerTask() {
            @Override
            public void run() {
                contain++;
                pb1.setProgress(contain);
                mp7.start();
            }
        };
        TimerTask tk4 = new TimerTask() {
            @Override
            public void run() {
                textView1.setText("לחץ על שוק");
                pb1.setVisibility(View.INVISIBLE);
                mp5.start();
            }
        };
        TimerTask tk5 = new TimerTask() {
            @Override
            public void run() {
                button2.setBackgroundResource(R.drawable.shockpam2);
                mp5.start();
            }
        };
        TimerTask tk6 = new TimerTask() {
            @Override
            public void run() {
                button2.setBackgroundResource(R.drawable.shockpam);
            }
        };
        TimerTask tk7 = new TimerTask() {
            @Override
            public void run() {
                textView1.setText("לא מומלץ שוק");
                mp9.start();
            }
        };
        TimerTask tk8 = new TimerTask() {
            @Override
            public void run() {
                textView1.setText("התחל בפעולות החייאה");
                mp10.start();
            }
        };
        TimerTask tk9 = new TimerTask() {
            @Override
            public void run() {
                textView1.setText(" ");
                mp6.start();
            }
        };
        TimerTask tk10 = new TimerTask() {
            @Override
            public void run() {
                textView1.setText("בודק קצב לב");
                mp2.start();
            }
        };
        timer.scheduleAtFixedRate(tk0,15000,10000);
        //-----------------------------------------------------------------------
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton1.isChecked() || radioButton2.isChecked() || radioButton3.isChecked()) {
                    if (toggleButton1.isChecked()) {
                        button3.setEnabled(true);
                        mp1.start();
                    } else {
                        mp01.stop();
                        mp0.stop();
                        mp1.stop();
                        mp2.stop();
                        mp3.stop();
                        mp4.stop();
                        mp5.stop();
                        mp6.stop();
                        mp7.stop();
                        mp8.stop();
                        mp9.stop();
                        mp10.stop();
                        Intent intent = new Intent(MainDef_V2.this, MainDef_V2.class);
                        startActivity(intent);
                        timer.cancel();
                    }
                } else {
                    mp01.start();
                    toggleButton1.setBackgroundResource(R.drawable.raondangeror);
                    timer.schedule(tk01,4000);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    button3.setEnabled(false);
                    radioButton1.setEnabled(false);
                    radioButton2.setEnabled(false);
                    radioButton3.setEnabled(false);
                if(radioButton1.isChecked()) {
                    timer.schedule(tk101,1);
                    timer.schedule(tk1,8000);
                    timer.schedule(tk2,12000);
                    timer.schedule(tk3,12000,50);
                    pb1.setVisibility(View.VISIBLE);
                    timer.schedule(tk4,17000);
                    button2.setEnabled(true);
                    timer.scheduleAtFixedRate(tk5,17000,500);
                    timer.scheduleAtFixedRate(tk6,17000,500);

                }
                if(radioButton2.isChecked()) {
                    timer.schedule(tk7, 0);
                    timer.schedule(tk8, 5000);
                    timer.schedule(tk9, 10000);
                    timer.schedule(tk101,125000);
                    timer.schedule(tk1,130000);
                    timer.schedule(tk2,134000);
                    timer.schedule(tk3,138000,50);
                    pb1.setVisibility(View.VISIBLE);
                    timer.schedule(tk4,142000);
                    button2.setEnabled(true);
                    timer.scheduleAtFixedRate(tk5,142000,500);
                    timer.scheduleAtFixedRate(tk6,142000,500);
                }
                if(radioButton3.isChecked()) {
                    timer.schedule(tk101,1);
                    timer.schedule(tk1,8000);
                    timer.schedule(tk2,12000);
                    timer.schedule(tk3,12000,50);
                    pb1.setVisibility(View.VISIBLE);
                    timer.schedule(tk4,17000);
                    button2.setEnabled(true);
                    timer.scheduleAtFixedRate(tk5,17000,500);
                    timer.scheduleAtFixedRate(tk6,17000,500);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.stop();
                timer.cancel();
                Timer timer3 = new Timer();
                TimerTask tk11 = new TimerTask() {
                    @Override
                    public void run() {
                        mp7.stop();
                        mp8.start();
                        textView1.setText(" ");
                        button2.setBackgroundResource(R.drawable.shockpam2);
                    }
                };
                TimerTask tk12 = new TimerTask() {
                    @Override
                    public void run() {
                        mp6.start();
                    }
                };
                TimerTask tk13 = new TimerTask() {
                    @Override
                    public void run() {
                        mp01.stop();
                        mp0.stop();
                        mp1.stop();
                        mp2.stop();
                        mp3.stop();
                        mp4.stop();
                        mp5.stop();
                        mp6.stop();
                        mp7.stop();
                        mp8.stop();
                        mp9.stop();
                        mp10.stop();
                        Intent intent = new Intent(MainDef_V2.this, MainDef_V2.class);
                        startActivity(intent);
                    }
                };
                if(radioButton3.isChecked()) {
                    timer3.schedule(tk11, 1000);
                    timer3.schedule(tk12, 3000);
                    timer3.schedule(tk10,120000);
                    timer3.schedule(tk7, 123000);
                    timer3.schedule(tk8, 126000);
                    timer3.schedule(tk9, 133000);
                } else {
                    timer3.schedule(tk11, 1000);
                    timer3.schedule(tk12, 3000);
                    timer3.schedule(tk13, 120000);
                }


            }
        });
    }




}