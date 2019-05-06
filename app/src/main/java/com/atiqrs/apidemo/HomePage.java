package com.atiqrs.apidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView F,L,E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Intent intent = getIntent();


        String First = intent.getStringExtra("first");
        String Last = intent.getStringExtra("last");
        String Email = intent.getStringExtra("email");

        Log.d("show", First);
        F = findViewById(R.id.f);
        L = findViewById(R.id.l);
        E = findViewById(R.id.e);

        F.setText(First);
        L.setText(Last);
        E.setText(Email);

    }
}
