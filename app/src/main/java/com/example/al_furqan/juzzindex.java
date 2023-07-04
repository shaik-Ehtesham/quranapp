package com.example.al_furqan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class juzzindex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juzzindex);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RecyclerView juzzrecycler = findViewById(R.id.juzzrecycler);
        ArrayList<juzzdata> list = new ArrayList<>();

        list.add(new juzzdata("1.Alif Lam Meem","الم"));
        list.add(new juzzdata("2.Sayaqool","سيقول"));
        list.add(new juzzdata("3.Tilkal Rusul","تلك الرسل"));
        list.add(new juzzdata("4.Lan Tana Loo","لن تنالوا"));
        list.add(new juzzdata("5.Wal Mohsanat","والمحصنات"));
        list.add(new juzzdata("6.La Yuhibbullah","لا يحب الله"));
        list.add(new juzzdata("7.Wa Iza Samiu","وإذا سمعوا"));
        list.add(new juzzdata("8.Wa Lau Annana","ولو أننا"));
        list.add(new juzzdata("9.Qalal Malao","قال الملأ"));
        list.add(new juzzdata("10.Wa A'lamu","وأعلموا"));
        list.add(new juzzdata("11.Yatazeroon","يتلون"));
        list.add(new juzzdata("12.Wa Mamin Da'abat","وما من دابة"));
        list.add(new juzzdata("13.Wa Ma Ubrioo","وما أبرئ"));
        list.add(new juzzdata("14.Rubama","ربما"));
        list.add(new juzzdata("15.Subhanallazi","سبحان الذي"));
        list.add(new juzzdata("16.Qal Alam","قال ألم"));
        list.add(new juzzdata("17.Aqtarabo","اقترب"));
        list.add(new juzzdata("18.Qadd Aflaha","قد أفلح"));
        list.add(new juzzdata("19.Wa Qalallazina","وقال الذين"));
        list.add(new juzzdata("20.A'man Khalaq","آمن خلقكم"));
        list.add(new juzzdata("21.Utlu Ma Oohi","اتل ما أوحي"));
        list.add(new juzzdata("22.Wa Manyaqnut","ومن يقنت"));
        list.add(new juzzdata("23.Wa Mali","وما لي"));
        list.add(new juzzdata("24.Faman Azlam","فمن أظلم"));
        list.add(new juzzdata("25.Elahe Yuruddo","إلى يوم يرد"));
        list.add(new juzzdata("26.Ha'a Meem","حم"));
        list.add(new juzzdata("27.Qala Fama Khatbukum","قال فما خطبكم"));
        list.add(new juzzdata("28.Qadd Sami Allah","قد سمع الله"));
        list.add(new juzzdata("29.Tabarakallazi","تبارك الذي"));
        list.add(new juzzdata("30.Amma Yatasa'aloon","عم يتساءلون"));




        juzzrecycler.setLayoutManager(new LinearLayoutManager(this));
        juzzadapter a = new juzzadapter(this,list);
        juzzrecycler.setAdapter(a);

    }
}