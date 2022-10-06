package com.example.miwok;

public class WordTranslation {
    private String englishWord;
    private String miwokWord;

    public WordTranslation(String e, String m)
    {
        englishWord = e;
        miwokWord = m;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }
}
