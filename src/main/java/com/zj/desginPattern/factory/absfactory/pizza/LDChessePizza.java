package com.zj.desginPattern.factory.absfactory.pizza;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  15:56
 */
public class LDChessePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪PIZZA");
        System.out.println("伦敦奶酪PIZZA  准备原材料");
    }
}
