package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class John_Story extends AppCompatActivity {
    Button quesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_john__story);

        quesBtn = findViewById(R.id.questions);
        quesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQues();
            }
        });
    }

    public void openQues() {
        Intent intent = new Intent(this, John_Questions.class);
        startActivity(intent);
    }
}
