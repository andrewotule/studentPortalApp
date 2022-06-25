package com.andrew.studentportalapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

   // private val web : WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create a variable so that we can link the webview
        val web = findViewById<WebView>(R.id.webportal)
        web.webViewClient = WebViewClient()//responsible for loading the url defined below
        web.loadUrl("https://student.mak.ac.ug/")
        val webSettings=web.settings
        webSettings.javaScriptEnabled=true

    }

    /*override fun onBackPressed() { //enables someone to remain on the site
        if (web!!.canGoBack()) {
            web.goBack()
        }
        super.onBackPressed()
    }*/

}