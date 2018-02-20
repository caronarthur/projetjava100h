package com.lamy.mathilde.catholog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapterOldEvents extends ArrayAdapter<String> {

        private final Activity context;
        private final String[] eventName ;
        private final String[] eventPlace ;
        private final String[] eventDate ;

        public ListAdapterOldEvents (Activity context, String[] eventName, String[] eventPlace, String[] eventDate) {
            super(context, R.layout.list,eventName);
            this.context=context ;
            this.eventName=eventName;
            this.eventPlace=eventPlace;
            this.eventDate=eventDate;

        }
        public View getView(int position, View vieuw, ViewGroup parent) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            View rowView = layoutInflater.inflate(R.layout.list, null,true);

            TextView titreListe = (TextView) rowView.findViewById(R.id.textViewNomEvent);
            TextView descriptionListe = (TextView) rowView.findViewById(R.id.textViewLieuEvent);
            TextView dateListe = (TextView) rowView.findViewById(R.id.textViewDate);


            titreListe.setText(eventName[position]);
            descriptionListe.setText(eventPlace[position]);
            dateListe.setText(eventDate[position]);
            return rowView;
        }

    }

