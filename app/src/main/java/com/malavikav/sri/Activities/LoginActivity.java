package com.malavikav.sri.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.malavikav.sri.R;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    private String TAG = "LoginActivity";
    AlertDialog alertDialog;
    FloatingActionButton fab;

    TextView textView_id;
    TextView textView_name;
    Typeface ty1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView_id = (TextView) findViewById(R.id.logo);
        textView_name = (TextView) findViewById(R.id.name);


        ty1 = Typeface.createFromAsset(this.getAssets(),  "fonts/SinkinSans-700Bold.otf");
        textView_id.setTypeface(ty1);
        textView_name.setTypeface(ty1);

        email = (EditText) findViewById(R.id.email_et);
        password = (EditText) findViewById(R.id.password_et);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        dialog();


    }

    public void dialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Signing you up...");
//                alertDialogBuilder.setPositiveButton("yes",
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface arg0, int arg1) {
//                                Toast.makeText(LoginActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
//                            }
//                        });


        alertDialog = alertDialogBuilder.create();

    }

    public void login(View view){

        alertDialog.show();

        String userid = email.getText().toString();
        String pswd = password.getText().toString();

        if(userid.trim().equals("Happy Birthday Sri") && pswd.trim().equals("WeLoveYou")){

            GotoMainActivity();

        }else{
            if(alertDialog.isShowing()){
                alertDialog.dismiss();
            }
            Toast.makeText(getApplicationContext(),"User Password Incorrect, TRY AGAIN SRI :)",Toast.LENGTH_LONG).show();
            email.setText("");
            password.setText("");
        }

    }

    public void GotoMainActivity(){
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        if(alertDialog.isShowing()){
            alertDialog.dismiss();
        }
        finish();
    }
}
