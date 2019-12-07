package com.zj.desginPattern.facade;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  18:40
 */
public class Projector {
    //使用单例模式，使用饿汉式
    private  static   Projector instance = new  Projector();

    public static   Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Projector on");
    }

    public void off(){
        System.out.println(" Projector off");
    }

    public void focus(){
        System.out.println(" Projector focus");
    }



}
