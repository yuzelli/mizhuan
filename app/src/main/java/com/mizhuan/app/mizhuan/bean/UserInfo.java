package com.mizhuan.app.mizhuan.bean;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.PipedReader;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 51644 on 2017/7/2.
 */

public class UserInfo implements Serializable {

    private long userPhone;
    private String passWord;

    private int userID;

    public UserInfo(long userPhone, String passWord, int userID) {
        this.userPhone = userPhone;
        this.passWord = passWord;
        this.userID = userID;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public static String getLogin(long userName, String password){
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("phone",userName);
            jsonObject.put("password",password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject.toString();
    }public static String getRegister(String userName,long phone, String password,String password_confirmation,int code){
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("username",userName);
            jsonObject.put("phone",phone);
            jsonObject.put("code",code);
            jsonObject.put("password",password);
            jsonObject.put("password_confirmation",password_confirmation);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject.toString();
    }
}
