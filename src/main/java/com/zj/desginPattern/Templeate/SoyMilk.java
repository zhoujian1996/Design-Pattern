package com.zj.desginPattern.Templeate;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  11:28
 */
//抽象类表示豆浆
public abstract  class SoyMilk {
    //末班方法，make，做成final，不让子类覆盖
    public final  void make(){
        select();
        add();
        soak();
        beat();
    }

    public  void select(){
        System.out.println("第一步选择好的新鲜的黄豆");
    }

    //添加不同配料。子类具体实现
    public abstract void add();

    //浸泡
    public  void soak(){
        System.out.println("第三部，黄豆和配料开始浸泡，需要三个小时");
    }


    public  void beat(){
        System.out.println("第四部，黄豆和配料方法哦豆浆机打碎");
    }
}
