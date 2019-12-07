package com.zj.desginPattern.facade;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  18:43
 */
public class Stereo {

    //使用单例模式，使用饿汉式
    private  static Stereo instance = new Stereo();

    public static  Stereo getInstance(){
            return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void up(){
        System.out.println("Stereo up");
    }



}
