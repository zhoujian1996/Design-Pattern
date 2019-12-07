package com.zj.desginPattern.factory.absfactory.factory;

import com.zj.desginPattern.factory.absfactory.pizza.*;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  16:23
 */
public class LDFactory implements AbsFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if(pizza.equals("chesse")){
            pizza = new LDChessePizza();
        }else if(pizza.equals("pepple")){
            pizza = new LdPepperPizza();
        }
        return  pizza;
    }
}
