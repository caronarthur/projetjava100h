package com.lamy.mathilde.catholog;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;

public class CalendrierActivity extends AppCompatActivity {

    private CalendarView calendrier ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendrier);

        calendrier = (CalendarView) findViewById(R.id.calendarView);
    }
}
