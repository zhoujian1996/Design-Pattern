package com.zj.desginPattern.bridge;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  12:15
 */
public class XiaoMi implements Brand {
    public void open() {
        System.out.println("小米手机开机");
    }

    public void close() {
        System.out.println("小米手机关机");

    }

    public void call() {
        System.out.println("小米手机打电话");

    }
}
