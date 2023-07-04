package com.example.al_furqan;

public class namesdata {
        private String arabicName;
        private String englishName;
        private String translation;

        public namesdata(String arabicName, String englishName, String translation) {
            this.arabicName = arabicName;
            this.englishName = englishName;
            this.translation = translation;
        }

        public String getArabicName() {
            return arabicName;
        }

        public String getEnglishName() {
            return englishName;
        }

        public String getTranslation() {
            return translation;
        }
}
