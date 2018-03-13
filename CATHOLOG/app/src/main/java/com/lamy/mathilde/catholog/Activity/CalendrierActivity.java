package com.lamy.mathilde.catholog.Activity;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;

import com.lamy.mathilde.catholog.R;

public class CalendrierActivity extends AppCompatActivity {

    private CalendarView calendrier ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendrier);

        calendrier = (CalendarView) findViewById(R.id.calendarView);
    }
}
