package com.example.android.dummyphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class dummy extends AppCompatActivity {
    TextView showmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);
        showmessage=(TextView) findViewById(R.id.showMessage);
        if(getIntent().getData()!=null)
        {
            showmessage.setText(getIntent().getData().toString());
        }
        else
        {
            showmessage.setText("No Number is given");
            Toast.makeText(this, "Give a number here.", Toast.LENGTH_SHORT).show();
        }
    }
}
