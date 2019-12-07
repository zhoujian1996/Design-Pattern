package com.zj.desginPattern.Visitor;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  13:22
 */
public abstract class Action {

    //得到男性的测评结果
    public abstract  void getManResult(Man man);

    //得到女性的测评结果
    public abstract  void getWoManResult(Woman woman);


}
