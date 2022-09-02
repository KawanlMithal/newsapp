package com.example.app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ProgressBar;


public class Home1 extends Fragment {

    WebView webView;
    WebView webView2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home1, container, false);
        webView=view.findViewById(R.id.webview);
        webView.loadUrl("https://www.dawn.com");
        webView=view.findViewById(R.id.webview2);
        webView.loadUrl("https://www.bbc.com/news");
        //webView.setWebViewClient(new WebViewController());
        webView.getSettings().setJavaScriptEnabled(true);


        return view;


    }
}