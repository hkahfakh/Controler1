package com.example.controler1.ui.home;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.controler1.R;

public class HomeFragment extends Fragment {


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.controlButtonGroup1);
//
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        //button************************************************
//        final TextView Ev1 = root.findViewById(R.id.textView3);
//        Button Btn1 = root.findViewById(R.id.button1);//获取按钮资源
//        Btn1.setOnClickListener(new Button.OnClickListener() {//创建监听
//            public void onClick(View v) {
//                String strTmp = "点击Button01";
//                Ev1.setText(strTmp);
//            }
//
//        });
        //button************************************************

        //WebView
        WebView webView = (WebView) root.findViewById(R.id.webview1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://192.168.1.137/min.php");
        //自适应手机屏幕
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webView.getSettings().setLoadWithOverviewMode(true);


        //设置是否出现缩放工具
        webView.getSettings().setBuiltInZoomControls(false);
        //设置可以支持缩放
        webView.getSettings().setSupportZoom(false);
        //扩大比例的缩放
        webView.getSettings().setUseWideViewPort(true);
        webView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

//        //获取webview控件
//        WebView myWebView = (WebView) root.findViewById(R.id.webview1);
//        //加载服务器上的页面
//        myWebView.loadUrl("http://192.168.0.100/");
//        //加载本地中的html
//        //myWebView.loadUrl("file:///android_asset/www/test2.html");
//        //加上下面这段代码可以使网页中的链接不以浏览器的方式打开
//        myWebView.setWebViewClient(new WebViewClient());
//        //得到webview设置
//        WebSettings webSettings = myWebView.getSettings();
//        //允许使用javascript
//        webSettings.setJavaScriptEnabled(true);


        return root;
    }

}
