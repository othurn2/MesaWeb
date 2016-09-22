package com.example.cisc.mesaweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mesaButton;
    Button yahooButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mesaButton = (Button)findViewById(R.id.mesaButton);
        yahooButton = (Button)findViewById(R.id.yahooButton);
        mesaButton.setOnClickListener(this);
        yahooButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.mesaButton:
                Intent i = new Intent(this, MesaWebActivity.class);
                startActivity(i);
                break;

            case R.id.yahooButton:
                Intent j = new Intent(this, YahooWebviewActivity.class);
                startActivity(j);
                break;

        }

    }
}
