package com.bursi.jobfinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class ForgotPasswordActivity extends AppCompatActivity {
    TextInputLayout inptcode;
    Button btnforgetemail,btnresend;
    EditText edtCode,edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        btnforgetemail=(Button)findViewById(R.id.btnforgetemail);
        btnresend=(Button)findViewById(R.id.btnresend);
        edtCode=(EditText) findViewById(R.id.edtCode);
        edtEmail=(EditText) findViewById(R.id.edtEmail);
        inptcode=(TextInputLayout)findViewById(R.id.inptcode);

    }
    public void btnforgetemail(View view){
        //send req for code
        Alert.shows(ForgotPasswordActivity.this,"","We will send a reset link to your email","OK","");
        inptcode.setVisibility(View.VISIBLE);
        btnforgetemail.setText("Submit");


    }
    public void btnresend(View view){
        //send req for code
    }
}