package com.mizhuan.app.mizhuan.view.activity;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.mizhuan.app.mizhuan.utils.ActivityCollectorUtil;
import com.mizhuan.app.mizhuan.utils.MyToast;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.sharesdk.framework.ShareSDK;

public abstract class BaseActivity extends Activity {
    private Unbinder unbinder;
    protected Bundle savedInstanceState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 隐藏软键盘
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        // 隐藏actionBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 隐藏通知栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        this.savedInstanceState = savedInstanceState;

        setContentView(layoutInit());
        init(savedInstanceState);
        unbinder= ButterKnife.bind(this);
        viewInit();
        binEvent();
    }
    /**
     * 统一显示toast
     *
     * @param
     * @author Hoyn
     *
     */
    protected void showToast(String msg) {
        MyToast.show(msg);
    }
    @Override
    protected void onResume() {
        super.onResume();
        fillData();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        ActivityCollectorUtil.removeActivity(this);
    }
    /**
     *加载布局
     */
    protected abstract int layoutInit();
    /**
     * 绑定事件
     */
    protected abstract void binEvent();
    /**
     * TODO:需要考虑savedInstanceState 设置布局文件
     *
     * @author yuzelli
     *
     */
    /**
     * TODO:需要考虑savedInstanceState 设置布局文件
     *
     * @author yuzelli
     *
     */
    protected void init(Bundle savedInstanceState) {

    }
    /**
     * 加载数据
     * @author yuzelli
     *
     */
    protected void viewInit() {
//        tv_title = (TextView) findViewById(R.id.title);
//        if (!isLoginOut()) {
//        }
    };
    protected abstract void fillData();
}
