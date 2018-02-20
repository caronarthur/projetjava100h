package com.lamy.mathilde.catholog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class OldEventsActivity extends AppCompatActivity {

    private ListView listEventPasse ;
    private String[] eventNamePasse ;
    private String[] eventPlacePasse ;
    private String[] eventDatePasse ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_events);

        ListAdapterNews adapter = new ListAdapterNews(this,eventNamePasse,eventPlacePasse,eventDatePasse) ;




    }
}
