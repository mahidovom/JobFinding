package com.bursi.jobfinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import org.json.JSONException;
import org.json.JSONObject;

public class LocationAndPictureActivty extends AppCompatActivity {
    AutoCompleteTextView edtlocation;
    Button btnloc,btnSkip;
    private JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_and_picture_activty);
        edtlocation=(AutoCompleteTextView)findViewById(R.id.edtlocation);
        AutoCompelet.setit(LocationAndPictureActivty.this,edtlocation,GetCountry.getc());
        btnloc=(Button)findViewById(R.id.btnloc);
        btnSkip=(Button)findViewById(R.id.btnSkip);
        Intent intent=getIntent();
        try {
            json=new JSONObject(intent.getStringExtra("ret"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public void btnloc(View view){
        try {
            json.put("location",edtlocation.getText().toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        startActivitys.set(LocationAndPictureActivty.this,btnloc,new Intent(LocationAndPictureActivty.this,PictureActivity.class).putExtra("ret",json.toString()));

    }
    public void btnSkip(View view){
        try {
            json.put("location","");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        startActivitys.set(LocationAndPictureActivty.this,btnSkip,new Intent(LocationAndPictureActivty.this,PictureActivity.class).putExtra("ret",json.toString()));
    }
}