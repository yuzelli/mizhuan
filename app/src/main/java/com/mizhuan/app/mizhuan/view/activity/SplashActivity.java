package com.mizhuan.app.mizhuan.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.bean.UserInfo;
import com.mizhuan.app.mizhuan.constants.ConstantsUtils;
import com.mizhuan.app.mizhuan.utils.SharePreferencesUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity {
    @BindView(R.id.img_icon)
    ImageView imgIcon;
    private Context context;

    @Override
    protected int layoutInit() {
        return R.layout.activity_splash;
    }

    @Override
    protected void binEvent() {
        context = this;

        imgIcon.postDelayed(new Runnable() {
            @Override
            public void run() {
                //  finish();
                // startActivity(new Intent(SplashActivity.this,AdvertisementActivity.class));
                StartApp();
                //  overridePendingTransition(0, R.anim.zoomout);
            }
        }, ConstantsUtils.IS_SHOW_SPLASH_DELAY_3 ? 3000 : 2000);
    }

    private void StartApp() {
        UserInfo user = (UserInfo) SharePreferencesUtil.readObject(context, ConstantsUtils.SP_SAVE_USERINFO);
        if (user != null) {
            Intent intent = new Intent(context, MainActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(context, LoginActivity.class);

            startActivity(intent);
        }
        finish();
    }

    @Override
    protected void fillData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
