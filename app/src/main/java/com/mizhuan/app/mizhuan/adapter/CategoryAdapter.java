package com.mizhuan.app.mizhuan.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mizhuan.app.mizhuan.bean.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaohailong on 2017/6/25.
 * 分类适配器
 */
public class CategoryAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Category> categories;

    public CategoryAdapter(ArrayList<Category> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @Override
    public int getCount() {
        return categories.size();
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
        return null;
    }
}
