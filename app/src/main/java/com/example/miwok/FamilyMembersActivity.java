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

        familyMembers.add(0, new WordTranslation("father", "әpә", R.drawable.family_father));
        familyMembers.add(1, new WordTranslation("mother", "әṭa", R.drawable.family_mother));
        familyMembers.add(2, new WordTranslation("son", "angsi", R.drawable.family_son));
        familyMembers.add(3, new WordTranslation("daughter", "tune", R.drawable.family_daughter));
        familyMembers.add(4, new WordTranslation("older brother", "taachi", R.drawable.family_older_brother));
        familyMembers.add(5, new WordTranslation("younger brother", "chalitti", R.drawable.family_younger_brother));
        familyMembers.add(6, new WordTranslation("older sister", "tete", R.drawable.family_older_sister));
        familyMembers.add(7, new WordTranslation("younger sister", "kolliti", R.drawable.family_younger_sister));
        familyMembers.add(8, new WordTranslation("grandmother", "ama", R.drawable.family_grandmother));
        familyMembers.add(2, new WordTranslation("grandfather", "paapa", R.drawable.family_grandfather));

        wordTranslationWithPhotoAdaptor adaptor = new wordTranslationWithPhotoAdaptor(this, R.layout.listitem_photo, familyMembers);

        ListView listView = (ListView)findViewById(R.id.list2);

        listView.setAdapter(adaptor);


    }
}