package com.zj.desginPattern.factory.simplefactory.pizzastore.Order;

import com.zj.desginPattern.factory.simplefactory.pizzastore.pizza.ChessPizza;
import com.zj.desginPattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.zj.desginPattern.factory.simplefactory.pizzastore.pizza.Pizza;

import javax.swing.plaf.synth.SynthStyle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  14:37
 */
public class OrderPizza {

    //构造器
    public OrderPizza() throws IOException {
        Pizza pizza = null;
        String orderType;  //订购pizza类型
        do{
            orderType = getType();
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊Pizza");
            }else if(orderType.equals("chesse")){
                pizza = new ChessPizza();
                pizza.setName("奶酪Pizza");
            }else{
                break;
            }
            //输出pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    //写一个方法，可以获取客户需要的种类
    private  String getType() throws IOException {

            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");

            String str = bfr.readLine();
            return str;



    }
}
