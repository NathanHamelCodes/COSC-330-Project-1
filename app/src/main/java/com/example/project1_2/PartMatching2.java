package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class PartMatching2 extends AppCompatActivity {
    Button nextBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_matching2);

        nextBtn2 = findViewById(R.id.next2);
        nextBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNext2();
            }
        });

        Spinner head = findViewById(R.id.head);
        Spinner shoulder = findViewById(R.id.shoulder);
        Spinner arm = findViewById(R.id.arm);
        Spinner hands = findViewById(R.id.hand);
        Spinner feet = findViewById(R.id.feet);
        Spinner back = findViewById(R.id.back);

        ArrayAdapter<String> headAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.head));
        headAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        head.setAdapter(headAdapter);

        ArrayAdapter<String> shoulderAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.shoulder));
        shoulderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shoulder.setAdapter(shoulderAdapter);

        ArrayAdapter<String> armAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.arm));
        armAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arm.setAdapter(armAdapter);

        ArrayAdapter<String> feetAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.foot));
        feetAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feet.setAdapter(feetAdapter);

        ArrayAdapter<String> handAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.hand));
        handAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hands.setAdapter(handAdapter);

        ArrayAdapter<String> backAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.back));
        backAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        back.setAdapter(backAdapter);
    }

    public void openNext2() {
        Intent intent = new Intent(this, PartMatching3.class);
        startActivity(intent);
    }
}
