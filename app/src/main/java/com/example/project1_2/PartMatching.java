package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class PartMatching extends AppCompatActivity {

    Button nextBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_matching);

        nextBtn1 = findViewById(R.id.next1);
        nextBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNext1();
            }
        });

        Spinner chest = findViewById(R.id.chest);
        Spinner feet = findViewById(R.id.feet);
        Spinner hands = findViewById(R.id.hand);
        Spinner head = findViewById(R.id.head);
        Spinner shoulder = findViewById(R.id.shoulder);
        Spinner stomach = findViewById(R.id.stomach);
        Spinner arm = findViewById(R.id.arm);

        ArrayAdapter<String> headAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.head));
        headAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        head.setAdapter(headAdapter);

        ArrayAdapter<String> shoulderAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.shoulder));
        shoulderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shoulder.setAdapter(shoulderAdapter);

        ArrayAdapter<String> stomachAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.stomach));
        stomachAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stomach.setAdapter(stomachAdapter);

        ArrayAdapter<String> armAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.arm));
        armAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arm.setAdapter(armAdapter);

        ArrayAdapter<String> chestAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.chest));
        chestAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chest.setAdapter(chestAdapter);

        ArrayAdapter<String> feetAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.foot));
        feetAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feet.setAdapter(feetAdapter);

        ArrayAdapter<String> handAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.hand));
        handAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hands.setAdapter(handAdapter);

    }

    public void openNext1() {
        Intent intent = new Intent(this, PartMatching2.class);
        startActivity(intent);
    }
}
