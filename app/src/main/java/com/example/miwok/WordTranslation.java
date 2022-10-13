package com.example.miwok;

public class WordTranslation {
    private String englishWord;
    private String miwokWord;
    int imageId;

    public WordTranslation(String e, String m)
    {
        englishWord = e;
        miwokWord = m;
        imageId = -1;
    }

    public WordTranslation(String e, String m, int i)
    {
        englishWord = e;
        miwokWord = m;
        imageId = i;
    }


    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getImageId() {
        return imageId;
    }
}
