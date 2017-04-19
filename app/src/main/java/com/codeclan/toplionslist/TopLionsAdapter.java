package com.codeclan.toplionslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class TopLionsAdapter extends ArrayAdapter<Lion> {

    public TopLionsAdapter(Context context, ArrayList<Lion> lions) {
        super(context, 0, lions);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.lion_item, parent, false);
        }

        Lion currentLion = getItem(position);

        TextView playerPosition = (TextView) listItemView.findViewById(R.id.player_position);
        playerPosition.setText(currentLion.getPlayerPosition().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentLion.getName().toString());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentLion.getYear().toString());

        listItemView.setTag(currentLion);

        return listItemView;

    }
}

