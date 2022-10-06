package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);




        ArrayList<WordTranslation> numbers = new ArrayList<WordTranslation>();
        numbers.add(0, new WordTranslation("One", "Lutti"));
        numbers.add(1, new WordTranslation("Two", "Otiiko"));
        numbers.add(2, new WordTranslation("Three", "Tolookosu"));
        numbers.add(3, new WordTranslation("Four", "Oyyisa"));
        numbers.add(4, new WordTranslation("Five", "Massokka"));
        numbers.add(5, new WordTranslation("Six", "Temmokka"));
        numbers.add(6, new WordTranslation("Seven", "Kenekaku"));
        numbers.add(7, new WordTranslation("Eight", "Kawinta"));
        numbers.add(8, new WordTranslation("Nine", "Wo'e"));
        numbers.add(9, new WordTranslation("Ten", "na'aacha"));




        WordTranslationAdaptor adaptor = new WordTranslationAdaptor(this, R.layout.numberslistitem, numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adaptor);


    }



}