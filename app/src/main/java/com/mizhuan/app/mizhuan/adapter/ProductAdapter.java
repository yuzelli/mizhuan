package com.mizhuan.app.mizhuan.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mizhuan.app.mizhuan.bean.Product;

import java.util.ArrayList;

/**
 * Created by gaohailong on 2017/6/23.
 * 商品适配器
 */
public class ProductAdapter extends BaseAdapter {
    private ArrayList<Product> products;
    private Context context;

    public ProductAdapter(ArrayList<Product> products,Context context) {
        this.products = products;
        this.context=context;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null) {

        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        return null;
    }

    private static class ViewHolder {
        ImageView iv_img;
        TextView tv_title;
        TextView tv_time;
        TextView tv_read;
    }
}
