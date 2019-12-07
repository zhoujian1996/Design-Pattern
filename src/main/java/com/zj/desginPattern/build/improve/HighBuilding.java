package com.zj.desginPattern.build.improve;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  19:15
 */
public class HighBuilding extends  HouseBuilder {
    public void buildBasic() {
        System.out.println("高楼打地基10米");
    }

    public void buildWall() {
        System.out.println("高楼砌墙20米");

    }

    public void roofed() {
        System.out.println("高楼GAI屋顶");

    }
}
