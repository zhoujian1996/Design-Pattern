package com.zj.desginPattern.bridge;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  12:11
 */
public class Vivo implements Brand {
    public void open() {
        System.out.println("Vivo手机开机");

    }

    public void close() {
        System.out.println("Vivo手机guan机");

    }

    public void call() {
        System.out.println("Vivo手机打电话");

    }
}
