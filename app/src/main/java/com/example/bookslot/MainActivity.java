package com.example.bookslot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    Button confirmButtonSlot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker = findViewById(R.id.datepicker);
        confirmButtonSlot = findViewById(R.id.confirmButtonSlot);
        confirmButtonSlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getSelectedDate(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private String getSelectedDate() {
        StringBuilder builder=new StringBuilder();;
        builder.append((datePicker.getMonth() + 1)+"/");
        builder.append(datePicker.getDayOfMonth()+"/");
        builder.append(datePicker.getYear());
        return builder.toString();
    }
}