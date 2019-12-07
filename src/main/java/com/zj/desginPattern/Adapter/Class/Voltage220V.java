package com.zj.desginPattern.Adapter.Class;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/5 0005  10:44
 * 被适配类
 */
public class Voltage220V {
    public int output220v(){
        int src = 220;
        System.out.println("dianya="+src+"伏");
        return  src;
    }
}
