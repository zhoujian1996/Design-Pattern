package com.zj.desginPattern.Decorate;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  15:21
 */
public abstract  class Drink {

    public String des;//描述

    private float price;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    public abstract  float cost();
}
