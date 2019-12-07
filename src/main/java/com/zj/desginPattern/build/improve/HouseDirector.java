package com.zj.desginPattern.build.improve;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  19:18
 * 指挥者动态指定制作流程，返回产品
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //通过构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子，将房子放回
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();

        return  houseBuilder.buildHouse();
    }


}
