package com.zj.desginPattern.composite;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  17:57
 */
public class Department extends OrgnizationComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }

    public void print() {
        System.out.println(getName());
    }
}
