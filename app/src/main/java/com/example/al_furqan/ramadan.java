package com.example.al_furqan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class ramadan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramadan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RecyclerView ramadanrecycler = findViewById(R.id.ramadanrecycler);
        ArrayList<ramadanduas> list = new ArrayList<>();


        list.add(new ramadanduas(
                "Dua for breaking the fast (Iftar)",
                "اللهم إني لك صمت وبك آمنت وعلى رزقك أفطرت",
                "allahumma inni laka samtu wa bika aamantu wa 'ala rizqika aftartu.",
                "O Allah, I fasted for You and I believe in You and I break my fast with Your sustenance."
        ));

        list.add(new ramadanduas(
                "Dua for beginning the fast (Suhoor)",
                "وبصوم غدٍ نويت من شهر رمضان",
                "wa bisawmi ghadin nawaitu min shahri ramadan.",
                "I intend to keep the fast for tomorrow in the month of Ramadan."
        ));

        list.add(new ramadanduas(
                "Dua for Laylatul Qadr",
                "اللَّهُمَّ إِنَّكَ عَفُوٌّ تُحِبُّ الْعَفْوَ فَاعْفُ عَنِّي",
                "allahumma innaka 'afuwwun tuhibbu al-'afwa fa'fu 'anni.",
                "O Allah, You are Forgiving and love forgiveness, so forgive me."
        ));
        list.add(new ramadanduas(
                "Dua for strength and energy",
                "اللهم إني أسألك صحة وعافية في ديني ودنياي",
                "allahumma inni as'aluka sihahatan wa 'afiyatan fi deeni wa dunyaya.",
                "O Allah, I ask for good health and well-being in my religion and worldly affairs."
        ));

        list.add(new ramadanduas(
                "Dua for acceptance of fasting",
                "اللهم تقبل مني إنك أنت السميع العليم",
                "allahumma taqabbal minni innaka anta as-samee'ul-'aleem.",
                "O Allah, accept from me, You are the All-Hearer, All-Knower."
        ));

        list.add(new ramadanduas(
                "Dua for seeking refuge from Hellfire",
                "اللهم إني أعوذ بك من عذاب جهنم",
                "allahumma inni a'oodhu bika min 'adhabi jahannam.",
                "O Allah, I seek refuge in You from the punishment of Hellfire."
        ));

        list.add(new ramadanduas(
                "Dua for seeking guidance",
                "رَبَّنَا لَا تُزِغْ قُلُوبَنَا بَعْدَ إِذْ هَدَيْتَنَا وَهَبْ لَنَا مِنْ لَدُنْكَ رَحْمَةً إِنَّكَ أَنْتَ الْوَهَّابُ",
                "rabbana la tuzigh quloobana ba'da idh hadaytana wahab lana min ladunka rahmatan innaka antal wahhaab.",
                "Our Lord! Do not let our hearts deviate from the right path after You have given us guidance, and bestow upon us mercy from Your own. Surely, You are the Bestower."
        ));

        list.add(new ramadanduas(
                "Dua for seeking blessings",
                "اللهم بارك لنا في رجب وشعبان وبلغنا رمضان",
                "allahumma barik lana fi rajab wa sha'ban wa balighna ramadan.",
                "O Allah, bless us in the months of Rajab and Sha'ban, and let us reach Ramadan."
        ));

        list.add(new ramadanduas(
                "Dua for forgiveness",
                "رَبِّ اغْفِرْ وَارْحَمْ وَأَنْتَ خَيْرُ الرَّاحِمِينَ",
                "rabbi-ghfir warham wa anta khayrur-raahimeen.",
                "O Lord, forgive and have mercy, for You are the Best of those who show mercy."
        ));
        list.add(new ramadanduas(
                "Dua for gratitude",
                "الحمد لله الذي عافاني في جسدي ورد علي روحي وأذن لي بذكره",
                "alhamdulillah alladhi 'aafani fee jasadi, wa radhia 'alayya ruhi, wa adhina li bi dhikrih.",
                "Praise be to Allah who has granted me wellness in my body, contentment in my soul, and permitted me to remember Him."
        ));

        list.add(new ramadanduas(
                "Dua for seeking knowledge",
                "رب زدني علماً",
                "rabbi zidni 'ilma.",
                "O Lord, increase me in knowledge."
        ));

        list.add(new ramadanduas(
                "Dua for a righteous spouse",
                "اللهم إني أسألك خيرها وخير ما جبلتها عليه وأعوذ بك من شرها وشر ما جبلتها عليه",
                "allahumma inni as'aluka khayraha wa khaira ma jabaltaha 'alayhi, wa a'oodhu bika min sharriha wa sharri ma jabaltaha 'alayhi.",
                "O Allah, I ask You for her goodness and the goodness of her character, and I seek refuge in You from her evil and the evil of her character."
        ));

        list.add(new ramadanduas(
                "Dua for parents",
                "رب ارحمهما كما ربياني صغيراً",
                "rabbi irhamhuma kama rabbayani sagheera.",
                "O Lord, have mercy on them (my parents) as they raised me when I was young."
        ));

        list.add(new ramadanduas(
                "Dua for relief from distress",
                "لا إلهَ إلَّا اللهُ العَظِيمُ الحَلِيمُ، لا إلهَ إلَّا اللهُ رَبُّ العَرشِ العَظِيمِ، لا إلهَ إلَّا اللهُ رَبُّ السَّمَاوَاتِ وَرَبُّ الأَرضِ وَرَبُّ العَرشِ الكَرِيمِ",
                "la ilaha illallahul 'azheemul haleem, la ilaha illallahur rabbul 'arshil 'azheem, la ilaha illallahur rabbus samawati wa rabbul ardi wa rabbul 'arshil kareem.",
                "There is no god but Allah, the Great, the Forbearing. There is no god but Allah, the Lord of the mighty Throne. There is no god but Allah, the Lord of the heavens, the Lord of the Earth, and the Lord of the noble Throne."
        ));


        ramadanrecycler.setLayoutManager(new LinearLayoutManager(this));
        ramadanadapter ra = new ramadanadapter(this,list);
        ramadanrecycler.setAdapter(ra);

    }
}