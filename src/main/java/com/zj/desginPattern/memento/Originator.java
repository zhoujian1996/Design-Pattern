package com.zj.desginPattern.memento;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/14 0014  10:03
 */
public class Originator {
    private String status;//状态信息

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    //编写一个方法可以保存状态对象
    //因此编写一个方法返回Memento
    public Memento saveStateMemento(){
        return new Memento(status);
    }

    //通过北王力对象恢复状态
    public void getStateFromMemento(Memento memento){
        status = memento.getState();
    }






}
