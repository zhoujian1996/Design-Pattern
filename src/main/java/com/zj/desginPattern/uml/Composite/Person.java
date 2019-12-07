package com.zj.desginPattern.uml.Composite;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  20:55
 */
public class Person {

    private  Head head = new Head(); //组合关系，不可以分割
    private IdCard idCard;//聚合关系，可以分割
}
