package com.cathycms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 陈敬 on 17/8/30.
 */
public class LoginLog implements Serializable {
    private int loginLogId;

    private int userId;

    private String ip;

    private Date loginDate;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
