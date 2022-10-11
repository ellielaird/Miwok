package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<WordTranslation> familyMembers = new ArrayList<WordTranslation>();

        familyMembers.add(0, new WordTranslation("father", "әpә"));
        familyMembers.add(1, new WordTranslation("mother", "әṭa"));
        familyMembers.add(2, new WordTranslation("son", "angsi"));
        familyMembers.add(3, new WordTranslation("daughter", "tune"));
        familyMembers.add(4, new WordTranslation("older brother", "taachi"));
        familyMembers.add(5, new WordTranslation("younger brother", "chalitti"));
        familyMembers.add(6, new WordTranslation("older sister", "tete"));
        familyMembers.add(7, new WordTranslation("younger sister", "kolliti"));
        familyMembers.add(8, new WordTranslation("grandmother", "ama"));
        familyMembers.add(2, new WordTranslation("grandfather", "paapa"));

        wordTranslationWithPhotoAdaptor adaptor = new wordTranslationWithPhotoAdaptor(this, R.layout.familymemberslistitem, familyMembers);

        ListView listView = (ListView)findViewById(R.id.list2);

        listView.setAdapter(adaptor);


    }
}