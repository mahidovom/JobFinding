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

public class JoinNowJobActivity extends AppCompatActivity {
    AutoCompleteTextView edtrecentJob,edtcompaney,edtindustry,edtemploymenttype;
    Switch swchstudent;
    Button btnjoinnow;
    String[] employmentTypeArray={"Full-time","Part-time","Self-employed","Freelance","Contract","Internship","Apprenticeship","Duales Studium","Verbeamtet","Freiwilliges Soziales Jahr","Werkstudium"};
    private JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_now_job);
        edtrecentJob=(AutoCompleteTextView)findViewById(R.id.edtrecentJob);
        edtcompaney=(AutoCompleteTextView)findViewById(R.id.edtcompaney);
        edtindustry=(AutoCompleteTextView)findViewById(R.id.edtindustry);
        btnjoinnow=(Button) findViewById(R.id.btnjoinnow);
       // btnjoinnow=(Button) findViewById(R.id.btnjoinnow);
        edtemploymenttype=(AutoCompleteTextView)findViewById(R.id.edtemploymenttype);
        swchstudent=(Switch)findViewById(R.id.swchstudent);
        Intent intent=getIntent();
        try {
            json=new JSONObject(intent.getStringExtra("ret"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        swchstudent.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    startActivity(new Intent(JoinNowJobActivity.this,JoinNoewJobStudentActivity.class).putExtra("ret",json.toString()));
                }
            }
        });

        AutoCompelet.setit(JoinNowJobActivity.this,edtrecentJob,getJobList.setjobs());
        AutoCompelet.setit(JoinNowJobActivity.this,edtemploymenttype,employmentTypeArray);
        AutoCompelet.setit(JoinNowJobActivity.this,edtindustry,getJobList.setindustry());



    }
    public void btnjoinnow(View view){
        if (edtrecentJob.getText().toString().equals("")||edtcompaney.getText().toString().equals("")||edtindustry.getText().toString().equals("")||edtemploymenttype.getText().toString().equals("")){
            Alert.shows(JoinNowJobActivity.this,"","Please complete the information","OK","");
        }else {
            try {
                json.put("student",false);
                JSONObject jsonObjectinfo=new JSONObject();
                jsonObjectinfo.put("job",edtrecentJob.getText().toString());
                jsonObjectinfo.put("employmenttype",edtemploymenttype.getText().toString());
                jsonObjectinfo.put("company",edtcompaney.getText().toString());
                jsonObjectinfo.put("industry",edtindustry.getText().toString());
                json.put("info",jsonObjectinfo);
            } catch (JSONException e) {
            e.printStackTrace();
        }

            startActivitys.set(JoinNowJobActivity.this,btnjoinnow,new Intent(JoinNowJobActivity.this,LocationAndPictureActivty.class).putExtra("ret",json.toString()));}
    }
}