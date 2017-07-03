package com.mizhuan.app.mizhuan.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 销毁所有的activity的Util
 * @author 高海龙
 */
public class ActivityCollectorUtil {
    public static List<Activity> activities = new ArrayList<Activity>();


    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
