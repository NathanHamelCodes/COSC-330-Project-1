package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MedicalLabels extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_labels);

        Spinner active = findViewById(R.id.act);
        Spinner uses = findViewById(R.id.use);
        Spinner warnings = findViewById(R.id.warn);
        Spinner sideEffects = findViewById(R.id.side);
        Spinner directions = findViewById(R.id.dire);

        ArrayAdapter<String> activeAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.medLabels));
        activeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        active.setAdapter(activeAdapter);

        ArrayAdapter<String> usesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.medLabels));
        usesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        uses.setAdapter(usesAdapter);

        ArrayAdapter<String> warningAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.medLabels));
        warningAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        warnings.setAdapter(warningAdapter);

        ArrayAdapter<String> sideAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.medLabels));
        sideAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sideEffects.setAdapter(sideAdapter);

        ArrayAdapter<String> directionAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.medLabels));
        directionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        directions.setAdapter(directionAdapter);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });
    }

    public void openBack() {
        Intent intent = new Intent(this, ToC.class);
        startActivity(intent);
    }
}
