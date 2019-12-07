package com.zj.desginPattern.Adapter.Class;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/5 0005  10:44
 */
public class Phone {

    /**
     * 充电
     *   依赖 Voltage5v 最后传的还是传VoltageAdapter
     */
    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5V()==5){
            System.out.println("电压为5v，可以充电");
        }else if(voltage5V.output5V()>5){
            System.out.println("电压过高，无法充电");
        }
    }

}
