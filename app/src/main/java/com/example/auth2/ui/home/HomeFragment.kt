package com.example.auth2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.auth2.R
import com.example.auth2.databinding.FragmentHomeBinding
import java.net.URL

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val ourweb : WebView = view.findViewById(R.id.web1)
        ourweb.webViewClient = object :WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        ourweb.loadUrl("https://builtbybuffalo.com/")
        ourweb.settings.javaScriptEnabled
        ourweb.settings.allowContentAccess = true
        ourweb.settings.useWideViewPort = true
        ourweb.settings.domStorageEnabled = true
    }
}