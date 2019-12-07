package com.zj.desginPattern.Adapter.Class;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/5 0005  10:44
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    //适配方法
    public int output5V() {
        //获取到220v电压
        int src = output220v();
        int dst = src/44;
        return dst;
    }
}
