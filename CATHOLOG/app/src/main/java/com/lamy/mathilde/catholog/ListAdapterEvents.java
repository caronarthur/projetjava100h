package com.lamy.mathilde.catholog;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class ListAdapterEvents extends ArrayAdapter<Event> {

    public ListAdapterEvents(Context context, ArrayList<Event> eventArrayList) {
            super(context, 0, eventArrayList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            // Etape 1 : On récupère une liste de courses particulière
            Event event = getItem(position);

            // Etape 2 : On utilise le LayoutInflater pour inclure le layout list_item
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
            }

            // Etape 3 : On récupère la référence du champ de texte shoppingListName
            TextView eventName = (TextView) convertView.findViewById(R.id.eventName);
            TextView dateName = (TextView) convertView.findViewById(R.id.eventDate) ;

            // Etape 4 : On inclus le nom de la liste et la couleur de la liste sur la vue texte
            eventName.setText(event.getNameEvent());
            // dateName.setText(event.getDateStart());

            // Etape 5 : On retournne la vue créée
            return convertView;
        }

    private String getDate(long date){
        return DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.getDefault()).format(date * 1000L);
    }
}


