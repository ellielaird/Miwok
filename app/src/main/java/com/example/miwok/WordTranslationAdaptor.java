package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordTranslationAdaptor extends ArrayAdapter<WordTranslation> {

    public WordTranslationAdaptor (Context context, int id, ArrayList<WordTranslation> list)
    {
        super (context, id, list);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View currentItemView = convertView;
        if(currentItemView == null)
        {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.numberslistitem, parent, false);
        }

    }
}
