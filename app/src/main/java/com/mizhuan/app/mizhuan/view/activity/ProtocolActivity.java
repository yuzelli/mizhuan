package com.mizhuan.app.mizhuan.view.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.mizhuan.app.mizhuan.R;

import butterknife.BindView;

/**
 * 用户协议
 */
public class ProtocolActivity extends BaseActivity {
    private WebView webView;
    private ImageView iv_left;
    private TextView tv_center;
    private TextView tv_right;
    private TextView tv_user_protocol;

    private Handler handler;



    @Override
    protected int layoutInit() {
        return R.layout.activity_protocol;
    }

    @Override
    protected void binEvent() {

        iv_left = (ImageView) findViewById(R.id.iv_left);
        tv_center = (TextView) findViewById(R.id.tv_center);
        tv_right = (TextView) findViewById(R.id.tv_right);

        initTopBar();

        webView = (WebView) findViewById(R.id.wv_protocol);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);//是否支持缩放
        webView.requestFocus();//设置软键盘是否可以打开
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        webView.loadUrl("file:///android_asset/protocol.html");

    }

    @Override
    protected void fillData() {

    }

    public void initTopBar() {
        tv_center.setText("用户服务协议");
        tv_right.setVisibility(View.GONE);
        iv_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



    /**
     * 使点击回退按钮不会直接退出整个应用程序而是返回上一个页面
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()) {
            webView.goBack();//返回上个页面
            return true;
        }
        return super.onKeyDown(keyCode, event);//退出整个应用程序
    }
}
