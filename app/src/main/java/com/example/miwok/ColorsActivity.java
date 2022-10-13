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
        colors.add(0, new WordTranslation("red", "weṭeṭṭi",R.drawable.color_red));
        colors.add(1, new WordTranslation("green", "chokokki", R.drawable.color_green));
        colors.add(2, new WordTranslation("brown", "ṭakaakki", R.drawable.color_brown));
        colors.add(3, new WordTranslation("gray", "ṭopoppi", R.drawable.color_gray));
        colors.add(4, new WordTranslation("black", "kululli", R.drawable.color_black));
        colors.add(5, new WordTranslation("white", "kelelli", R.drawable.color_white));
        colors.add(6, new WordTranslation("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        colors.add(7, new WordTranslation("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        wordTranslationWithPhotoAdaptor adaptor = new wordTranslationWithPhotoAdaptor(this, R.layout.listitem_photo, colors);

        ListView listView = (ListView)findViewById(R.id.list3);

        listView.setAdapter(adaptor);
    }
}