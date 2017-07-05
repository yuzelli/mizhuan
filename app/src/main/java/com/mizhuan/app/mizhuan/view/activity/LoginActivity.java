package com.mizhuan.app.mizhuan.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.bean.UserInfo;
import com.mizhuan.app.mizhuan.constants.ConstantsUtils;
import com.mizhuan.app.mizhuan.https.OkHttpClientManager;
import com.mizhuan.app.mizhuan.utils.ActivityCollectorUtil;
import com.mizhuan.app.mizhuan.utils.OtherUtils;
import com.mizhuan.app.mizhuan.utils.SharePreferencesUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 登陆
 */
public class LoginActivity extends BaseActivity {

    @BindView(R.id.user_phone)
    EditText userPhone;
    @BindView(R.id.et_password)
    EditText etPassword;

    @BindView(R.id.bt_login)
    Button btLogin;
    private ImageView iv_left;
    private TextView tv_center;
    private TextView tv_right;
    private LoginHander handler;
     private Context context;
    private String phone;
    private String password;
    @Override
    protected int layoutInit() {
        return R.layout.activity_login;
    }

    @Override
    protected void binEvent() {
        ActivityCollectorUtil.addActivity(this);
        handler = new LoginHander();
        context = this;
        iv_left = (ImageView) findViewById(R.id.iv_left);
        tv_center = (TextView) findViewById(R.id.tv_center);
        tv_right = (TextView) findViewById(R.id.tv_right);
        initTopBar();
    }

    @Override
    protected void fillData() {

    }

    public void initTopBar() {
        iv_left.setVisibility(View.GONE);
        tv_center.setText("用户登陆");
        tv_right.setText("注册");

        tv_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });
    }

    private void doLogin() {
         phone = userPhone.getText().toString().trim();
         password = etPassword.getText().toString().trim();
        if (!OtherUtils.isPhoneEnable(phone)){
            showToast("手机号输入不合法！");
            return;
        }

        OkHttpClientManager.getInstance().postJson(ConstantsUtils.ADDRESS_URL + ConstantsUtils.USERINFO_LOGIN, UserInfo.getLogin(Long.valueOf(phone), password), new OkHttpClientManager.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {
                Log.d("--LoginActivity-->", request.toString());
            }

            @Override
            public void requestSuccess(String result) throws Exception {
                Log.d("--LoginActivity-->", result);
                Message msg = new Message();
                msg.what = ConstantsUtils.LOGIN_GET_DATA;
                msg.obj = result;
                handler.sendMessage(msg);

            }
        });

    }
    private long exitTime;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){
            if((System.currentTimeMillis()-exitTime) > 2000){
                Toast.makeText(context,"再按一次退出程序",Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    class LoginHander extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case ConstantsUtils.LOGIN_GET_DATA:
                    String result = (String) msg.obj;
                    try {
                        JSONObject json = new JSONObject(result);
                        int err_no = json.optInt("err_no");
                        switch (err_no) {
                            case 0:

                                SharePreferencesUtil.saveObject(context,ConstantsUtils.SP_SAVE_USERINFO,new UserInfo(Long.valueOf(phone),password ,json.optInt("data")));
                                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                                finish();
                                break;
                            case 1:
                                showToast("登录失败！"+json.optString("err_msg"));
                                break;
                            case 2:
                                showToast("需要绑定蘑菇街！");
                                SharePreferencesUtil.saveObject(context,ConstantsUtils.SP_SAVE_USERINFO,new UserInfo(Long.valueOf(phone),password ,json.optInt("data")));
                                startActivity(new Intent(LoginActivity.this,MoGuLoginActivity.class));
                                finish();
                                break;
                            default:
                                break;
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    break;
                default:
                    break;
            }
        }
    }


}
