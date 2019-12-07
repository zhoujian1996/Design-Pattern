package com.zj.desginPattern.build.improve;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  19:15
 */
public class CommmonHouse extends  HouseBuilder {
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    public void buildWall() {
        System.out.println("普通房子砌墙10米");

    }

    public void roofed() {
        System.out.println("普通房子GAI屋顶");

    }
}
