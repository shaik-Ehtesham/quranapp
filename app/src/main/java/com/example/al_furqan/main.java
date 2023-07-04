package com.example.al_furqan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        CardView b,names,salah,juzz,surah,prophets;
        b = findViewById(R.id.dua);
        juzz = findViewById(R.id.juzzindex);
        prophets = findViewById(R.id.prophets);
        names = findViewById(R.id.halal);
        salah = findViewById(R.id.salah);
        surah = findViewById(R.id.surahindex);
        Intent intent = new Intent(this,dua.class);
        Intent pro = new Intent(this,prophetindex.class);
        Intent name = new Intent(this,namesofallah.class);
        Intent juz = new Intent(this,juzzindex.class);
        Intent sur = new Intent(this,surahindex.class);

        Intent sala = new Intent(this,food.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        prophets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(pro);
            }
        });
        names.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(name);
            }
        });
        salah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(sala);
            }
        });
        juzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(juz);


            }
        });
        surah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(sur);


            }
        });


    }
}