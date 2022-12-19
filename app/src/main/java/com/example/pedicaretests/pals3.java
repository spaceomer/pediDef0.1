package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class pals3 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pals3);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://317feed9-63f0-4dbd-82f3-0e4defb53ee1.filesusr.com/ugd/18fb9f_af5af005765442d6aee807ad177df70a.pdf?index=true");
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