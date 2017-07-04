package com.mizhuan.app.mizhuan.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mizhuan.app.mizhuan.R;
import com.mizhuan.app.mizhuan.bean.Product;
import com.mizhuan.app.mizhuan.utils.AsyncImageLoader;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by gaohailong on 2017/6/23.
 * 商品适配器
 */
public class ProductAdapter extends BaseAdapter {
    private ArrayList<Product.DataBean> products;
    private Context context;
    public AsyncImageLoader imageLoader ;
    public ProductAdapter(ArrayList<Product.DataBean> products,Context context) {
        this.products = products;
        this.context=context;
        imageLoader = new AsyncImageLoader(context);
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_product_list, null);
            holder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            holder.tv_salePrice = (TextView) convertView.findViewById(R.id.tv_salePrice);
            holder.tv_org_price = (TextView) convertView.findViewById(R.id.tv_org_price);
            holder.tv_quan = (TextView) convertView.findViewById(R.id.tv_quan);
            holder.tv_money = (TextView) convertView.findViewById(R.id.tv_money);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_title.setText(products.get(position).getTitle());
        holder.tv_salePrice.setText("¥"+products.get(position).getSaleprice());
        holder.tv_org_price.setText("¥"+products.get(position).getDiscountPrice());
        holder.tv_org_price.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG );
        holder.tv_quan.setText("¥"+products.get(position).getCutPrice());
        holder.tv_money.setText(products.get(position).getSaleprice()*0.3+"元");
        holder.img_project = (ImageView) convertView.findViewById(R.id.img_project);
        holder.img_project.setImageResource(R.drawable.def2);
        holder.img_project.setTag(products.get(position).getImage());
// 通过 tag 来防止图片错位
        if (holder.img_project.getTag() != null && holder.img_project.getTag().equals(products.get(position).getImage())) {
            Bitmap bitmap = imageLoader.loadImage(holder.img_project, products.get(position).getImage());
            if (bitmap != null) {
                holder.img_project.setImageBitmap(bitmap);
            }
        }
        return convertView;
    }


    private static class ViewHolder {
        ImageView img_project;
        TextView tv_title;
        TextView tv_salePrice;
        TextView tv_org_price;
        TextView tv_quan;
        TextView tv_money;



    }
}
