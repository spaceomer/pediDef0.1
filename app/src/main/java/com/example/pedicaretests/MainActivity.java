package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, acls1.class);
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.button);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bls1.class);
                startActivity(intent);
            }
        });

        button3 = findViewById(R.id.button12);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, acls2.class);
                startActivity(intent);
            }
        });

        button4 = findViewById(R.id.button11);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pears1.class);
                startActivity(intent);
            }
        });

        button5 = findViewById(R.id.button3);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pals1.class);
                startActivity(intent);
            }
        });

        button6 = findViewById(R.id.button4);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Hovsim1.class);
                startActivity(intent);
            }
        });

        button7 = findViewById(R.id.button8);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pals2.class);
                startActivity(intent);
            }
        });

        button8 = findViewById(R.id.button5);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, skip44.class);
                startActivity(intent);
            }
        });

        button9 = findViewById(R.id.button14);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, acls3.class);
                startActivity(intent);
            }
        });

        button10 = findViewById(R.id.button6);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Hovsim2.class);
                startActivity(intent);
            }
        });

        button11 = findViewById(R.id.button7);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pals3.class);
                startActivity(intent);
            }
        });

        button12 = findViewById(R.id.button10);

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, acls4.class);
                startActivity(intent);
            }
        });

        button13 = findViewById(R.id.button13);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, phtls1.class);
                startActivity(intent);
            }
        });

        button14 = findViewById(R.id.button9);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, acls5.class);
                startActivity(intent);
            }
        });
    }

}