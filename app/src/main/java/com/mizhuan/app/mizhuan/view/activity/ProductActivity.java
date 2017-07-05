package com.mizhuan.app.mizhuan.view.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.adapter.ProductAdapter;
import com.mizhuan.app.mizhuan.bean.Product;
import com.mizhuan.app.mizhuan.constants.ConstantsUtils;
import com.mizhuan.app.mizhuan.https.OkHttpClientManager;
import com.mizhuan.app.mizhuan.utils.ActivityCollectorUtil;
import com.mizhuan.app.mizhuan.utils.CommonAdapter;
import com.mizhuan.app.mizhuan.utils.GsonUtils;
import com.mizhuan.app.mizhuan.utils.ViewHolder;
import com.nostra13.universalimageloader.core.listener.PauseOnScrollListener;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bingoogolapple.refreshlayout.BGAMeiTuanRefreshViewHolder;
import cn.bingoogolapple.refreshlayout.BGAMoocStyleRefreshViewHolder;
import cn.bingoogolapple.refreshlayout.BGARefreshLayout;
import cn.bingoogolapple.refreshlayout.BGARefreshViewHolder;
import okhttp3.Request;

/**
 * 商品列表
 */
public class ProductActivity extends BaseActivity{

    @OnClick(R.id.iv_left)
    public void ivLeft(){
        finish();
    }
    @BindView(R.id.tv_center)
    TextView tvCenter;
    @BindView(R.id.tv_right)
    TextView tvRight;
    @BindView(R.id.lv_product)
    PullToRefreshListView lvProduct;


    private ProductHandler handler;

    private ArrayList<Product.DataBean> productDatas;
    private int page = 1;
    private Context context;
    private ProductAdapter adapter;
    private Boolean seachFlag = false;

private String seach;
    @Override
    protected int layoutInit() {
        return R.layout.activity_product;
    }

    @Override
    protected void binEvent() {
        ActivityCollectorUtil.addActivity(this);
        handler = new ProductHandler();
        context = this;
        initTopBar();
        productDatas = new ArrayList<>();
       // initRefreshLayout();
        Intent intent = getIntent();
        seach = intent.getStringExtra("search");
        if (seach==null||seach.equals("")){
            doGetPriductData();
            seachFlag = false;
        }else {
            doGetPriductSeachData();
            seachFlag = true;
        }
    
    }

    private void doGetPriductSeachData() {
        String url = ConstantsUtils.ADDRESS_URL+ConstantsUtils.SEACH_LIST;
        Map<String,String> map =  new HashMap<>();
        map.put("search",seach);
        map.put("page",page+"");
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
                    Gson gson = new Gson();
                    Product product = gson.fromJson(jsonObject.optString("data"),Product.class);
                    productDatas.addAll(product.getData());
                    handler.sendEmptyMessage(ConstantsUtils.PRODUCT_GET_DATA);
                }else {
                    showToast("获取数据失败！");
                }

            }
        });

    }

    private void doGetPriductData() {
        String url = ConstantsUtils.ADDRESS_URL+ConstantsUtils.PRODUCT_LIST;
        Intent intent = getIntent();
        int category_id = intent.getIntExtra("category_id",-1);
        Map<String,String> map =  new HashMap<>();
        map.put("page",page+"");
        if (category_id!=-1){
            map.put("category_id",category_id+"");
        }
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
                    Gson gson = new Gson();
                   Product product = gson.fromJson(jsonObject.optString("data"),Product.class);
                    productDatas.addAll(product.getData());
                    handler.sendEmptyMessage(ConstantsUtils.PRODUCT_GET_DATA);
                }else {
                    showToast("获取数据失败！");
                }

            }
        });

    }

    private void initTopBar() {
        tvCenter.setText("精选");
        tvRight.setVisibility(View.GONE);

    }

    @Override
    protected void fillData() {

    }


    class ProductHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case ConstantsUtils.PRODUCT_GET_DATA:
                    lvProduct.onRefreshComplete();
                    if (page!=1){
                        adapter.notifyDataSetChanged();
                        return;
                    }
                    doUpdataListView();
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 更新视图
     */
    private void doUpdataListView() {

//         adapter =   new CommonAdapter<Product.DataBean>(context,productDatas,R.layout.item_product_list) {
//            @Override
//            public void convert(ViewHolder helper, Product.DataBean item, int position) {
//                helper.getView(R.id.img_project).setTag(item.getImage());
//                helper.setImageResource(R.id.img_project,R.drawable.def2);
//                helper.setImageByUrl(R.id.img_project,item.getImage());
//                helper.setText(R.id.tv_title,item.getTitle());
//                helper.setText(R.id.tv_salePrice,"¥"+item.getSaleprice());
//                helper.setText(R.id.tv_org_price,"¥"+item.getDiscountPrice());
//                TextView tv = helper.getView(R.id.tv_org_price);
//                tv.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG );
//                helper.setText(R.id.tv_quan,"¥"+item.getCutPrice());
//                helper.setText(R.id.tv_money,item.getSaleprice()*0.3+"元");
//            }
//        };
        adapter=  new ProductAdapter(productDatas,context);

        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context,ProductDetailActivity.class);
                intent.putExtra("TradeItemEsc",productDatas.get(position-1).getTradeItemEsc());
                startActivity(intent);
            }
        });

            lvProduct.setMode(PullToRefreshBase.Mode.BOTH);
            lvProduct.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
                @Override
                public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                    page = 1;
                    productDatas.clear();
                    if (seachFlag){
                        doGetPriductSeachData();
                    }else {
                        doGetPriductData();
                    }

                }

                @Override
                public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                    page ++;
                    if (seachFlag){
                        doGetPriductSeachData();
                    }else {
                        doGetPriductData();
                    }
                }
            });


    }
}
