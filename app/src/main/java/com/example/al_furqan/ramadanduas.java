package com.example.al_furqan;

public class ramadanduas {
    String rheading;
    String rinarabic;

    public String getRheading() {
        return rheading;
    }

    public void setRheading(String rheading) {
        this.rheading = rheading;
    }

    public String getRinarabic() {
        return rinarabic;
    }

    public void setRinarabic(String rinarabic) {
        this.rinarabic = rinarabic;
    }

    public String getRinenglish() {
        return rinenglish;
    }

    public void setRinenglish(String rinenglish) {
        this.rinenglish = rinenglish;
    }

    public String getRtranslate() {
        return rtranslate;
    }

    public void setRtranslate(String rtranslate) {
        this.rtranslate = rtranslate;
    }

    String rinenglish;
    String rtranslate;

    public ramadanduas(String rheading, String rinarabic, String rinenglish, String rtranslate) {
        this.rheading = rheading;
        this.rinarabic = rinarabic;
        this.rinenglish = rinenglish;
        this.rtranslate = rtranslate;
    }
}
