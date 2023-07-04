package com.example.al_furqan;

public class surahdata {
    String surahname;
    String suraharabic;

    public surahdata(String surahname, String suraharabic) {
        this.surahname = surahname;
        this.suraharabic = suraharabic;
    }

    public String getSurahname() {
        return surahname;
    }

    public void setSurahname(String surahname) {
        this.surahname = surahname;
    }

    public String getSuraharabic() {
        return suraharabic;
    }

    public void setSuraharabic(String suraharabic) {
        this.suraharabic = suraharabic;
    }
}
