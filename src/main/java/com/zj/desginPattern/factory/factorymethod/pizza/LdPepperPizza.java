package com.zj.desginPattern.factory.factorymethod.pizza;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  15:56
 */
public class LdPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒PIZZA");
        System.out.println("伦敦胡椒PIZZA  准备原材料");
    }
}
