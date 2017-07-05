package com.mizhuan.app.mizhuan.view.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.bean.ProductDetial;
import com.mizhuan.app.mizhuan.constants.ConstantsUtils;
import com.mizhuan.app.mizhuan.https.OkHttpClientManager;
import com.mizhuan.app.mizhuan.utils.ActivityCollectorUtil;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.sharesdk.onekeyshare.OnekeyShare;
import okhttp3.Request;

/**
 * 产品详情
 */
public class ProductDetailActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.iv_left)
    ImageView ivLeft;
    @BindView(R.id.tv_center)
    TextView tvCenter;
    @BindView(R.id.tv_right)
    TextView tvRight;
    private ImageView iv_product;
    private Button bt_turn_friendly;
    private ProDetailHandler handler;
    private ProductDetial proDetail;
    private boolean isSaveImage = false;


    @Override
    protected int layoutInit() {
        return R.layout.activity_detail_product;
    }

    @Override
    protected void binEvent() {
        ActivityCollectorUtil.addActivity(this);
        iv_product = (ImageView) findViewById(R.id.iv_product);
        bt_turn_friendly = (Button) findViewById(R.id.bt_turn_friendly);
        handler = new ProDetailHandler();
        bt_turn_friendly.setOnClickListener(this);
        Intent intent = getIntent();
        String tradeItemEsc = intent.getStringExtra("TradeItemEsc");
        doGetProductDetail(tradeItemEsc);
        initTop();
    }

    private void initTop() {
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tvRight.setVisibility(View.GONE);
        tvCenter.setText("商品详情");
    }

    private void doGetProductDetail(String tradeItemEsc) {
        String url = ConstantsUtils.ADDRESS_URL + ConstantsUtils.PRODUCT_DETAIL;
        Map<String, String> map = new HashMap<>();
        map.put("tradeItemEsc", tradeItemEsc);
        OkHttpClientManager.getInstance().getAsync(OkHttpClientManager.attachHttpGetParams(url, map), new OkHttpClientManager.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {
                showToast("获取数据失败！");
            }

            @Override
            public void requestSuccess(String result) throws Exception {
                Log.d("--ProductActivity-->", result);
                JSONObject jsonObject = new JSONObject(result);
                if (jsonObject.optInt("err_no") == 0) {
                    Gson gson = new Gson();
                    JSONObject json = new JSONObject(result);
                    if (json.optInt("err_no") == 0) {
                        proDetail = gson.fromJson(json.optString("data"), ProductDetial.class);
                        handler.sendEmptyMessage(ConstantsUtils.PRODUCT_DETAIL_GET_DATA);
                    } else {
                        showToast("获取数据失败！");
                    }

                } else {
                    showToast("获取数据失败！");
                }

            }
        });

    }


    @Override
    protected void fillData() {

    }


    class ProDetailHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case ConstantsUtils.PRODUCT_DETAIL_GET_DATA:
                    updataView();
                    new Task().execute(proDetail.getImage());
                    break;
                case 0x123:
                    isSaveImage = true;
                    SavaImage(bitmap, Environment.getExternalStorageDirectory().getPath()+"/mizhuan");
                    break;
                default:
                    break;

            }
        }
    }

    private void updataView() {
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showStubImage(R.drawable.def2)          // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.def2)  // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.drawable.def_fail)       // 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true)//设置下载的图片是否缓存在内存中
                .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
                .imageScaleType(ImageScaleType.IN_SAMPLE_INT)//设置图片以如何的编码方式显示
                .bitmapConfig(Bitmap.Config.RGB_565)//设置图片的解码类型
                //  .displayer(new RoundedBitmapDisplayer(20))  // 设置成圆角图片
                .build();

        ImageLoader.getInstance().loadImage(proDetail.getImage(), options, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String s, View view) {

            }

            @Override
            public void onLoadingFailed(String s, View view, FailReason failReason) {

            }

            @Override
            public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                iv_product.setImageBitmap(bitmap);
            }

            @Override
            public void onLoadingCancelled(String s, View view) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_turn_friendly:
                //todo 做第三方的分享操作
                if (isSaveImage){
                    showShare();
                }else {
                    showToast("正在生成分享图片！");
                }

                break;
            default:
                break;
        }
    }

    public void showShare() {
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // 分享时Notification的图标和文字  2.5.9以后的版本不     调用此方法
        //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
    //     oks.setTitle(proDetail.getTitle());
        // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
 //        oks.setTitleUrl("http://sharesdk.cn");
        // text是分享文本，所有平台都需要这个字段
         oks.setText(proDetail.getTitle());
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
         oks.setImagePath( Environment.getExternalStorageDirectory().getPath()+"/mizhuan"+"/"+"share.png");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
//        oks.setUrl("http://sharesdk.cn");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
//        oks.setComment("我是测试评论文本");
        // site是分享此内容的网站名称，仅在QQ空间使用
        //  oks.setSite(getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
//        oks.setSiteUrl("http://sharesdk.cn");

        // 启动分享GUI
        oks.show(this);
    }



    /**
     * 获取网络图片
     * @param imageurl 图片网络地址
     * @return Bitmap 返回位图
     */
    public Bitmap GetImageInputStream(String imageurl){
        URL url;
        HttpURLConnection connection=null;
        Bitmap bitmap=null;
        try {
            url = new URL(imageurl);
            connection=(HttpURLConnection)url.openConnection();
            connection.setConnectTimeout(6000); //超时设置
            connection.setDoInput(true);
            connection.setUseCaches(false); //设置不使用缓存
            InputStream inputStream=connection.getInputStream();
            bitmap= BitmapFactory.decodeStream(inputStream);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }
    private Bitmap bitmap;


    /**
     * 异步线程下载图片
     *
     */
    class Task extends AsyncTask<String, Integer, Void> {

        protected Void doInBackground(String... params) {
            bitmap=GetImageInputStream((String)params[0]);
            return null;
        }

        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            Message message=new Message();
            message.what=0x123;
            handler.sendMessage(message);
        }

    }

    /**
     * 保存位图到本地
     * @param bitmap
     * @param path 本地路径
     * @return void
     */
    public void SavaImage(Bitmap bitmap, String path){
        File file=new File(path);
        FileOutputStream fileOutputStream=null;
        //文件夹不存在，则创建它

        if(!file.exists()){
            file.mkdir();
        }
       File imgFile = new File(path+"/"+"share.png");
        if (imgFile.exists()){
            imgFile.delete();
        }

        try {
            fileOutputStream=new FileOutputStream(path+"/"+"share.png");
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100,fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
