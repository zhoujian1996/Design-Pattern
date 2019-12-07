package com.zj.desginPattern.factory.simplefactory.pizzastore.pizza;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  14:36
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊Pizza准备原材料");
    }
}
