package com.example.al_furqan;

public class irritatedduas {
    String heading;
    String duainarabic;
    String duainenglish;
    String translation;

    public String getDuainarabic() {
        return duainarabic;
    }

    public void setDuainarabic(String duainarabic) {
        this.duainarabic = duainarabic;
    }

    public String getDuainenglish() {
        return duainenglish;
    }

    public void setDuainenglish(String duainenglish) {
        this.duainenglish = duainenglish;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public irritatedduas(String heading, String duainarabic, String duainenglish, String translation) {
        this.heading = heading;
        this.duainarabic = duainarabic;
        this.duainenglish = duainenglish;
        this.translation = translation;
    }
}
