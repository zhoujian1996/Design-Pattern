package com.zj.desginPattern.factory.absfactory.factory;

import com.zj.desginPattern.factory.absfactory.pizza.BJChessePizza;
import com.zj.desginPattern.factory.absfactory.pizza.BJPepperPizza;
import com.zj.desginPattern.factory.absfactory.pizza.Pizza;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  16:22
 */
public class BJFactory implements  AbsFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用抽象工厂迷失");
        if(orderType.equals("chesse")){
            pizza = new BJChessePizza();
        }else if(orderType.equals("pepple")){
            pizza = new BJPepperPizza();
        }
        return  pizza;
    }
}
