package com.zj.desginPattern.factory.factorymethod.factory;



import com.zj.desginPattern.factory.factorymethod.Order.OrderPizza;
import com.zj.desginPattern.factory.factorymethod.pizza.*;

import java.io.IOException;


/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  16:05
 */
public class LDOrderPizza extends OrderPizza{



    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("chesse")){
            pizza = new LDChessePizza();
        }else  if(orderType.equals("pepper")){
            pizza = new LdPepperPizza();
        }
        return  pizza;
    }
}
