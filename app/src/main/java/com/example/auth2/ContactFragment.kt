package com.example.auth2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val ourweb : WebView = view.findViewById(R.id.web5)
        ourweb.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        ourweb.loadUrl("https://builtbybuffalo.com/contact")
        ourweb.settings.javaScriptEnabled
        ourweb.settings.allowContentAccess = true
        ourweb.settings.useWideViewPort = true
        ourweb.settings.domStorageEnabled = true
    }
}