package com.zj.desginPattern.Visitor;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  13:24
 */
public abstract class Person {

    //提供一个方法让访问者可以访问
    public abstract void accept(Action action);

}
