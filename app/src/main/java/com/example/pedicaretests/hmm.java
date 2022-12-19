package com.example.pedicaretests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class hmm extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmm);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings()
                .setJavaScriptEnabled(true);

        webView.loadUrl("https://sheet.zohopublic.com/sheet/published/lg5hcff0d68a4b0f7430b9ff285f995b85d9f");
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
