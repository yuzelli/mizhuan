package com.mizhuan.app.mizhuan.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.utils.ActivityCollectorUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PersonalActivity extends BaseActivity {

    @BindView(R.id.iv_left)
    ImageView ivLeft;
    @BindView(R.id.tv_center)
    TextView tvCenter;
    @BindView(R.id.tv_right)
    TextView tvRight;
    @BindView(R.id.bt_exit_user)
    Button btExitUser;

    @Override
    protected int layoutInit() {
        return R.layout.activity_personal;
    }

    @Override
    protected void binEvent() {
        ActivityCollectorUtil.addActivity(this);
        tvRight.setVisibility(View.GONE);
      tvCenter.setText("用户中心");
    }

    @Override
    protected void fillData() {

    }


    @OnClick({R.id.iv_left, R.id.bt_exit_user})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_left:
                finish();
                break;
            case R.id.bt_exit_user:
                ActivityCollectorUtil.finishAll();
                Intent intent = new Intent(PersonalActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
        }
    }
}
