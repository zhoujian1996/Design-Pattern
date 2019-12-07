package com.zj.desginPattern.Templeate;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  11:35
 */
public class Client {

    public static void main(String[] args) {
        SoyMilk soyMilk = new BlackBeanSoyMilk();

        soyMilk.make();
    }
}
