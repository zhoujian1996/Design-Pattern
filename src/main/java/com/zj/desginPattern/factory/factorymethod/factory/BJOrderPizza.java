package com.zj.desginPattern.factory.factorymethod.factory;



import com.zj.desginPattern.factory.factorymethod.Order.OrderPizza;
import com.zj.desginPattern.factory.factorymethod.pizza.BJChessePizza;
import com.zj.desginPattern.factory.factorymethod.pizza.BJPepperPizza;
import com.zj.desginPattern.factory.factorymethod.pizza.Pizza;

import java.io.IOException;


/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  16:05
 */
public class BJOrderPizza extends OrderPizza{




    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("chesse")){
            pizza = new BJChessePizza();
        }else  if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return  pizza;
    }
}
