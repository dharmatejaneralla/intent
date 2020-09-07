package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button sendbtn;
EditText sendtext;
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  sendbtn = findViewById(R.id.sendbtn);
        sendtext = findViewById(R.id.etsend);
    }

    public void sendtect(View view) {
        Intent i = new Intent(this,SecondActivity.class);
        String msg = sendtext.getText().toString();
        i.putExtra(EXTRA_MESSAGE,msg);
        startActivity(i);

    }
}