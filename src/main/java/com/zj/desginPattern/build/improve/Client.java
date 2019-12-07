package com.zj.desginPattern.build.improve;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  19:23
        盖普通房子s
    */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommmonHouse commmonHouse = new CommmonHouse();

        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commmonHouse);

        //完成盖房，返回产品
        House house = houseDirector.constructHouse();

        System.out.println("输出流程");




        //盖高楼
        //重建构造者
        HighBuilding highBuilding = new HighBuilding();

        houseDirector.setHouseBuilder(highBuilding);

        House house1 = houseDirector.constructHouse();

    }
}
