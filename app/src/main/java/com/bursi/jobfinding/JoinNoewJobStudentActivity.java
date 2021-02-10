package com.bursi.jobfinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import org.json.JSONException;
import org.json.JSONObject;

public class JoinNoewJobStudentActivity extends AppCompatActivity {
    AutoCompleteTextView edtunvername,edtDegree,edtstart,edtend;
    Button btnjoinnowstu;
    Switch swchstuden;
    private JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_noew_job_student);
        Intent intent=getIntent();
        try {
            json=new JSONObject(intent.getStringExtra("ret"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        edtunvername=(AutoCompleteTextView)findViewById(R.id.edtunvername);
        edtDegree=(AutoCompleteTextView)findViewById(R.id.edtDegree);
        edtstart=(AutoCompleteTextView)findViewById(R.id.edtstart);
        edtend=(AutoCompleteTextView)findViewById(R.id.edtend);
        btnjoinnowstu=(Button) findViewById(R.id.btnjoinnowstu);
        swchstuden=(Switch) findViewById(R.id.swchstuden);
        swchstuden.setChecked(true);
        swchstuden.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked){
                    startActivity(new Intent(JoinNoewJobStudentActivity.this,JoinNowJobActivity.class).putExtra("ret",json.toString()));
                }
            }
        });

    }
    public void btnjoinnowstu(View view){
        if (edtunvername.getText().toString().equals("")||edtDegree.getText().toString().equals("")||edtstart.getText().toString().equals("")||edtend.getText().toString().equals("")){
            Alert.shows(JoinNoewJobStudentActivity.this,"","Please complete the information","OK","");
        }else {
            try {
                json.put("student",true);
                JSONObject jsonObjectinfo=new JSONObject();
                jsonObjectinfo.put("university",edtunvername.getText().toString());
                jsonObjectinfo.put("Degree",edtDegree.getText().toString());
                jsonObjectinfo.put("startyear",edtstart.getText().toString());
                jsonObjectinfo.put("endyear",edtend.getText().toString());
                json.put("info",jsonObjectinfo);

            } catch (JSONException e) {
                e.printStackTrace();
            }
            startActivitys.set(JoinNoewJobStudentActivity.this,btnjoinnowstu,new Intent(JoinNoewJobStudentActivity.this,LocationAndPictureActivty.class).putExtra("ret",json.toString()));}
    }
}