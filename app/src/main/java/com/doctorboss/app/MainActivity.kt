package com.doctorboss.app

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()
        
        // تحميل ملف الـ HTML المحلي الخاص بك
        webView.loadUrl("file:///android_asset/index.html")
        
        setContentView(webView)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}
