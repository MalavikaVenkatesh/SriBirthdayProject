package com.malavikav.sri.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.malavikav.sri.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void open1(View view){
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("message",1);
        startActivity(intent);
    }
    public void open2(View view){
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("message",2);
        startActivity(intent);
    }
    public void open3(View view){
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("message",3);
        startActivity(intent);
    }
    public void open4(View view){
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("message",4);
        startActivity(intent);
    }
    public void open5(View view){
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("message",5);
        startActivity(intent);
    }
    public void open6(View view){
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("message",6);
        startActivity(intent);
    }
    public void open7(View view){
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("message",7);
        startActivity(intent);
    }

    public void open8(View view){
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("message",8);
        startActivity(intent);
    }

}
