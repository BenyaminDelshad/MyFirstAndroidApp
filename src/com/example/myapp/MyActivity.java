package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.System.*;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */


    Button nothingButton;
    TextView notifText;
    EditText username;
    int number;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        number = 0;
        nothingButton = (Button) findViewById(R.id.nothingButton);
        notifText = (TextView) findViewById(R.id.notifText);
        username = (EditText) findViewById(R.id.username);
    }
    public void ButtonClicked (View v) {
        System.out.println("Button Clicked!");
        number++;
        if(number < 50)
            notifText.setText("You just clicked " + number + " times! :D");
        else
            notifText.setText("You just clicked " + number + " times! :D\n" + "You are so ALLAF " + username.getText().toString() + "!");

        if(number > 100) {
            finish();
            Intent i = new Intent(MyActivity.this, EndActivity.class);
            i.putExtra(EndActivity.EXTRA_NAME, username.getText());
            startActivity(i);
        }

    }
}
