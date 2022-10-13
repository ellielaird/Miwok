package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);




        ArrayList<WordTranslation> numbers = new ArrayList<WordTranslation>();
        numbers.add(0, new WordTranslation("One", "Lutti", R.drawable.number_one));
        numbers.add(1, new WordTranslation("Two", "Otiiko", R.drawable.number_two));
        numbers.add(2, new WordTranslation("Three", "Tolookosu", R.drawable.number_three));
        numbers.add(3, new WordTranslation("Four", "Oyyisa", R.drawable.number_four));
        numbers.add(4, new WordTranslation("Five", "Massokka", R.drawable.number_five));
        numbers.add(5, new WordTranslation("Six", "Temmokka", R.drawable.number_six));
        numbers.add(6, new WordTranslation("Seven", "Kenekaku", R.drawable.number_seven));
        numbers.add(7, new WordTranslation("Eight", "Kawinta", R.drawable.number_eight));
        numbers.add(8, new WordTranslation("Nine", "Wo'e", R.drawable.number_nine));
        numbers.add(9, new WordTranslation("Ten", "na'aacha", R.drawable.number_ten));




        wordTranslationWithPhotoAdaptor adaptor = new wordTranslationWithPhotoAdaptor(this, R.layout.listitem_photo, numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adaptor);


    }



}