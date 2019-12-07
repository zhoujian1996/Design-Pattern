package com.zj.desginPattern.factory.absfactory.pizzaStore;

import com.zj.desginPattern.factory.absfactory.factory.BJFactory;
import com.zj.desginPattern.factory.factorymethod.Order.OrderPizza;

import java.io.IOException;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  16:36
 */
public class PizzaStore {
    public static void main(String[] args) throws IOException {
        new com.zj.desginPattern.factory.absfactory.Order.OrderPizza(new BJFactory());
    }
}
