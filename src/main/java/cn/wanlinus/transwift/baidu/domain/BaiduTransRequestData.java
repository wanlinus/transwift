package cn.wanlinus.transwift.baidu.domain;

import java.io.Serializable;

/**
 * 发送到百度服务器的信息
 *
 * @author wanli
 * @date 2018-08-23 14:13
 */
public class BaiduTransRequestData implements Serializable {
    /**
     * 需要翻译的文本
     */
    private String q;

    /**
     * 源语言
     */
    private String from;

    /**
     * 目标语言
     */
    private String to;

    /**
     * appid
     */
    private String appid;

    /**
     * 随机数
     */
    private String salt;

    /**
     * md5
     */
    private String sign;

    public BaiduTransRequestData() {
    }

    public BaiduTransRequestData(String q, String from, String to) {
        this.q = q;
        this.from = from;
        this.to = to;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "BaiduTransRequestData{" +
                "q='" + q + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", appid='" + appid + '\'' +
                ", salt='" + salt + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
