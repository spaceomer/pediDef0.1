package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MAINMANU extends AppCompatActivity {

    ImageButton button;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmanu);

        button = findViewById(R.id.imageButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MAINMANU.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.imageButton2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MAINMANU.this, MainInstructions.class);
                startActivity(intent);
            }
        });

        button3 = findViewById(R.id.imageButton3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MAINMANU.this, Lodingdef.class);
                startActivity(intent);
            }
        });

        button4 = findViewById(R.id.imageButton4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MAINMANU.this, MainDef_V2.class);
                startActivity(intent);
            }
        });

    }
}