package com.zj.desginPattern.Visitor;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  13:25这里
 * s说明：
 * 1、这里我们使用到双分派，即首先在客户端程序中，将具体状态作为参数传递到woman 中（第一次分派）
 * 2、Woman类调用作为参数的具体方法中方法 getWomanResuly，同时将自己（this)作为参数传入
 * 完成第二次的分派
 *
 */
public class Woman extends Person {
    public void accept(Action action) {
        action.getWoManResult(this);
    }
}
