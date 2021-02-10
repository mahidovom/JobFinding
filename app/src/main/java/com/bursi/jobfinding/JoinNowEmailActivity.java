package com.bursi.jobfinding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

public class JoinNowEmailActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener{

    private TextInputLayout textInputLayout;
    EditText edtEmail,edtpassword;
    Button btnEmailJoin;
    private GoogleApiClient googleApiClient;
    private GoogleSignInOptions gso;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_now_email);
        textInputLayout=(TextInputLayout)findViewById(R.id.inputTextPhoneRe);
        edtEmail=(EditText)findViewById(R.id.edtEmail);
        edtpassword=(EditText)findViewById(R.id.edtEmail);
        btnEmailJoin=(Button) findViewById(R.id.btnEmailJoin);
        intent=getIntent();
        if (intent!=null){
            gso =  new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestEmail()
                    .build();

            googleApiClient=new GoogleApiClient.Builder(this)
                    .enableAutoManage(this,this)
                    .addApi(Auth.GOOGLE_SIGN_IN_API,gso)
                    .build();
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        if (intent!=null){
        OptionalPendingResult<GoogleSignInResult> opr= Auth.GoogleSignInApi.silentSignIn(googleApiClient);
        if(opr.isDone()){
            GoogleSignInResult result=opr.get();
            handleSignInResult(result);
        }else{
            opr.setResultCallback(new ResultCallback<GoogleSignInResult>() {
                @Override
                public void onResult(@NonNull GoogleSignInResult googleSignInResult) {
                    handleSignInResult(googleSignInResult);
                }
            });
        }}
    }
    public void btnEmailJoin(View view){
        if (textInputLayout.getVisibility()==View.GONE){
            if (isEmailValid(edtEmail.getText().toString())){
                textInputLayout.setVisibility(View.VISIBLE);
            }else {
                Alert.shows(JoinNowEmailActivity.this,"","Email is wrong","OK","");
            }
        }else {
            JSONObject jsonObject=new JSONObject();
            try {
                jsonObject.put("email",edtEmail.getText().toString());
                jsonObject.put("pass",edtpassword.getText().toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }

            startActivitys.set(JoinNowEmailActivity.this,btnEmailJoin,new Intent(JoinNowEmailActivity.this,JoinNowNameActivity.class).putExtra("ret",jsonObject.toString()));
        }
    }
    public static boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private void handleSignInResult(GoogleSignInResult result){
        if(result.isSuccess()){
            GoogleSignInAccount account=result.getSignInAccount();


            edtEmail.setText(account.getEmail());


        }else{
            Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }
}