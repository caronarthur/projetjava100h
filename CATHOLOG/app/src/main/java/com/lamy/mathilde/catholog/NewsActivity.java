package com.lamy.mathilde.catholog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class NewsActivity extends AppCompatActivity {

    private ListView listEvent ;
    private String[] eventName ;
    private String[] eventPlace ;
    private String[] eventDate ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ListAdapterNews adapter = new ListAdapterNews(this,eventName,eventPlace,eventDate) ;

    }
}
