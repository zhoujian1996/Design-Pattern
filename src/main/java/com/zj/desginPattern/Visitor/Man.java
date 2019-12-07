package com.zj.desginPattern.Visitor;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  13:24
 */
public class Man extends Person {
    public void accept(Action action) {
        action.getManResult(this);
    }
}
