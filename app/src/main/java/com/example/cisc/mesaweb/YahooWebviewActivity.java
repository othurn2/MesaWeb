package com.example.cisc.mesaweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YahooWebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo_webview);
        WebView yahooView = (WebView)findViewById(R.id.webView);
        yahooView.setWebViewClient(new WebViewClient());
        yahooView.loadUrl("https://www.yahoo.com/");
    }
}
