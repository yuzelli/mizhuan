package com.mizhuan.app.mizhuan;

import android.app.Application;
import android.content.Context;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import cn.sharesdk.framework.ShareSDK;


/**
 * Created by gaohailong on 2017/6/23.
 */
public class MizhuanApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

   //     ShareSDK.initSDK(this);
        context = getApplicationContext();

        initImageLoader(getApplicationContext());
    }

    public static Context getContext() {
        return context;
    }
    public static void initImageLoader(Context context) {
        // This configuration tuning is custom. You can tune every option, you may tune some of them,
        // or you can create default configuration by
        //  ImageLoaderConfiguration.createDefault(this);
        // method.
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration
                .createDefault(context);

//Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(configuration);




    }
}
