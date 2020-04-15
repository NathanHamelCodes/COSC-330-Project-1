package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PictureStory extends AppCompatActivity {
    Button mariaBtn, johnBtn, aliciaBtn, larisaBtn, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_story);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToC();
            }
        });

        mariaBtn = findViewById(R.id.maria);
        mariaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaria();
            }
        });
        johnBtn = findViewById(R.id.john);
        johnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJohn();
            }
        });
        aliciaBtn = findViewById(R.id.alicia);
        aliciaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlicia();
            }
        });
        larisaBtn = findViewById(R.id.larisa);
        larisaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLarisa();
            }
        });
    }

    public void openMaria() {
        Intent intent = new Intent(this, Maria_Story.class);
        startActivity(intent);
    }

    public void openJohn() {
        Intent intent = new Intent(this, John_Story.class);
        startActivity(intent);
    }

    public void openAlicia() {
        Intent intent = new Intent(this, Alicia_Story.class);
        startActivity(intent);
    }

    public void openLarisa() {
        Intent intent = new Intent(this, Larisa_Story.class);
        startActivity(intent);
    }

    public void openToC() {
        Intent intent = new Intent(this, ToC.class);
        startActivity(intent);
    }
}
