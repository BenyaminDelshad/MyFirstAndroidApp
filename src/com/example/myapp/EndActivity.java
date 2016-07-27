package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

/**
 * Created by Benyamin on 7/27/2016.
 */
public class EndActivity extends Activity {
    final static String EXTRA_NAME = "name";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.endactivty);
        /*String username = getIntent().getStringExtra(EXTRA_NAME).toString();
        TextView userText = (TextView) findViewById(R.id.userText);
        userText.setText("\n " + username + " It is time to go :|\n");
        */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 5000);

    }

}