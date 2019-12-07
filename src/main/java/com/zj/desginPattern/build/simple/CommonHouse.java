package com.zj.desginPattern.build.simple;

import com.zj.desginPattern.build.simple.AbstractHouse;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  18:54
 */
public class CommonHouse extends AbstractHouse {
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    public void buildWalls() {
        System.out.println("给普通房子砌墙");


    }

    public void roofed() {
        System.out.println("给普通房子封顶");

    }
}
