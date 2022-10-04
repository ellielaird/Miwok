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




        ArrayList<String> englishNumbers = new ArrayList<String>();
        englishNumbers.add(0, "One");
        englishNumbers.add(1, "Two");
        englishNumbers.add(2, "Three");
        englishNumbers.add(3, "Four");
        englishNumbers.add(4, "Five");
        englishNumbers.add(5, "Six");
        englishNumbers.add(6, "Seven");
        englishNumbers.add(7, "Eight");
        englishNumbers.add(8, "Nine");
        englishNumbers.add(9, "Ten");





        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, englishNumbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }



}