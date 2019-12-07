package com.zj.desginPattern.memento;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/14 0014  10:04
 */
public class Memento {

    private  String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}
