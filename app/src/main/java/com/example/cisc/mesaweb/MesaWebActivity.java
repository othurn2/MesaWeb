package com.example.cisc.mesaweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MesaWebActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa_web);
        WebView mesaWeb = (WebView)findViewById(R.id.mesaWebview);
        mesaWeb.setWebViewClient(new WebViewClient());
        mesaWeb.loadUrl("http://www.sdmesa.edu/");
    }
}
