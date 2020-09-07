package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView txt;
EditText etreply;
public static final String EXTRA_REPLY = "com.example.android.intent.extra.REPLY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        String msg = i.getStringExtra(MainActivity.EXTRA_MESSAGE);
        txt = findViewById(R.id.text_message);
        txt.setText(msg);
        etreply = findViewById(R.id.etreply);
    }

    public void sendreply(View view) {
        String replymsg = etreply.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(EXTRA_REPLY,replymsg);
        setResult(RESULT_OK,intent);
        finish();
    }
}