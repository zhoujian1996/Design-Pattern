package com.zj.desginPattern.iterator;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  11:08
 */
public class Department {

    private  String name;
    private  String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
