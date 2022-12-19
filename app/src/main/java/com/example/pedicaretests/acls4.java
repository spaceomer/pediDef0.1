package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class acls4 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acls1);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://317feed9-63f0-4dbd-82f3-0e4defb53ee1.filesusr.com/ugd/18fb9f_af8323cea8f34c76ab531560ac1dcdaf.pdf");
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