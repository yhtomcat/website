package com.benxiaohai.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lenovo on 2017/8/23.
 */
public class Website implements Serializable {
    private int id;
    private String websitename;
    private String websiteaddress;
    private Date createTime;
    private String flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWebsitename() {
        return websitename;
    }

    public void setWebsitename(String websitename) {
        this.websitename = websitename;
    }

    public String getWebsiteaddress() {
        return websiteaddress;
    }

    public void setWebsiteaddress(String websiteaddress) {
        this.websiteaddress = websiteaddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
