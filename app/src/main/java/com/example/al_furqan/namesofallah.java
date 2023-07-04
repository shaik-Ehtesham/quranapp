package com.example.al_furqan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class namesofallah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namesofallah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RecyclerView review = findViewById(R.id.review);
        ArrayList<namesdata> namesList = new ArrayList<>();


        namesList.add(new namesdata("الرَّحْمَنُ", "Ar-Rahman", "The All-Compassionate"));
        namesList.add(new namesdata("الرَّحِيمُ", "Ar-Rahim", "The All-Merciful"));
        namesList.add(new namesdata("الْمَلِكُ", "Al-Malik", "The Absolute Ruler"));
        namesList.add(new namesdata("الْقُدُّوسُ", "Al-Quddus", "The Pure One"));
        namesList.add(new namesdata("السَّلاَمُ", "As-Salam", "The Source of Peace"));
        namesList.add(new namesdata("الْمُؤْمِنُ", "Al-Mu'min", "The Guardian of Faith"));
        namesList.add(new namesdata("الْمُهَيْمِنُ", "Al-Muhaymin", "The Protector and Watchful One"));
        namesList.add(new namesdata("الْعَزِيزُ", "Al-Aziz", "The Almighty"));
        namesList.add(new namesdata("الْجَبَّارُ", "Al-Jabbar", "The Compeller"));
        namesList.add(new namesdata("الْمُتَكَبِّرُ", "Al-Mutakabbir", "The Greatest"));
        namesList.add(new namesdata("الْخَالِقُ", "Al-Khaliq", "The Creator"));
        namesList.add(new namesdata("الْبَارِئُ", "Al-Bari'", "The Maker of Order"));
        namesList.add(new namesdata("الْمُصَوِّرُ", "Al-Musawwir", "The Shaper of Beauty"));
        namesList.add(new namesdata("الْغَفَّارُ", "Al-Ghaffar", "The Forgiving"));
        namesList.add(new namesdata("الْقَهَّارُ", "Al-Qahhar", "The Subduer"));
        namesList.add(new namesdata("الْوَهَّابُ", "Al-Wahhab", "The Giver of All"));
        namesList.add(new namesdata("الرَّزَّاقُ", "Ar-Razzaq", "The Sustainer"));
        namesList.add(new namesdata("الْفَتَّاحُ", "Al-Fattah", "The Opener"));
        namesList.add(new namesdata("الْعَلِيمُ", "Al-'Alim", "The Knower of All"));
        namesList.add(new namesdata("الْقَابِضُ", "Al-Qabid", "The Constrictor"));
        namesList.add(new namesdata("الْبَاسِطُ", "Al-Basit", "The Reliever"));
        namesList.add(new namesdata("الْخَافِضُ", "Al-Khafid", "The Abaser"));
        namesList.add(new namesdata("الرَّافِعُ", "Ar-Rafi", "The Exalter"));
        namesList.add(new namesdata("الْمُعِزُّ", "Al-Mu'izz", "The Bestower of Honors"));
        namesList.add(new namesdata("الْمُذِلُّ", "Al-Mudhill", "The Humiliator"));
        namesList.add(new namesdata("السَّمِيعُ", "As-Sami", "The Hearer of All"));
        namesList.add(new namesdata("الْبَصِيرُ", "Al-Basir", "The Seer of All"));
        namesList.add(new namesdata("الْحَكَمُ", "Al-Hakam", "The Judge"));
        namesList.add(new namesdata("الْعَدْلُ", "Al-'Adl", "The Just"));
        namesList.add(new namesdata("اللَّطِيفُ", "Al-Latif", "The Subtle One"));
        namesList.add(new namesdata("الْخَبِيرُ", "Al-Khabir", "The All-Aware"));
        namesList.add(new namesdata("الْحَلِيمُ", "Al-Halim", "The Forbearing"));
        namesList.add(new namesdata("الْعَظِيمُ", "Al-'Azim", "The Magnificent"));
        namesList.add(new namesdata("الْغَفُورُ", "Al-Ghafur", "The Forgiver and Hider of Faults"));
        namesList.add(new namesdata("الشَّكُورُ", "Ash-Shakur", "The Rewarder of Thankfulness"));
        namesList.add(new namesdata("الْعَلِيُّ", "Al-'Ali", "The Highest"));
        namesList.add(new namesdata("الْكَبِيرُ", "Al-Kabir", "The Greatest"));
        namesList.add(new namesdata("الْحَفِيظُ", "Al-Hafiz", "The Preserver"));
        namesList.add(new namesdata("الْمُقِيتُ", "Al-Muqit", "The Nourisher"));
        namesList.add(new namesdata("الْحسِيبُ", "Al-Hasib", "The Accounter"));
        namesList.add(new namesdata("الْجَلِيلُ", "Al-Jalil", "The Mighty"));
        namesList.add(new namesdata("الْكَرِيمُ", "Al-Karim", "The Generous"));
        namesList.add(new namesdata("الرَّقِيبُ", "Ar-Raqib", "The Watchful One"));
        namesList.add(new namesdata("الْمُجِيبُ", "Al-Mujib", "The Responder to Prayer"));
        namesList.add(new namesdata("الْوَاسِعُ", "Al-Wasi", "The All-Comprehending"));
        namesList.add(new namesdata("الْحَكِيمُ", "Al-Hakim", "The Perfectly Wise"));
        namesList.add(new namesdata("الْوَدُودُ", "Al-Wadud", "The Loving One"));
        namesList.add(new namesdata("الْمَجِيدُ", "Al-Majid", "The Majestic One"));
        namesList.add(new namesdata("الْبَاعِثُ", "Al-Ba'ith", "The Resurrector"));
        namesList.add(new namesdata("الشَّهِيدُ", "Ash-Shahid", "The Witness"));
        namesList.add(new namesdata("الْحَقُّ", "Al-Haqq", "The Truth"));
        namesList.add(new namesdata("الْوَكِيلُ", "Al-Wakil", "The Trustee"));
        namesList.add(new namesdata("الْقَوِيُّ", "Al-Qawiyy", "The Possessor of All Strength"));
        namesList.add(new namesdata("الْمَتِينُ", "Al-Matin", "The Forceful One"));
        namesList.add(new namesdata("الْوَلِيُّ", "Al-Waliyy", "The Guardian"));
        namesList.add(new namesdata("الْحَمِيدُ", "Al-Hamid", "The Praiseworthy"));
        namesList.add(new namesdata("الْمُحْصِي", "Al-Muhsi", "The Accounter of All"));
        namesList.add(new namesdata("الْمُبْدِئُ", "Al-Mubdi", "The Producer of All"));
        namesList.add(new namesdata("الْمُعِيدُ", "Al-Mu'id", "The Reinstater"));
        namesList.add(new namesdata("الْمُحْيِي", "Al-Muhyi", "The Giver of Life"));
        namesList.add(new namesdata("الْمُمِيتُ", "Al-Mumit", "The Bringer of Death"));
        namesList.add(new namesdata("الْحَيُّ", "Al-Hayy", "The Ever-Living One"));
        namesList.add(new namesdata("الْقَيُّومُ", "Al-Qayyum", "The Sustainer"));
        namesList.add(new namesdata("الْوَاجِدُ", "Al-Wajid", "The Perceiver"));
        namesList.add(new namesdata("الْمَاجِدُ", "Al-Majid", "The Illustrious One"));
        namesList.add(new namesdata("الْوَاحِدُ", "Al-Wahid", "The One"));
        namesList.add(new namesdata("الْأَحَدُ", "Al-Ahad", "The Unity"));
        namesList.add(new namesdata("الصَّمَدُ", "As-Samad", "The Eternal"));
        namesList.add(new namesdata("الْقَادِرُ", "Al-Qadir", "The Able"));
        namesList.add(new namesdata("الْمُقْتَدِرُ", "Al-Muqtadir", "The Powerful"));
        namesList.add(new namesdata("الْمُقَدِّمُ", "Al-Muqaddim", "The Expediter"));
        namesList.add(new namesdata("الْمُؤَخِّرُ", "Al-Mu'akhkhir", "The Delayer"));
        namesList.add(new namesdata("الأوَّلُ", "Al-Awwal", "The First"));
        namesList.add(new namesdata("الآخِرُ", "Al-Akhir", "The Last"));
        namesList.add(new namesdata("الظَّاهِرُ", "Adh-Dhahir", "The Manifest"));
        namesList.add(new namesdata("الْبَاطِنُ", "Al-Batin", "The Hidden"));
        namesList.add(new namesdata("الْوَالِي", "Al-Wali", "The Patron"));
        namesList.add(new namesdata("الْمُتَعَالِي", "Al-Muta'ali", "The Self-Exalted"));
        namesList.add(new namesdata("الْبَرُّ", "Al-Barr", "The Most Kind and Righteous"));
        namesList.add(new namesdata("التَّوَابُ", "At-Tawwab", "The Ever-Pardoning, The Relenting"));
        namesList.add(new namesdata("الْمُنْتَقِمُ", "Al-Muntaqim", "The Avenger"));
        namesList.add(new namesdata("العَفُوُّ", "Al-'Afuww", "The Pardoner"));
        namesList.add(new namesdata("الرَّؤُوفُ", "Ar-Ra'uf", "The Kind"));
        namesList.add(new namesdata("مَالِكُ الْمُلْكِ", "Malik-al-Mulk", "The Owner of All Sovereignty"));
        namesList.add(new namesdata("ذُوالْجَلَالِ وَالْإِكْرَامِ", "Dhu-al-Jalali-wal-Ikram", "The Lord of Majesty and Generosity"));
        namesList.add(new namesdata("الْمُقْسِطُ", "Al-Muqsit", "The Equitable"));
        namesList.add(new namesdata("الْجَامِعُ", "Al-Jami", "The Gatherer"));
        namesList.add(new namesdata("الْغَنِيُّ", "Al-Ghaniyy", "The Independent, The Rich"));
        namesList.add(new namesdata("الْمُغْنِي", "Al-Mughni", "The Emancipator"));
        namesList.add(new namesdata("الْمَانِعُ", "Al-Mani", "The Shielder"));
        namesList.add(new namesdata("الضَّارَّ", "Ad-Darr", "The Distressor"));
        namesList.add(new namesdata("النَّافِعُ", "An-Nafi", "The Propitious, The Benefactor"));
        namesList.add(new namesdata("النُّورُ", "An-Nur", "The Light"));
        namesList.add(new namesdata("الْهَادِي", "Al-Hadi", "The Guide"));
        namesList.add(new namesdata("الْبَدِيعُ", "Al-Badi", "The Incomparable"));
        namesList.add(new namesdata("الْبَاقِي", "Al-Baqi", "The Ever-Surviving, The Everlasting"));
        namesList.add(new namesdata("الْوَارِثُ", "Al-Warith", "The Inheritor"));
        namesList.add(new namesdata("الرَّشِيدُ", "Ar-Rashid", "The Guide to the Right Path"));
        namesList.add(new namesdata("الصَّبُورُ", "As-Sabur", "The Patient"));

        review.setLayoutManager(new LinearLayoutManager(this));
        review.setHasFixedSize(true);
        namesadapter a = new namesadapter(this,namesList);
        review.setAdapter(a);

    }
}