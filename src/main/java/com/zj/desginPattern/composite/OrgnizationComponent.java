package com.zj.desginPattern.composite;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  17:57
 */
public abstract  class OrgnizationComponent {

    private  String name; //说明
    private  String desc; //名字

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

    public OrgnizationComponent(String name, String desc) {

        this.name = name;
        this.desc = desc;
    }

    public void add(OrgnizationComponent orgnizationComponent){

    }

    public  void remove(OrgnizationComponent orgnizationComponent){}

    //方法print，做成抽象的，子类都需要实现
    public abstract  void print();
}
