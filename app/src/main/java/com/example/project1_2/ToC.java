package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToC extends AppCompatActivity {
    Button wordBtn, crosswordBtn, partBtn, pictureBtn, readBtn, speakBtn, vocabBtn, medBtn, wordSearchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytoc);

        wordBtn = findViewById(R.id.gloss);
        wordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWordList();
            }
        });
        crosswordBtn = findViewById(R.id.cross);
        crosswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCrossword();
            }
        });
        partBtn = findViewById(R.id.par);
        partBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPartMatching();
            }
        });
        pictureBtn = findViewById(R.id.pic);
        pictureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPictureStory();
            }
        });
        readBtn = findViewById(R.id.rea);
        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRead();
            }
        });
        speakBtn = findViewById(R.id.spe);
        speakBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpeak();
            }
        });
        vocabBtn = findViewById(R.id.vocabBtn);
        vocabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVocab();
            }
        });
        medBtn = findViewById(R.id.med);
        medBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMed();
            }
        });
        wordSearchBtn = findViewById(R.id.wordsearch);
        wordSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWordSearch();
            }
        });
    }

    public void openWordList() {
        Intent intent = new Intent(this, WordList.class);
        startActivity(intent);
    }

    public void openCrossword() {
        Intent intent = new Intent(this, CrossWord.class);
        startActivity(intent);
    }

    public void openPartMatching() {
        Intent intent = new Intent(this, PartMatching.class);
        startActivity(intent);
    }

    public void openPictureStory() {
        Intent intent = new Intent(this, PictureStory.class);
        startActivity(intent);
    }

    public void openRead() {
        Intent intent = new Intent(this, Read.class);
        startActivity(intent);
    }

    public void openSpeak() {
        Intent intent = new Intent(this, Speak.class);
        startActivity(intent);
    }

    public void openVocab() {
        Intent intent = new Intent(this, Vocab_Matching.class);
        startActivity(intent);
    }

    public void openMed() {
        Intent intent = new Intent(this, MedicalLabels.class);
        startActivity(intent);
    }

    public void openWordSearch() {
        Intent intent = new Intent(this, Word_Search.class);
        startActivity(intent);
    }
}
