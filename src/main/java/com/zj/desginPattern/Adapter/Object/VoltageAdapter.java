package com.zj.desginPattern.Adapter.Object;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/5 0005  10:44
 */
public class VoltageAdapter implements Voltage5V {

    //被适配对象
    private  Voltage220V voltage220V = null;//关联关系的聚合

    //将被适配对象传进去
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    //适配方法
    public int output5V() {
        //获取到220v电压
        int src = voltage220V.output220v();
        int dst = src/44;
        return dst;
    }
}
