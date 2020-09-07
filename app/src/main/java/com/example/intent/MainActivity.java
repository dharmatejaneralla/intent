package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Button sendbtn;
EditText sendtext;
TextView reply;
    public static int TEXT_REQUEST=1;
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  sendbtn = findViewById(R.id.sendbtn);
        sendtext = findViewById(R.id.etsend);
        reply = findViewById(R.id.replymsg);
    }

    public void sendtect(View view) {
        Intent i = new Intent(this,SecondActivity.class);
        String msg = sendtext.getText().toString();
        i.putExtra(EXTRA_MESSAGE,msg);
        startActivityForResult(i,TEXT_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (TEXT_REQUEST== requestCode && resultCode == RESULT_OK)
        {
            String replymsg = data.getStringExtra(SecondActivity.EXTRA_REPLY);
            reply.setText(replymsg);
            reply.setVisibility(View.VISIBLE);

        }
    }
}