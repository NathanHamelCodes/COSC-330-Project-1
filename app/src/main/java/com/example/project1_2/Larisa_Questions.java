package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Larisa_Questions extends AppCompatActivity {
    Spinner fruit, vegetables, grain, protein, dairy;
    Button ret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larisa__questions);

        fruit = findViewById(R.id.fru);
        vegetables = findViewById(R.id.veg);
        grain = findViewById(R.id.gra);
        protein = findViewById(R.id.pro);
        dairy = findViewById(R.id.dai);
        ret = findViewById(R.id.ret);

        ret = findViewById(R.id.ret);
        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStories();
            }
        });

        ArrayAdapter<String> fruitAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.fruit));
        fruitAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fruit.setAdapter(fruitAdapter);

        ArrayAdapter<String> vegAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.vegetables));
        vegAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vegetables.setAdapter(vegAdapter);

        ArrayAdapter<String> grainAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.grains));
        grainAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grain.setAdapter(grainAdapter);

        ArrayAdapter<String> proAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.protein));
        proAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        protein.setAdapter(proAdapter);

        ArrayAdapter<String> dairyAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.dairy));
        dairyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dairy.setAdapter(dairyAdapter);
    }

    public void openStories() {
        Intent intent = new Intent(this, PictureStory.class);
        startActivity(intent);
    }
}
