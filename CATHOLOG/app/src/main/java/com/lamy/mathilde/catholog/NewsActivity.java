package com.lamy.mathilde.catholog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.layout.activity_list_item;

public class NewsActivity extends AppCompatActivity {

    private ListView listEvent ;
    private String[] events = new String[]{"afterwork","concours","concert"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        listEvent = (ListView) findViewById(R.id.listViewEvent);
        //ListAdapterNews adapter = new ListAdapterNews(this,eventName,eventPlace,eventDate) ;
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(NewsActivity.this,
                android.R.layout.simple_list_item_1 , events );
        listEvent.setAdapter(adapter);
    }
}
