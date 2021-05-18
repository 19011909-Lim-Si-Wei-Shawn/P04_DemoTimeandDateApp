package sg.edu.rp.c346.id19011909.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        btnReset = findViewById(R.id.buttonReset);
        tvDisplay = findViewById(R.id.textView);

        //Setting Action,
        //Button Time,
        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button Action,
                tvDisplay.setText("Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute());

            }
        });

        //Button Date,
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button Action,
                int month = dp.getMonth() + 1;
                tvDisplay.setText("Date is " + dp.getDayOfMonth() + "/" + month + "/" + dp.getYear());
            }
        });

        //Button Reset,
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Button Action,
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                tp.setIs24HourView(Boolean.FALSE);
                dp.updateDate(2020,00,01);
                tvDisplay.setText("");
            }
        });
        
    }

}