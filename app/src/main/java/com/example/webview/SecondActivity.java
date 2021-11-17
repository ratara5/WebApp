package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecondActivity extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        wv1=(WebView)findViewById(R.id.web_view1);

        String sitio=getIntent().getStringExtra("sitioWeb");
        wv1.setWebViewClient(new WebViewClient());
        //wv1.getSettings().setJavaScriptEnabled(true); //Pa' ver youtube
        wv1.loadUrl("http://"+sitio);
    }

    //Método Botón CERRAR
    public void cerrar(View view){
        finish();
    }
}