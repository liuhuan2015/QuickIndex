package com.liuh.learn.quickindex.model;

import com.liuh.learn.quickindex.utils.PinyinUtil;

/**
 * Created by huan on 2018/3/12.
 */

public class ATestGoodMan {

    private String name;
    private String pinyin;

    public ATestGoodMan(String name) {
        this.name = name;
        this.pinyin = PinyinUtil.getPinyin(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
