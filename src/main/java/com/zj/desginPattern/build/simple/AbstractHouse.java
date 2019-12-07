package com.zj.desginPattern.build.simple;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  18:52
 */
public abstract  class AbstractHouse {

    //打地基
    public abstract  void buildBasic();

    //砌墙
    public abstract  void buildWalls();

    //封顶
    public abstract  void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }




}
