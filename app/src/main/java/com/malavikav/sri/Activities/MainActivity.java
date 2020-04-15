package com.malavikav.sri.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.malavikav.sri.Activities.LoginActivity;
import com.malavikav.sri.R;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Typeface ty1;


    protected int _splashTime = 3000; // time to display the splash screen in ms
    public boolean is_first = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UIinit();

        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while ((waited < _splashTime)) {
                        sleep(100);
//                        if (_active) {
                        waited += 100;
//                            if(waited>_splashTime-200)
//                            {
//
////                            }
//                        }
                    }
                } catch (Exception e) {

                } finally {                    {


                    startActivity(new Intent(MainActivity.this,
                            LoginActivity.class));

                }
                    finish();
                }
            };
        };

        splashTread.start();

    }

    public void UIinit(){

        textView = (TextView) findViewById(R.id.splashtext);
        ty1 = Typeface.createFromAsset(this.getAssets(),  "fonts/SinkinSans-700Bold.otf");
        textView.setTypeface(ty1);


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP){
            // Do something for lollipop and above versions
            // Hide status bar
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else{
            // do something for phones running an SDK before lollipop
        }
    }

}
