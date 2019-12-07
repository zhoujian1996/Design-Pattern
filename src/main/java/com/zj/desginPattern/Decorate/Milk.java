package com.zj.desginPattern.Decorate;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  15:31
 */
public class Milk  extends  Decoratort{

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2);
    }
}
