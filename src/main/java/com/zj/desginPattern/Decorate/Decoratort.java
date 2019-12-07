package com.zj.desginPattern.Decorate;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  15:26
 */
public class Decoratort extends  Drink {


    //被装饰着
    private Drink obj;



    public float cost() {
        //自己+调料价格
        return super.getPrice()+obj.cost();
    }

    public Decoratort(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDes() {
        return super.getDes()+" "+super.getPrice()+"&&"+obj.getDes();
    }
}
