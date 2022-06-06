package com.example.auto;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] bike ={"Ampere","Avon","Atlas","BlackSmith","BMW","CFMoto","Demak","Ducati","EBike","Evolet","GenXt","Hero","Hero Honda","Honda","Hi-Bird","Joy","KTM","Kawaski","Kinetic","Kanda","Mahindra","RK Motors","Royal Enfield","Revolt","Techno","TVS","Yamaha"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,bike);
        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv =  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);
    }
}