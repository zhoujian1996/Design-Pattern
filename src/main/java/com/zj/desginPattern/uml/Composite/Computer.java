package com.zj.desginPattern.uml.Composite;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  20:37
 */
public class Computer {


    private Monitor monitor = new Monitor();//显示器不可以和computer分离
    private Mouse mouse = new Mouse(); //鼠标不可以和computer分离



}
