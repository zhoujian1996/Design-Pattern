package com.zj.desginPattern.factory.absfactory.Order;

import com.zj.desginPattern.factory.absfactory.factory.AbsFactory;
import com.zj.desginPattern.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  16:24
 */
public class OrderPizza {
    private AbsFactory absFactory = null;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        Pizza pizza = null;//需要使用到Pizza对象，使用创建对象
        String orderType="";

        do{
            try {
                orderType = getType();
                pizza = absFactory.createPizza(orderType);//factory可能是bj工厂子类也可能是伦敦
                if(pizza!=null){
                    pizza.prepare();
                    pizza.bake();
                    pizza.cut();
                    pizza.box();
                }else{
                    System.out.println("订购失败");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }while(true);
    }

    public static void main(String[] args) {

    }

    //写一个方法，可以获取客户需要的种类
    private  String getType() throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");

        String str = bfr.readLine();
        return str;



    }
}
