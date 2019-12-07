package com.zj.desginPattern.Decorate;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  15:33
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下订单：2份巧克力+一份牛奶的LongBlack

        //1、点1份LongBlack
        Drink order = new LongBlack();
        System.out.println("现在的订单"+order.getDes());
        System.out.println("费用"+order.cost());
        System.out.println("============");
        //2、加入一份牛奶
        order = new Milk(order);
        System.out.println("现在的订单"+order.getDes());
        System.out.println("费用"+order.cost());
        System.out.println("============");

        //3、加入一份巧克力
        order = new Milk(order);
        System.out.println("现在的订单"+order.getDes());
        System.out.println("费用"+order.cost());




    }
}
