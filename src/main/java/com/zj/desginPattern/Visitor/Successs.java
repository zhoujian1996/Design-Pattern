package com.zj.desginPattern.Visitor;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  13:25
 */
public class Successs extends  Action {
    public void getManResult(Man man) {
        System.out.println("男人给的评价是成功");
    }

    public void getWoManResult(Woman woman) {
        System.out.println("女人给的评价是成功");
    }
}
