package com.bursi.jobfinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class JoinNowNameActivity extends AppCompatActivity {
    Button btnsetname;
    EditText edtFirstName,edtLastName;
    private JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_now_name);
        btnsetname=(Button)findViewById(R.id.btnsetname);
        edtFirstName=(EditText)findViewById(R.id.edtFirstName);
        edtLastName=(EditText)findViewById(R.id.edtLastName);
        Intent intent=getIntent();
        try {
            json=new JSONObject(intent.getStringExtra("ret"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public void btnsetname(View view){
        if (edtFirstName.getText().toString().equals("")||edtLastName.getText().toString().equals("")){
            Alert.shows(JoinNowNameActivity.this,"","please type your name for us","OK","");
        }else {
            try {
                json.put("firstName",edtFirstName.getText().toString());
                json.put("lastName",edtLastName.getText().toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            startActivitys.set(JoinNowNameActivity.this,btnsetname,new Intent(JoinNowNameActivity.this,JoinNowJobActivity.class).putExtra("ret",json.toString()));
        }
    }
}