package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<WordTranslation> phrases = new ArrayList<WordTranslation>();
        phrases.add(0, new WordTranslation("Where are you going?" ,"minto wuksus"));
        phrases.add(1, new WordTranslation("What is your name??" ,"tinnә oyaase'nә"));
        phrases.add(2, new WordTranslation("My name is..." ,"oyaaset"));
        phrases.add(3, new WordTranslation("How are you feeling?" ,"michәksәs?"));
        phrases.add(4, new WordTranslation("I'm feeling good." ,"kuchi achit"));
        phrases.add(5, new WordTranslation("Are you coming?","әәnәs'aa?"));
        phrases.add(6, new WordTranslation("Yes, I'm coming." ,"hәә’ әәnәm"));
        phrases.add(7, new WordTranslation("I'm coming." ,"әәnәm"));
        phrases.add(8, new WordTranslation("Let's go." ,"yoowutis"));
        phrases.add(9, new WordTranslation("Come here." ,"әnni'nem"));

        wordTranslationWithoutPhotoAdaptor adaptor2 = new wordTranslationWithoutPhotoAdaptor(this, R.layout.listitem_nophoto, phrases);

        ListView listView = (ListView)findViewById(R.id.list4);

        listView.setAdapter(adaptor2);

    }
}