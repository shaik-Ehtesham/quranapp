package com.example.al_furqan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RecyclerView foodrev = findViewById(R.id.foodrev);
        ArrayList<fooddata> fooddualist = new ArrayList<>();

        // Dua before eating
        fooddualist.add(new fooddata(
                "Recite before eating",
                "بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيْمِ",
                "Bismillahir Rahmanir Rahim",
                "In the name of Allah, the Most Gracious, the Most Merciful"));

// Dua after eating
        fooddualist.add(new fooddata(
                "Recite after eating",
                "الْحَمْدُ لِلَّهِ الَّذِيْ أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ",
                "Alhamdu lillahil-ladhi at'amana wa saqana wa ja'alna muslimin",
                "All praise is for Allah who gave us food and drink and made us Muslims"));

// Dua for when forgetting to recite Bismillah before eating
        fooddualist.add(new fooddata(
                "Recite when forgetting to say Bismillah before eating",
                "بِسْمِ اللَّهِ فِي أَوَّلِهِ وَآخِرِهِ",
                "Bismillahi fi awwalihi wa akhirihi",
                "In the name of Allah at the beginning and at the end"));

// Dua when finishing the meal
        fooddualist.add(new fooddata(
                "Recite after finishing the meal",
                "الْحَمْدُ لِلَّهِ الَّذِيْ أَطْعَمَنَا وَسَقَانَا وَكَفَانَا وَآوَانَا فَكَمْ مِمَّنْ لَا كَافِيَ لَهُ وَلَا مُؤْوِيَ",
                "Alhamdu lillahil-ladhi at'amana wa saqana wa kafana wa awana fakam mimman la kafiya lahu wa la muwiya",
                "All praise is for Allah who gave us food and drink and sufficed us and gave us shelter, for how many are there who have neither a sufficiency nor a shelter."));

// Dua when inviting others to eat
        fooddualist.add(new fooddata(
                "Recite when inviting others to eat",
                "اللَّهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ",
                "Allahumma barik lana fi ma razaqtana waqina 'adhaba-n-nar",
                "O Allah! Bless (the food) You have provided us and save us from the torment of the Fire."));

// Dua when breaking the fast
        fooddualist.add(new fooddata(
                "Recite before drinking",
                "بِسْمِ اللَّهِ",
                "Bismillah",
                "In the name of Allah."));
        fooddualist.add(new fooddata(
                "Recite after drinking water",
                "الْحَمْدُ لِلَّهِ",
                "Alhamdulillah",
                "All praise is due to Allah."));
        fooddualist.add(new fooddata(
                "Recite when cooking",
                "اللَّهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا وَكِنْ عَوَنًا لَنَا عَلَى شُكْرِكَ وَحُسْنِ عِبَادَتِكَ",
                "Allahumma barik lana fi ma razaqtana wa kun 'awanana 'ala shukrika wa husni 'ibadatika",
                "O Allah, bless what You have provided us, and be our helper in giving thanks and worshiping You in the best way."));

        fooddualist.add(new fooddata(
                "Recite before a gathering to eat",
                "اللَّهُمَّ بِارِكْ لَنَا فِيمَا رَزَقْتَنَا وَأَطْعِمْنَا خَيْرًا مِنْهُ وَاسْتُرْ عَوْرَاتِنَا وَآتِنَا الصَّحَّةَ وَالْعَافِيَةَ وَأَجِرْنَا مِنْ خِزْيِ الدُّنْيَا وَعَذَابِ الْآخِرَةِ",
                "Allahumma barik lana fi ma razaqtana wa at'imna khayran minhu wa-stur 'awratina wa atina al-sihhata wal-afiyata wa ajirna min khizyi al-dunya wa 'adhabi al-akhirah",
                "O Allah, bless what You have provided us, and give us food that is better than this, and cover our faults, and grant us good health and well-being, and save us from the disgrace of this world and the punishment of the Hereafter."));
        foodrev.setLayoutManager(new LinearLayoutManager(this));
        foodadapter fa = new foodadapter(this,fooddualist);
        foodrev.setAdapter(fa);
    }
}