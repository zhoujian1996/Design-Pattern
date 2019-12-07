package com.zj.desginPattern.protoType.Simple;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  20:45
 */
public class Client {

    public static void main(String[] args) {

            Sheep sheep1 = new Sheep();
            sheep1.setAge(1);
            sheep1.setColor("白色");
            sheep1.setName("tom");

        Sheep sheep2 = new Sheep();
        sheep2.setAge(1);
        sheep2.setColor("白色");
        sheep2.setName("tom");

        Sheep sheep3 = new Sheep();
        sheep3.setAge(1);
        sheep3.setColor("白色");
        sheep3.setName("tom");


    }
}
