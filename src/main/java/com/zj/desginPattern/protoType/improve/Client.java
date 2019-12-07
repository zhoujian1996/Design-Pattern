package com.zj.desginPattern.protoType.improve;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  20:57
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("原型");
        Sheep sheep = new Sheep("tom",1,"baise");
        sheep.setFriend(new Sheep("JACK",2,"黑色"));

        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();

        System.out.println(sheep4);

    }
}
