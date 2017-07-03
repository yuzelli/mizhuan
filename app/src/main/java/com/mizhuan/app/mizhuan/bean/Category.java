package com.mizhuan.app.mizhuan.bean;

import java.io.Serializable;

/**
 * Created by gaohailong on 2017/6/25.
 */

public class Category implements Serializable{
    private int cid;
    private String cname;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
