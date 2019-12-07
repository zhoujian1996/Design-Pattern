package com.zj.desginPattern.facade;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  18:41
 */
public class Screen {
    //使用单例模式，使用饿汉式
    private  static   Screen instance = new  Screen();

    public static  Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println(" Screen up");
    }

    public void down(){
        System.out.println(" Screen down");
    }



}
