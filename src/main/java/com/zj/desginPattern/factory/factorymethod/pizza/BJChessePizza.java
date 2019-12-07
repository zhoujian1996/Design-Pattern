package com.zj.desginPattern.factory.factorymethod.pizza;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  15:56
 */
public class BJChessePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪PIZZA");
        System.out.println("北京奶酪PIZZA  准备原材料");
    }
}
