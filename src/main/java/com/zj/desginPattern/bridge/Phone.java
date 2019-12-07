package com.zj.desginPattern.bridge;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  12:11
 */
public abstract  class Phone {
    private  Brand brand = null;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected  void open(){
        this.brand.open();
    }

    protected  void close(){
        this.brand.close();
    }

    protected  void call(){
        this.brand.call();
    }



}
