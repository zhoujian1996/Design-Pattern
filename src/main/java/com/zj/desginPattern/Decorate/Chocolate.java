package com.zj.desginPattern.Decorate;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  15:29
 */
//具体的Decorator，这里就是调味品
public class Chocolate extends Decoratort {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3); //调味品价格
    }






}
