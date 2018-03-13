package com.lamy.mathilde.catholog.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.lamy.mathilde.catholog.Class.Event;
import com.lamy.mathilde.catholog.R;

import java.util.ArrayList;

public class OldEventsActivity extends AppCompatActivity {


    private ArrayList<Event> pastEventList = new ArrayList<>();
    private ListView pastEvents ;
    private Adapter pastEventsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_events);

        pastEvents = (ListView) findViewById(R.id.past_events);

        // On crée l'adapter par rapport aux données présentes dans la liste
        pastEventsAdapter = new ListAdapterEvents(this, pastEventList);
        // On attache l'adapter
        pastEvents.setAdapter((ListAdapter) pastEventsAdapter);
        // On crée enfin la méthode qui va détecter le clic sur un item en particulier
        pastEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent eventPreview = new Intent(OldEventsActivity.this, OldEventsActivity.class);
                eventPreview.putExtra("eventName", pastEventList.get(i).getNameEvent());
                eventPreview.putExtra("dateStart", pastEventList.get(i).getDateStart());
                eventPreview.putExtra("dateEnd",pastEventList.get(i).getDateEnd()) ;
                eventPreview.putExtra("latitude", pastEventList.get(i).getLatitude());
                eventPreview.putExtra("longitude", pastEventList.get(i).getLongitude());
                eventPreview.putExtra("prix", pastEventList.get(i).getPrix());
                eventPreview.putExtra("nbParticip", pastEventList.get(i).getNbParticip());
                startActivity(eventPreview);
            }
        });





    }
}
