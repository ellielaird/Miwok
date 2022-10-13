package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class wordTranslationWithoutPhotoAdaptor extends ArrayAdapter<WordTranslation> {

    public wordTranslationWithoutPhotoAdaptor(Context context, int id, ArrayList<WordTranslation> list)
    {
        super (context, id, list);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View currentItemView = convertView;


        if(currentItemView == null)
        {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.listitem_nophoto, parent, false);
        }

        WordTranslation currentWord = (WordTranslation) getItem(position);

        TextView tvMiWok = currentItemView.findViewById(R.id.MiwokPhrases);
        tvMiWok.setText(currentWord.getMiwokWord());

        TextView tvEnglish = currentItemView.findViewById(R.id.EnglishPhrases);
        tvEnglish.setText(currentWord.getEnglishWord());

        return currentItemView;

    }
}
