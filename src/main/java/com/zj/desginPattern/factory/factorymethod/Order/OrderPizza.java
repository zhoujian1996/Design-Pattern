package com.zj.desginPattern.factory.factorymethod.Order;

import com.zj.desginPattern.factory.factorymethod.pizza.Pizza;
import com.zj.desginPattern.factory.simplefactory.pizzastore.pizza.ChessPizza;
import com.zj.desginPattern.factory.simplefactory.pizzastore.pizza.GreekPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  14:37
 * 抽象工厂
 */
public abstract  class OrderPizza {

    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType=null;  //订购pizza类型
        do{
            try {
                orderType = getType();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pizza = createPizza(orderType); //由工厂子类实现
            //输出pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    //定义一个抽象方法 createPizza，让各个工厂自雷自己实现
    public abstract Pizza createPizza(String orderType);


    //写一个方法，可以获取客户需要的种类
    private  String getType() throws IOException {

            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");

            String str = bfr.readLine();
            return str;



    }
}
