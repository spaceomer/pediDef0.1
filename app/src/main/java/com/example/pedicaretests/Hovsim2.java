package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Hovsim2 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip44);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://survey.zohopublic.com/zs/I5ChiD");
        webView.getSettings()
                .setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
            Toast.makeText(this, "Going back", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Exiting", Toast.LENGTH_SHORT).show();
        }

        super.onBackPressed();
    }
}