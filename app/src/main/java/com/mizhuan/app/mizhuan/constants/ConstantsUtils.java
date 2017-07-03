package com.mizhuan.app.mizhuan.constants;

import com.mizhuan.app.mizhuan.utils.SharePreferencesUtil;

/**
 * Created by 51644 on 2017/7/2.
 */

public class ConstantsUtils {

    //用户登录成功
    public static final int LOGIN_GET_DATA = 0x00001001;
    public static final int PRODUCT_GET_DATA = 0x00001002;
    public static final int PRODUCT_DETAIL_GET_DATA = 0x00001005;
    public static final int CREATE_USER_GET_DATA = 0x00001003;
    public static final int CATEGORY_GET_DATA = 0x00001004;

    public static final String ADDRESS_URL = "http://115.159.0.152:8080/";
    public static final String USERINFO_LOGIN = "user/login";
    public static final String USERINFO_CREATE = "user/create";
    public static final String BIND_UUID = "user/bind";
    public static final String PRODUCT_LIST = "good/list";
    public static final String CATEGORY_LIST = "good/category";
    public static final String PRODUCT_DETAIL = "/good/detail";
    public static final String SEACH_LIST = "/good/search";

    //用户信息
    public static final String SP_SAVE_USERINFO = "login_user_info";
    //蘑菇街id
    public static final String SP_SAVE_MGJ_UUID = "mogujie——uuid";
}
