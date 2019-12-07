package com.zj.desginPattern.protoType.improve;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  20:54
 */
public class Sheep implements  Cloneable {

    private  String name;

    private  int age;

    private  String color;

    private  Sheep friend; //是对象 如何克隆的

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 克隆该实例，使用默认的克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep= (Sheep)super.clone();
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }
}
