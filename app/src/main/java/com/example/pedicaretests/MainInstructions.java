package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainInstructions extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_instructions);

        button = findViewById(R.id.button15);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInstructions.this, blsi.class);
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.button16);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInstructions.this, acls1i.class);
                startActivity(intent);
            }
        });

        button3 = findViewById(R.id.button17);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInstructions.this, acls2i.class);
                startActivity(intent);
            }
        });

        button4 = findViewById(R.id.button22);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInstructions.this, hmm.class);
                startActivity(intent);
            }
        });

        button5 = findViewById(R.id.button21);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInstructions.this, hmm2.class);
                startActivity(intent);
            }
        });

        button6 = findViewById(R.id.button19);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInstructions.this, hmm3.class);
                startActivity(intent);
            }
        });


    }}