package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maria_Story extends AppCompatActivity {
    Button questBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maria__story);

        questBtn = findViewById(R.id.questions);
        questBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuest();
            }
        });
    }

    public void openQuest() {
        Intent intent = new Intent(this, Maria_Questions.class);
        startActivity(intent);
    }
}
