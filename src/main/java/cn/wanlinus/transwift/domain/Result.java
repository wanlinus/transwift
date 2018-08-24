package cn.wanlinus.transwift.domain;

/**
 * @author wanli
 * @date 2018-08-23 16:54
 */
public class Result {
    private String src;
    private String dst;

    public Result() {
    }

    public Result(String src, String dst) {
        this.src = src;
        this.dst = dst;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

}
