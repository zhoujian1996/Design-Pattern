package com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.Factory;

import com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.pizza.ChessPizza;
import com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.pizza.GreekPizza;
import com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  15:17
 * 简单工厂模式
 */
public class SimpleFactory {

    //根据orderType返回对应的Pizza对象
    public Pizza createPizza(String type) throws IOException {
        System.out.println("使用简单工厂创建pizza");
        Pizza pizza = null;
        String orderType;  //订购pizza类型
            if (type.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊Pizza");
            }else if(type.equals("chesse")){
                pizza = new ChessPizza();
                pizza.setName("奶酪Pizza");
            }
           return  pizza;
    }

        //写一个方法，可以获取客户需要的种类
        private  String getType() throws IOException {

            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");

            String str = bfr.readLine();
            return str;

        }
}
