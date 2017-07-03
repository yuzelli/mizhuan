package com.mizhuan.app.mizhuan.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.bean.UserInfo;
import com.mizhuan.app.mizhuan.constants.ConstantsUtils;
import com.mizhuan.app.mizhuan.https.OkHttpClientManager;
import com.mizhuan.app.mizhuan.utils.OtherUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Request;

/**
 * 注册
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.et_user_phone)
    EditText etUserPhone;
    @BindView(R.id.et_verification_code)
    EditText etVerificationCode;
    @BindView(R.id.btn_sendSMS)
    Button btnSendSMS;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.et_confirm_password)
    EditText etConfirmPassword;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.cb_agree)
    CheckBox cbAgree;

    private ImageView iv_left;
    private TextView tv_center;
    private TextView tv_right;
    private TextView tv_user_protocol;
    private RegisterHandler handler;
    private Timer timer;
    private int mCurrentSeconds = 60;
    @Override
    protected int layoutInit() {
        return R.layout.activity_register;
    }

    @Override
    protected void binEvent() {
        handler = new RegisterHandler();
        iv_left = (ImageView) findViewById(R.id.iv_left);
        tv_center = (TextView) findViewById(R.id.tv_center);
        tv_right = (TextView) findViewById(R.id.tv_right);
        tv_user_protocol = (TextView) findViewById(R.id.tv_user_protocol);
        tv_user_protocol.setOnClickListener(this);
        btnSendSMS.setOnClickListener(this);
        btLogin.setOnClickListener(this);
        initTopBar();
    }

    @Override
    protected void fillData() {

    }

    public void initTopBar() {
        tv_center.setText("注册");
        tv_right.setVisibility(View.GONE);
        iv_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_user_protocol:
                Intent intent = new Intent(RegisterActivity.this, ProtocolActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_sendSMS:
                if(mCurrentSeconds == 60){
                    if (timer!=null) {
                        timer = null;
                    }
                     actionSMSTimer();
                }
                break;
            case R.id.bt_login:
                if (cbAgree.isChecked()){
                    doLoginAction();
                }else {
                    showToast("请同意用户协议！");
                }

                break;
            default:
                break;


        }
    }


    public void actionSMSTimer(){
        if (timer!=null){
            return;
        }
        timer = new Timer();
        TimerTask tt= new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        };
        timer.schedule(tt, 0, 1000);
    }


    private void doLoginAction() {
        String phone = etUserPhone.getText().toString().trim();
        String Code = etVerificationCode.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String confirmPassword = etConfirmPassword.getText().toString().trim();
        if (!OtherUtils.isPhoneEnable(phone)){
            showToast("手机号输入不合法！");
            return;
        }
        if (!password.equals(confirmPassword)){
            showToast("两次输入不一致！");
            return;
        }

        OkHttpClientManager.getInstance().postJson(ConstantsUtils.ADDRESS_URL + ConstantsUtils.USERINFO_CREATE, UserInfo.getRegister("未设置",Long.valueOf(phone), password,confirmPassword), new OkHttpClientManager.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {
                Log.d("--RegisterActivity-->", request.toString());
            }

            @Override
            public void requestSuccess(String result) throws Exception {
                Log.d("--RegisterActivity-->", result);
                Message msg = new Message();
                msg.what = ConstantsUtils.CREATE_USER_GET_DATA;
                msg.obj = result;
                handler.sendMessage(msg);

            }
        });
    }

    class RegisterHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case ConstantsUtils.CREATE_USER_GET_DATA:
                    String result = (String) msg.obj;
                    JSONObject json = null;
                    try {
                        json = new JSONObject(result);
                        if (json.optInt("err_no")==0){
                            finish();
                        }else {
                            showToast("注册失败");
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    break;

                case 0:
                    mCurrentSeconds--;
                    if (mCurrentSeconds <= 0) {
                        timer.cancel();
                        timer = null;
                        mCurrentSeconds = 60;
                        btnSendSMS.setText(getResources().getString(R.string.send_verification_code));
                        btnSendSMS.setTextColor(getResources().getColor(R.color.black));
                    } else {
                        btnSendSMS.setText(String.format("%sS", mCurrentSeconds));
                        btnSendSMS.setTextColor(getResources().getColor(R.color.white));
                        //mHandler.sendEmptyMessageDelayed(0, 1000);
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
