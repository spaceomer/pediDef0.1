package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class bls1 extends AppCompatActivity {

    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bls1);

        webView2 = findViewById(R.id.webView3);

        webView2.setWebViewClient(new WebViewClient());

        webView2.loadUrl("https://survey.zohopublic.com/zs/avBUDY");
        webView2.getSettings()
                .setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(webView2.canGoBack()){
            webView2.goBack();
            Toast.makeText(this, "Going back", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Exiting", Toast.LENGTH_SHORT).show();
        }

        super.onBackPressed();
    }
}