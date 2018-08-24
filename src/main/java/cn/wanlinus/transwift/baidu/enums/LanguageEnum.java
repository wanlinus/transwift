package cn.wanlinus.transwift.baidu.enums;

/**
 * @author wanli
 * @date 2018-08-23 14:15
 */
public enum LanguageEnum {
    /**
     * 语言列表
     */
    AUTO("auto", "自动检测"),
    ZH("zh", "中文"),
    EN("en", "英语"),
    YUE("yue", "粤语"),
    WYW("wyw", "文言文"),
    JP("jp", "日文"),
    KOR("kor", "韩语"),
    FRA("fra", "法语");

    private String shorthand;
    private String name;

    LanguageEnum(String shorthand, String name) {
        this.shorthand = shorthand;
        this.name = name;
    }

    public String getShorthand() {
        return shorthand;
    }

    public String getName() {
        return name;
    }
}
