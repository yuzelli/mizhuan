package com.mizhuan.app.mizhuan.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.bean.Category;
import com.mizhuan.app.mizhuan.bean.Product;
import com.mizhuan.app.mizhuan.constants.ConstantsUtils;
import com.mizhuan.app.mizhuan.https.OkHttpClientManager;
import com.mizhuan.app.mizhuan.utils.CommonAdapter;
import com.mizhuan.app.mizhuan.utils.GsonUtils;
import com.mizhuan.app.mizhuan.utils.ViewHolder;

import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import okhttp3.Request;

/**
 * 分类
 */
public class CategoryActivity extends BaseActivity {
    private ImageView iv_left;
    private TextView tv_center;
    private TextView tv_right;
    private ListView lv_category;
    private CategoryHandler handler;
    private List<Category> cateDatas;
    private Context context;

    @Override
    protected int layoutInit() {
        return R.layout.activity_category;
    }

    @Override
    protected void binEvent() {
        context = this;
        handler = new CategoryHandler();
        iv_left = (ImageView) findViewById(R.id.iv_left);
        tv_center = (TextView) findViewById(R.id.tv_center);
        tv_right = (TextView) findViewById(R.id.tv_right);
        lv_category= (ListView) findViewById(R.id.lv_category);
        handler = new CategoryHandler();
        initTopBar();
        doGetCategoryData();
    }

    private void doGetCategoryData() {
        OkHttpClientManager.getAsync(ConstantsUtils.ADDRESS_URL + ConstantsUtils.CATEGORY_LIST, new OkHttpClientManager.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {
                Log.d("--->",request.toString());
                showToast("获取数据失败！");
            }

            @Override
            public void requestSuccess(String result) throws Exception {
                Log.d("--->",result);
                JSONObject jsonObject = new JSONObject(result);
                if (jsonObject.optInt("err_no")==0){
                   cateDatas = GsonUtils.jsonToArrayList(jsonObject.optString("data"),Category.class);
                    handler.sendEmptyMessage(ConstantsUtils.CATEGORY_GET_DATA);
                }else {
                    showToast("获取数据失败！");
                }
            }
        });
    }

    @Override
    protected void fillData() {

    }

    public void initTopBar() {
        tv_center.setText("商品分类");
        tv_right.setVisibility(View.GONE);

        iv_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    class CategoryHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case ConstantsUtils.CATEGORY_GET_DATA:
                    updataListView();
                    break;
                default:
                    break;
            }
        }
    }

    private void updataListView() {
        lv_category.setAdapter(new CommonAdapter<Category>(context,cateDatas,R.layout.item_category) {
            @Override
            public void convert(ViewHolder helper, Category item, int position) {
                   helper.setText(R.id.tv_title,item.getCname());
            }
        });
        lv_category.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context,ProductActivity.class);
                intent.putExtra("category_id",cateDatas.get(position).getCid());
                startActivity(intent);
            }
        });
    }
}
