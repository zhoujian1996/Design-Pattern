package com.zj.desginPattern.protoType.Simple;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/4 0004  20:45
 */
public class Sheep {

    private  String name;

    private  int age;

    private  String color;

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
}
