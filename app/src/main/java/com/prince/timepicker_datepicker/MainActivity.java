package com.prince.timepicker_datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
private Button buttontime;
private Button buttondate;
private TextView textView;
private TextView textView2;
private TimePicker timePicker;
private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        buttondate=findViewById(R.id.button2);
        buttontime=findViewById(R.id.button);
        timePicker=findViewById(R.id.timepicker);
        datePicker=findViewById(R.id.datePicker);
        buttontime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePicker.setVisibility(View.VISIBLE);
                datePicker.setVisibility(View.INVISIBLE);

                textView.setText(timePicker.getCurrentHour()+" : "+timePicker.getCurrentMinute());
            }
        });
        buttondate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.setVisibility(View.VISIBLE);
                timePicker.setVisibility(View.INVISIBLE);

                textView2.setText(datePicker.getYear()+"/"+datePicker.getMonth()+1+"/"+datePicker.getDayOfMonth());
            }
        });

    }
}
