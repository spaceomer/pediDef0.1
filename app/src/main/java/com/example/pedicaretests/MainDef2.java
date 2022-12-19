package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

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


public class MainDef2 extends AppCompatActivity {

    ToggleButton toggleButton1;
    RadioGroup radioGroup1;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton testrad;
    ProgressBar pb1;
    Button button2;
    Button button3;
    TextView textView1;
    boolean tarhis1;
    boolean tarhis2;
    boolean tarhis3;
    Timer timer = new Timer();
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_def2);

        //-----------------------------------------------------------------------
        toggleButton1 = findViewById(R.id.toggleButton2);
        radioGroup1 = findViewById(R.id.rgs);
        radioButton1 = findViewById(R.id.radioButton2);
        radioButton2 = findViewById(R.id.radioButton3);
        radioButton3 = findViewById(R.id.radioButton4);
        button2 = findViewById(R.id.button23);
        button3 = findViewById(R.id.button18);
        textView1 = findViewById(R.id.textView9);
        mp1 = MediaPlayer.create(MainDef2.this, R.raw.conectmad);
        mp2 = MediaPlayer.create(MainDef2.this, R.raw.chackheart);
        mp3 = MediaPlayer.create(MainDef2.this, R.raw.recomendshock);
        mp4 = MediaPlayer.create(MainDef2.this, R.raw.loadingshock);
        mp5 = MediaPlayer.create(MainDef2.this, R.raw.pressshock);
        mp6 = MediaPlayer.create(MainDef2.this, R.raw.heartbeatsound);
        mp7 = MediaPlayer.create(MainDef2.this, R.raw.chargedef);
        mp8 = MediaPlayer.create(MainDef2.this, R.raw.shock);
        mp9 = MediaPlayer.create(MainDef2.this, R.raw.notrecomendetshock);
        mp10 = MediaPlayer.create(MainDef2.this, R.raw.startcpr);
        pb1 = findViewById(R.id.progressBar2);
        tarhis1=false;
        tarhis2=false;
        tarhis3=false;
        //-----------------------------------------------------------------------

        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggleButton1.isChecked())
                    button3.setEnabled(true);
                    radioButton1.setEnabled(false);
                    radioButton2.setEnabled(false);
                    radioButton3.setEnabled(false);
                   //---------------------------
                    if(radioButton1.isChecked()) {
                        tarhis1 = true;
                    }
                    if(radioButton2.isChecked()) {
                        tarhis2 = true;
                    }
                    if(radioButton3.isChecked()) {
                        tarhis3 = true;
                    }
                //--------------------------
                    TimerTask tk1 = new TimerTask() {
                        @Override
                        public void run() {
                            button3.setBackgroundResource(R.drawable.raondang);
                        }
                    };
                    TimerTask tk2 = new TimerTask() {
                        @Override
                        public void run() {
                            button3.setBackgroundResource(R.drawable.raondang2);
                        }
                    };
                    TimerTask tk3 = new TimerTask() {
                        @Override
                        public void run() {
                            mp1.start();
                        }
                    };
                   //--------------------------
                    if(toggleButton1.isChecked())
                        button3.setEnabled(true);
                        timer.scheduleAtFixedRate(tk1, 200, 1000);
                        timer.scheduleAtFixedRate(tk2, 200, 1000);
                        timer.scheduleAtFixedRate(tk3, 500, 1000);

                   //--------------------------
            }
        });
        Timer timer2 = new Timer();
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setEnabled(false);
                timer.cancel();
                button3.setBackgroundResource(R.drawable.raondang);
                mp1.stop();
                if (tarhis1 == true && tarhis2 == false && tarhis3 == false) {
                    TimerTask tk4 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("ממליץ שוק");
                            mp2.stop();
                            mp3.start();
                        }
                    };
                    TimerTask tk5 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("טוען...");
                            mp3.stop();
                            mp4.start();
                        }
                    };
                    TimerTask tk6 = new TimerTask() {
                        @Override
                        public void run() {
                            contain++;
                            pb1.setProgress(contain);
                            mp7.start();
                        }
                    };
                    TimerTask tk7 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("לחץ על שוק");
                            pb1.setVisibility(View.INVISIBLE);
                            mp5.start();
                        }
                    };
                    TimerTask tk8 = new TimerTask() {
                        @Override
                        public void run() {
                            button2.setBackgroundResource(R.drawable.shockpam2);
                            mp5.start();
                        }
                    };
                    TimerTask tk9 = new TimerTask() {
                        @Override
                        public void run() {
                            button2.setBackgroundResource(R.drawable.shockpam);
                        }
                    };
                    mp2.start();
                    timer2.schedule(tk4, 10000);
                    timer2.schedule(tk5, 15000);
                    timer2.schedule(tk6, 20000, 100);
                    timer2.schedule(tk7, 30000);
                    button2.setEnabled(true);
                    timer2.scheduleAtFixedRate(tk8, 30000, 100);
                    timer2.scheduleAtFixedRate(tk9, 30000, 100);
                }
                if (tarhis1 == false && tarhis2 == true && tarhis3 == false) {
                    TimerTask tkh2 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("לא מומלץ שוק");
                            mp9.start();
                        }
                    };
                    TimerTask tkh3 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("התחל בפעולות החייאה");
                            mp10.start();
                        }
                    };
                    TimerTask tkh31 = new TimerTask() {
                        @Override
                        public void run() {
                            mp6.start();
                        }
                    };
                    TimerTask tkh4 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("בודק קצב לב");
                            mp1.start();
                        }
                    };
                    TimerTask tkh5 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("ממליץ שוק");
                            mp2.stop();
                            mp3.start();
                        }
                    };
                    TimerTask tkh6 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("טוען...");
                            mp3.stop();
                            mp4.start();
                        }
                    };
                    TimerTask tkh7 = new TimerTask() {
                        @Override
                        public void run() {
                            contain++;
                            pb1.setProgress(contain);
                            mp7.start();
                        }
                    };
                    TimerTask tkh8 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("לחץ על שוק");
                            pb1.setVisibility(View.INVISIBLE);
                            mp5.start();
                        }
                    };
                    TimerTask tkh9 = new TimerTask() {
                        @Override
                        public void run() {
                            button2.setBackgroundResource(R.drawable.shockpam2);
                        }
                    };
                    TimerTask tkh10 = new TimerTask() {
                        @Override
                        public void run() {
                            button2.setBackgroundResource(R.drawable.shockpam);
                        }
                    };
                    timer2.schedule(tkh2,5000);
                    timer2.schedule(tkh3,10000);
                    timer2.schedule(tkh31,15000);
                    timer2.schedule(tkh4,120000);
                    mp2.start();
                    timer2.schedule(tkh5, 130000);
                    timer2.schedule(tkh6, 133000);
                    timer2.schedule(tkh7, 138000, 100);
                    timer2.schedule(tkh8, 140000);
                    button2.setEnabled(true);
                    timer2.scheduleAtFixedRate(tkh9,  140000, 100);
                    timer2.scheduleAtFixedRate(tkh10, 140000, 100);
                }
                if (tarhis1 == false && tarhis2 == false && tarhis3 == true) {

                    TimerTask tkh2 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("לא מומלץ שוק");
                            mp9.start();
                        }
                    };
                    TimerTask tkh3 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("התחל בפעולות החייאה");
                            mp10.start();
                        }
                    };
                    TimerTask tkh31 = new TimerTask() {
                        @Override
                        public void run() {
                            mp6.start();
                        }
                    };
                    TimerTask tkh4 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("בודק קצב לב");
                            mp1.start();
                        }
                    };
                    TimerTask tkh5 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("ממליץ שוק");
                            mp2.stop();
                            mp3.start();
                        }
                    };
                    TimerTask tkh6 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("טוען...");
                            mp3.stop();
                            mp4.start();
                        }
                    };
                    TimerTask tkh7 = new TimerTask() {
                        @Override
                        public void run() {
                            contain++;
                            pb1.setProgress(contain);
                            mp7.start();
                        }
                    };
                    TimerTask tkh8 = new TimerTask() {
                        @Override
                        public void run() {
                            textView1.setText("לחץ על שוק");
                            pb1.setVisibility(View.INVISIBLE);
                            mp5.start();
                        }
                    };
                    TimerTask tkh9 = new TimerTask() {
                        @Override
                        public void run() {
                            button2.setBackgroundResource(R.drawable.shockpam2);
                        }
                    };
                    TimerTask tkh10 = new TimerTask() {
                        @Override
                        public void run() {
                            button2.setBackgroundResource(R.drawable.shockpam);
                        }
                    };
                    timer2.schedule(tkh5, 5000);
                    timer2.schedule(tkh6, 10000);
                    timer2.schedule(tkh7, 20000, 100);
                    timer2.schedule(tkh8, 30000);
                    button2.setEnabled(true);
                    timer2.scheduleAtFixedRate(tkh9,  30000, 100);
                    timer2.scheduleAtFixedRate(tkh10, 30000, 100);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mp5.stop();
                            timer2.cancel();
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
                                    toggleButton1.setChecked(false);
                                    timer3.cancel();
                                }
                            };
                            timer3.schedule(tk11, 1000);
                            timer3.schedule(tk12, 3000);
                        }
                    });
                    Timer timer4 = new Timer();
                    timer4.schedule(tkh2,120000);
                    timer4.schedule(tkh3,125000);
                    timer4.schedule(tkh4,130000);
                    mp6.start();
                }
            };

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tarhis3==false) {
                    mp5.stop();
                    timer2.cancel();
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
                            toggleButton1.setChecked(false);
                        }
                    };
                    timer3.schedule(tk11, 1000);
                    timer3.schedule(tk12, 3000);
                    String onoff = toggleButton1.getText().toString();
                    if (1 == 1)
                        if (onoff == "OFF")
                            mp6.stop();
                }
            }

        });
    }




}