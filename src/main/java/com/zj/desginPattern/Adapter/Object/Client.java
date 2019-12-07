package com.zj.desginPattern.Adapter.Object;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/5 0005  10:45
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("对象适配器模式");

        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
