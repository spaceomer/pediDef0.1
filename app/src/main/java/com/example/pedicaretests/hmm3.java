package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class hmm3 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmm3);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings()
                .setJavaScriptEnabled(true);

        webView.loadUrl("https://sheet.zohopublic.com/sheet/published/otyj24e25c662270a4c2b8a1af650f0aa5d99?mode=embed");
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