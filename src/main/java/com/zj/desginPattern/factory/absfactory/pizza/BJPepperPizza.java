package com.zj.desginPattern.factory.absfactory.pizza;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  15:56
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒PIZZA");
        System.out.println("北京胡椒PIZZA  准备原材料");
    }
}
