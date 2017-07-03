package com.mizhuan.app.mizhuan.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mizhuan.app.mizhuan.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyTextActivity extends BaseActivity {


    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.tv_main)
    TextView tvMain;

    @Override
    protected int layoutInit() {
        return R.layout.activity_my_text;
    }

    @Override
    protected void binEvent() {

    }

    @Override
    protected void fillData() {

    }


    @OnClick({R.id.tv_login, R.id.tv_main})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_login:
                startActivity(new Intent(MyTextActivity.this,LoginActivity.class));
                break;
            case R.id.tv_main:
                startActivity(new Intent(MyTextActivity.this,MainActivity.class));
                break;
        }
    }
}
