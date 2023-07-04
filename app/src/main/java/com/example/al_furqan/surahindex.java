package com.example.al_furqan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class surahindex extends AppCompatActivity {

    private ArrayList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surahindex);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RecyclerView surahrecycler = findViewById(R.id.surahrecycler);
        ArrayList<surahdata> list = new ArrayList<>();















        list.add(new surahdata("1. Al-Fatiha", "الفاتحة"));
        list.add(new surahdata("2. Al-Baqarah", "البقرة"));
        list.add(new surahdata("3. Al-Imran", "آل عمران"));
        list.add(new surahdata("4. An-Nisa'", "النساء"));
        list.add(new surahdata("5. Al-Ma'idah", "المائدة"));
        list.add(new surahdata("6. Al-An'am", "الأنعام"));
        list.add(new surahdata("7. Al-A'raf", "الأعراف"));
        list.add(new surahdata("8. Al-Anfal", "الأنفال"));
        list.add(new surahdata("9. At-Tawbah", "التوبة"));
        list.add(new surahdata("10. Yunus", "يونس"));
        list.add(new surahdata("11. Hud", "هود"));
        list.add(new surahdata("12. Yusuf", "يوسف"));
        list.add(new surahdata("13. Ar-Ra'd", "الرعد"));
        list.add(new surahdata("14. Ibrahim", "إبراهيم"));
        list.add(new surahdata("15. Al-Hijr", "الحجر"));
        list.add(new surahdata("16. An-Nahl", "النحل"));
        list.add(new surahdata("17. Al-Isra'", "الإسراء"));
        list.add(new surahdata("18. Al-Kahf", "الكهف"));
        list.add(new surahdata("19. Maryam", "مريم"));
        list.add(new surahdata("20. Taha", "طه"));
        list.add(new surahdata("21. Al-Anbiya'", "الأنبياء"));
        list.add(new surahdata("22. Al-Hajj", "الحج"));
        list.add(new surahdata("23. Al-Mu'minun", "المؤمنون"));
        list.add(new surahdata("24. An-Noor", "النور"));
        list.add(new surahdata("25. Al-Furqan", "الفرقان"));
        list.add(new surahdata("26. Ash-Shu'ara", "الشعراء"));
        list.add(new surahdata("27. An-Naml", "النمل"));
        list.add(new surahdata("28. Al-Qasas", "القصص"));
        list.add(new surahdata("29. Al-Ankabut", "العنكبوت"));
        list.add(new surahdata("30. Ar-Rum", "الروم"));
        list.add(new surahdata("31. Luqman", "لقمان"));
        list.add(new surahdata("32. As-Sajdah", "السجدة"));
        list.add(new surahdata("33. Al-Ahzab", "الأحزاب"));
        list.add(new surahdata("34. Saba'", "سبأ"));
        list.add(new surahdata("35. Fatir", "فاطر"));
        list.add(new surahdata("36. Ya-Sin", "يس"));
        list.add(new surahdata("37. As-Saffat", "الصافات"));

        list.add(new surahdata("38. Sad", "ص"));
        list.add(new surahdata("39. Az-Zumar", "الزمر"));
        list.add(new surahdata("40. Ghafir", "غافر"));
        list.add(new surahdata("41. Fussilat", "فصلت"));
        list.add(new surahdata("42. Ash-Shura", "الشورى"));
        list.add(new surahdata("43. Az-Zukhruf", "الزخرف"));
        list.add(new surahdata("44. Ad-Dukhan", "الدخان"));
        list.add(new surahdata("45. Al-Jathiya", "الجاثية"));
        list.add(new surahdata("46. Al-Ahqaf", "الأحقاف"));
        list.add(new surahdata("47. Muhammad", "محمد"));
        list.add(new surahdata("48. Al-Fath", "الفتح"));
        list.add(new surahdata("49. Al-Hujurat", "الحجرات"));
        list.add(new surahdata("50. Qaf", "ق"));
        list.add(new surahdata("51. Adh-Dhariyat", "الذاريات"));
        list.add(new surahdata("52. At-Tur", "الطور"));
        list.add(new surahdata("53. An-Najm", "النجم"));
        list.add(new surahdata("54. Al-Qamar", "القمر"));
        list.add(new surahdata("55. Ar-Rahman", "الرحمن"));
        list.add(new surahdata("56. Al-Waqi'ah", "الواقعة"));
        list.add(new surahdata("57. Al-Hadid", "الحديد"));
        list.add(new surahdata("58. Al-Mujadilah", "المجادلة"));
        list.add(new surahdata("59. Al-Hashr", "الحشر"));
        list.add(new surahdata("60. Al-Mumtahanah", "الممتحنة"));
        list.add(new surahdata("61. As-Saff", "الصف"));
        list.add(new surahdata("62. Al-Jumu'ah", "الجمعة"));
        list.add(new surahdata("63. Al-Munafiqun", "المنافقون"));
        list.add(new surahdata("64. At-Taghabun", "التغابن"));
        list.add(new surahdata("65. At-Talaq", "الطلاق"));
        list.add(new surahdata("66. At-Tahrim", "التحريم"));
        list.add(new surahdata("67. Al-Mulk", "الملك"));
        list.add(new surahdata("68. Al-Qalam", "القلم"));
        list.add(new surahdata("69. Al-Haqqah", "الحاقة"));
        list.add(new surahdata("70. Al-Ma'arij", "المعارج"));
        list.add(new surahdata("71. Nuh", "نوح"));
        list.add(new surahdata("72. Al-Jinn", "الجن"));
        list.add(new surahdata("73. Al-Muzzammil", "المزمل"));
        list.add(new surahdata("74. Al-Muddaththir", "المدثر"));
        list.add(new surahdata("75. Al-Qiyamah", "القيامة"));
        list.add(new surahdata("76. Al-Insan", "الإنسان"));
        list.add(new surahdata("77. Al-Mursalat", "المرسلات"));
        list.add(new surahdata("78. An-Naba", "النبإ"));
        list.add(new surahdata("79. An-Nazi'at", "النازعات"));
        list.add(new surahdata("80. 'Abasa", "عبس"));
        list.add(new surahdata("81. At-Takwir", "التكوير"));
        list.add(new surahdata("82. Al-Infitar", "الإنفطار"));
        list.add(new surahdata("83. Al-Mutaffifin", "المطففين"));
        list.add(new surahdata("84. Al-Inshiqaq", "الإنشقاق"));
        list.add(new surahdata("85. Al-Buruj", "البروج"));
        list.add(new surahdata("86. At-Tariq", "الطارق"));
        list.add(new surahdata("87. Al-A'la", "الأعلى"));
        list.add(new surahdata("88. Al-Ghashiyah", "الغاشية"));
        list.add(new surahdata("89. Al-Fajr", "الفجر"));
        list.add(new surahdata("90. Al-Balad", "البلد"));
        list.add(new surahdata("91. Ash-Shams", "الشمس"));
        list.add(new surahdata("92. Al-Layl", "الليل"));
        list.add(new surahdata("93. Ad-Duha", "الضحى"));
        list.add(new surahdata("94. Ash-Sharh", "الشرح"));
        list.add(new surahdata("95. At-Tin", "التين"));
        list.add(new surahdata("96. Al-'Alaq", "العلق"));
        list.add(new surahdata("97. Al-Qadr", "القدر"));
        list.add(new surahdata("98. Al-Bayyinah", "البينة"));
        list.add(new surahdata("99. Az-Zalzalah", "الزلزلة"));
        list.add(new surahdata("100. Al-'Adiyat", "العاديات"));
        list.add(new surahdata("101. Al-Qari'ah", "القارعة"));
        list.add(new surahdata("102. At-Takathur", "التكاثر"));
        list.add(new surahdata("103. Al-'Asr", "العصر"));
        list.add(new surahdata("104. Al-Humazah", "الهمزة"));
        list.add(new surahdata("105. Al-Fil", "الفيل"));
        list.add(new surahdata("106. Quraysh", "قريش"));
        list.add(new surahdata("107. Al-Ma'un", "الماعون"));
        list.add(new surahdata("108. Al-Kauthar", "الكوثر"));
        list.add(new surahdata("109. Al-Kafirun", "الكافرون"));
        list.add(new surahdata("110. An-Nasr", "النصر"));
        list.add(new surahdata("111. Al-Masad", "المسد"));
        list.add(new surahdata("112. Al-Ikhlas", "الإخلاص"));
        list.add(new surahdata("113. Al-Falaq", "الفلق"));
        list.add(new surahdata("114. An-Nas", "الناس"));










        surahrecycler.setLayoutManager(new LinearLayoutManager(this));
        surahadapter su = new surahadapter(this,list);
        surahrecycler.setAdapter(su);
    }




}