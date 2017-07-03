package com.mizhuan.app.mizhuan.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 51644 on 2017/7/2.
 */

public class OtherUtils {
    /**
     * 验证电话号码是否符合格式
     * @return true （符合）or false（不符合）
     */
    public static boolean isPhoneEnable(String strPhone) {
        boolean b = false;
        if (strPhone.length() == 11) {
            Pattern pattern = null;
            Matcher matcher = null;
            pattern = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
            matcher = pattern.matcher(strPhone);
            b = matcher.matches();
        }
        return b;
    }

}
