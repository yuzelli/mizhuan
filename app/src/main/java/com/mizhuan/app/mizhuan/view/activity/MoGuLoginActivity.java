package com.mizhuan.app.mizhuan.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;
import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.bean.Product;
import com.mizhuan.app.mizhuan.bean.UserInfo;
import com.mizhuan.app.mizhuan.constants.ConstantsUtils;
import com.mizhuan.app.mizhuan.https.OkHttpClientManager;
import com.mizhuan.app.mizhuan.utils.ActivityCollectorUtil;
import com.mizhuan.app.mizhuan.utils.SharePreferencesUtil;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Request;

public class MoGuLoginActivity extends BaseActivity {
    @BindView(R.id.et_uuid)
    EditText etUuid;
    @BindView(R.id.bt_login)
    Button btLogin;
//
//    @BindView(R.id.web_mogu)
//    WebView webMogu;
    private Context context;

    @Override
    protected int layoutInit() {
        return R.layout.activity_mo_gu_login;
    }

    @Override
    protected void binEvent() {
//        webMogu.loadUrl("http://h5.mogujie.com/user-process/login.html?redirect_url=http%3A%2F%2Fh5.mogujie.com%2Fpersonal%2Fpersonal.html%3Fmt%3D12.4604.r98160.4583%26acm%3D3.mce.1_10_19wsq.4604.0.zmryYqof4AZay.m_231177-pos_3-mf_4537_485521%26ptp%3Dm1._mf1_1239_4537._keywor");
//
//        //启用支持javascript
//        WebSettings settings = webMogu.getSettings();
//        settings.setJavaScriptEnabled(true);
//
//        // 设置WebView的客户端  // 设置WebView的客户端
//        webMogu.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                return false;// 返回false
//            }
//
//            @Override
//            public void onLoadResource(WebView view, String url) {
//                // 查看跳转页面
//                if (url.contains("http://union.mogujie.com/tools/my/")) {
//                    view.stopLoading();
//                    view.loadUrl("http://union.mogujie.com/effect/cpsUser/getCpsUserInfo");
//                    //todo 1、加载处理的数据
//                    Toast.makeText(MoGuLoginActivity.this,"成功",Toast.LENGTH_LONG).show();
//                    //todo 2、保存获取数据
//                    //todo 3、直接跳转到主界面
//                }
//
//                super.onLoadResource(view, url);
//            }
//
//            @Override
//            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
//                super.onReceivedError(view, request, error);
//            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//            }
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//            }
//
//        });
        ActivityCollectorUtil.addActivity(this);
        context = this;
    }

    @Override
    protected void fillData() {

    }

    @OnClick(R.id.bt_login)
    public void onViewClicked() {
        String uuid = etUuid.getText().toString().trim();

        doBindMuGo(Integer.valueOf(uuid));
    }

    private void doBindMuGo(final int uuid) {

        String url = ConstantsUtils.ADDRESS_URL+ConstantsUtils.BIND_UUID;
        Map<String,String> map =  new HashMap<>();
        UserInfo u = (UserInfo) SharePreferencesUtil.readObject(context,ConstantsUtils.SP_SAVE_USERINFO);
        map.put("user_id",u.getUserID()+"");
        map.put("user_ic",uuid+"");
        OkHttpClientManager.getInstance().getAsync(OkHttpClientManager.attachHttpGetParams(url,map), new OkHttpClientManager.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {
                showToast("获取数据失败！");
            }

            @Override
            public void requestSuccess(String result) throws Exception {
                Log.d("--ProductActivity-->",result);
                JSONObject jsonObject = new JSONObject(result);
                if (jsonObject.optInt("err_no")==0){
                    SharePreferencesUtil.saveObject(context,ConstantsUtils.SP_SAVE_MGJ_UUID,uuid);
                    startActivity(new Intent(context,MainActivity.class));
                }else {
                    showToast("获取数据失败！");
                }

            }
        });

    }
}
