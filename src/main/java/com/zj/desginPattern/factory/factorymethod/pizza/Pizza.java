package com.zj.desginPattern.factory.factorymethod.pizza;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  14:23
 * 将PIZZA做成抽象
 */
public abstract  class Pizza {

    protected  String name;

    //准备原材料，不同的pizza
    public void prepare(){
    }


    public void bake(){
        System.out.println(name+"bakeing");
    }

    public void cut(){
        System.out.println(name+"cut");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void box(){
        System.out.println(name+"box");

    }


}
