package com.example.co2tradeapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webView)

        // Configura WebView
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://pachama.com/")

        // Habilita la configuración de JavaScript si es necesario
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
    }
}