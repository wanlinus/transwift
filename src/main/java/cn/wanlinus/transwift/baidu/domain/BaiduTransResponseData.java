package cn.wanlinus.transwift.baidu.domain;

import cn.wanlinus.transwift.domain.Result;

import java.util.List;

/**
 * @author wanli
 * @date 2018-08-23 14:32
 */
public class BaiduTransResponseData {
    private String error_code;
    private String error_msg;
    private String from;
    private String to;
    private List<Result> trans_result;

    public BaiduTransResponseData() {
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
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

    public List<Result> getTrans_result() {
        return trans_result;
    }

    public void setTrans_result(List<Result> trans_result) {
        this.trans_result = trans_result;
    }

    @Override
    public String toString() {
        return "BaiduTransResponseData{" +
                "error_code='" + error_code + '\'' +
                ", error_msg='" + error_msg + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", trans_result=" + trans_result +
                '}';
    }
}
