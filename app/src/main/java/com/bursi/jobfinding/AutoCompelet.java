package com.bursi.jobfinding;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompelet {
    public static void setit(Context context,AutoCompleteTextView actv, String[] aray){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (context, android.R.layout.select_dialog_item, aray);
        //Getting the instance of AutoCompleteTextView
        actv.setThreshold(0);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event){
                actv.showDropDown();
                return false;
            }
        });

    }
}
