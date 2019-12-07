package com.zj.desginPattern.facade;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  18:39
 */
public class Popcorn {

    //使用单例模式，使用饿汉式
    private  static  Popcorn instance = new Popcorn();

    public static  Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("popcorn on");
    }

    public void pop(){
        System.out.println("popcorn pop");
    }

    public void off(){
        System.out.println("popcorn off");
    }
}
