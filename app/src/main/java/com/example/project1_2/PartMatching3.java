package com.example.project1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class PartMatching3 extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_matching3);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });

        Spinner eye = findViewById(R.id.eye);
        Spinner ear = findViewById(R.id.ear);
        Spinner mouth = findViewById(R.id.mouth);
        Spinner nose = findViewById(R.id.nose);
        Spinner neck = findViewById(R.id.neck);

        ArrayAdapter<String> eyeAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eye));
        eyeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        eye.setAdapter(eyeAdapter);

        ArrayAdapter<String> earAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ear));
        earAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ear.setAdapter(earAdapter);

        ArrayAdapter<String> mouthAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mouth));
        mouthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mouth.setAdapter(mouthAdapter);

        ArrayAdapter<String> noseAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.nose));
        noseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        nose.setAdapter(noseAdapter);

        ArrayAdapter<String> neckAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.neck));
        neckAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        neck.setAdapter(neckAdapter);
    }

    public void openBack() {
        Intent intent = new Intent(this, ToC.class);
        startActivity(intent);
    }


}
