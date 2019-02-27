package com.example.belal.signlanguageproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<String,Sign> database = new HashMap<String, Sign>();
        database.put("000000", new Sign("Zero","",0,0));
        database.put("020000", new Sign("One","",0,0));
        database.put("022000", new Sign("Two","",0,0));
        database.put("222000", new Sign("Three","",0,0));
        database.put("022220", new Sign("Four","",0,0));
        database.put("222220", new Sign("Five","",0,0));
        database.put("022200", new Sign("Six","",0,0));
        database.put("022020", new Sign("Seven","",0,0));
        database.put("020220", new Sign("Eight","",0,0));
        database.put("012220", new Sign("Nine","",0,0));
        database.put("200000", new Sign("A","",0,0));
        //database.put("", new Sign("B","",0,0)); //similar to "4"
        database.put("211111", new Sign("C","",0,0));
        database.put("021110", new Sign("D","",0,0));
        database.put("011110", new Sign("E","",0,0));
        //database.put("", new Sign("F","",0,0)); //similar to "9"
        database.put("220002", new Sign("G","",0,0));
        database.put("222002", new Sign("H","",0,0));
        database.put("000020", new Sign("I","",0,0));
        //database.put("", new Sign("J","",0,0)); // requires motion
        //database.put("", new Sign("K","",0,0)); //similar to "3"
        database.put("220000", new Sign("L","",0,0));
        //database.put("", new Sign("M","",0,0)); // similar to "N"
        //database.put("", new Sign("N","",0,0)); // similar to "M"
        //database.put("", new Sign("O","",0,0)); // same as Zero
        database.put("221003", new Sign("P","",0,0));
        database.put("220003", new Sign("Q","",0,0));
        //database.put("", new Sign("R","",0,0));
        //database.put("", new Sign("S","",0,0));
        //database.put("", new Sign("T","",0,0));
        //database.put("", new Sign("U","",0,0));
        //database.put("", new Sign("V","",0,0));
        //database.put("", new Sign("W","",0,0));
        database.put("010000", new Sign("X","",0,0));
        database.put("200020", new Sign("Y","",0,0));
        //database.put("", new Sign("Z","",0,0)); //requires motion


    }
}
