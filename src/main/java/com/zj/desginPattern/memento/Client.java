package com.zj.desginPattern.memento;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/14 0014  10:09
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();


        originator.setStatus("状态1 攻击力100");
        //        //保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setStatus("状态2 攻击力80");
        //        //        //保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setStatus("状态3 攻击力50");
        //        //        //保存了当前的状态
        caretaker.add(originator.saveStateMemento());
        System.out.println("当前的额状态是"+originator.getStatus());

        //希望恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("当前的额状态是"+originator.getStatus());


    }
}
