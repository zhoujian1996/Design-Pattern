package com.zj.desginPattern.facade;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  18:46
 */
public class TheaterLight {
    //使用单例模式，使用饿汉式
    private  static  TheaterLight instance = new TheaterLight();

    public static  TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }

    public void dim(){
        System.out.println("TheaterLight dim");
    }

    public void bright(){
        System.out.println("TheaterLight bright");
    }



}
