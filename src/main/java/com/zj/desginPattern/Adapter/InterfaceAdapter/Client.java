package com.zj.desginPattern.Adapter.InterfaceAdapter;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/5 0005  11:15
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要覆盖我们 需要使用 接口的方法
            @Override
            public void m1() {
                System.out.println("使用了M1的方法");
            }
        };
        absAdapter.m1();
    }
}
