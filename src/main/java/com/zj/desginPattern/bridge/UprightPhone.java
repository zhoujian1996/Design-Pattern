package com.zj.desginPattern.bridge;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  12:12
 */
public class UprightPhone extends  Phone {

    public UprightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("治理样式的手机");
    }

    public void close(){
        super.close();
        System.out.println("治理样式的手机");
    }

    public void call(){
        super.call();
        System.out.println("治理样式的手机");
    }
}
