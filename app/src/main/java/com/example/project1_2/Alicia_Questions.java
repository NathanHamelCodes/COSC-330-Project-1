package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Alicia_Questions extends AppCompatActivity {
    Button a1, a2, a3, a4, a5, ret;
    TextView res1, res2, res3, res4, res5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alicia__questions);

        res1 = findViewById(R.id.a1);
        res2 = findViewById(R.id.a2);
        res3 = findViewById(R.id.a3);
        res4 = findViewById(R.id.a4);
        res5 = findViewById(R.id.a5);

        res1.setVisibility(View.INVISIBLE);
        res2.setVisibility(View.INVISIBLE);
        res3.setVisibility(View.INVISIBLE);
        res4.setVisibility(View.INVISIBLE);
        res5.setVisibility(View.INVISIBLE);

        a1 = findViewById(R.id.ans1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res1.setVisibility(View.VISIBLE);
            }
        });
        a2 = findViewById(R.id.ans2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res2.setVisibility(View.VISIBLE);
            }
        });
        a3 = findViewById(R.id.ans3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res3.setVisibility(View.VISIBLE);
            }
        });
        a5 = findViewById(R.id.ans5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res5.setVisibility(View.VISIBLE);
            }
        });
        a4 = findViewById(R.id.ans4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res4.setVisibility(View.VISIBLE);
            }
        });

        ret = findViewById(R.id.ret);
        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStories();
            }
        });
    }

    public void openStories() {
        Intent intent = new Intent(this, PictureStory.class);
        startActivity(intent);
    }
}
