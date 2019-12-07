package com.zj.desginPattern.uml.Aggregation;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  20:37
 */
public class Computer {
    private Monitor monitor;//显示器可以和computer分离
    private  Mouse mouse; //鼠标可以和computer分离

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
