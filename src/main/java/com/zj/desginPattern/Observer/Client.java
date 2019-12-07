package com.zj.desginPattern.Observer;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  12:23
 */
public class Client {

    public static void main(String[] args) {

        //创建一个WeatherData
        WheaterData wheaterData = new WheaterData();

        //创建观察者
        CurrentCondition currentCondition = new CurrentCondition();

        //注册到WHERATERdAta
        wheaterData.registerObserver(currentCondition);

        //测试
        System.out.println("测试");
        wheaterData.setData(10,1,1);

    }
}
