package com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.Order;



import com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.Factory.SimpleFactory;
import com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.pizza.ChessPizza;
import com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.pizza.GreekPizza;
import com.zj.desginPattern.factory.simplefactory.pizzastoreImprovw.pizza.Pizza;

import javax.swing.plaf.synth.SynthStyle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  14:37
 */
public class OrderPizza {

    private SimpleFactory simpleFactory; //聚合关系 也可以用组合噶虚拟
    private Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory) throws IOException {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) throws IOException {
        String orderType = "";//用户输入的

        this.simpleFactory = simpleFactory; //设置工厂对象

        do{
            orderType = getType();

            pizza = this.simpleFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("比萨订购失败");
                break;
            }
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
