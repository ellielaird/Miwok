package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<WordTranslation> colors = new ArrayList<WordTranslation>();
        colors.add(0, new WordTranslation("red", "weṭeṭṭi"));
        colors.add(1, new WordTranslation("green", "chokokki"));
        colors.add(2, new WordTranslation("brown", "ṭakaakki"));
        colors.add(3, new WordTranslation("gray", "ṭopoppi"));
        colors.add(4, new WordTranslation("black", "kululli"));
        colors.add(5, new WordTranslation("white", "kelelli"));
        colors.add(6, new WordTranslation("dusty yellow", "ṭopiisә"));
        colors.add(7, new WordTranslation("mustard yellow", "chiwiiṭә"));

        wordTranslationWithPhotoAdaptor adaptor = new wordTranslationWithPhotoAdaptor(this, R.layout.colorslistitem, colors);

        ListView listView = (ListView)findViewById(R.id.list3);

        listView.setAdapter(adaptor);
    }
}