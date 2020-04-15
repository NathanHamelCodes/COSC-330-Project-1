package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alicia_Story extends AppCompatActivity {
    Button qstBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alicia__story);

        qstBtn = findViewById(R.id.questions);
        qstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQst();
            }
        });
    }
    public void openQst() {
        Intent intent = new Intent(this, Alicia_Questions.class);
        startActivity(intent);
    }
}
