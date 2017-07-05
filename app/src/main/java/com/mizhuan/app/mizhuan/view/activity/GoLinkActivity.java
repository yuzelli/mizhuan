package com.mizhuan.app.mizhuan.view.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.utils.ActivityCollectorUtil;

/**
 * 转链工具
 */
public class GoLinkActivity extends BaseActivity {

    private ImageView iv_left;
    private TextView tv_center;
    private TextView tv_right;


    @Override
    protected int layoutInit() {
        return R.layout.activity_go_link;
    }

    @Override
    protected void binEvent() {
        ActivityCollectorUtil.addActivity(this);
        iv_left = (ImageView) findViewById(R.id.iv_left);
        tv_center = (TextView) findViewById(R.id.tv_center);
        tv_right = (TextView) findViewById(R.id.tv_right);
        initTopBar();
    }

    @Override
    protected void fillData() {

    }

    public void initTopBar() {
        tv_center.setText("转链工具");
        tv_right.setVisibility(View.GONE);
        iv_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
