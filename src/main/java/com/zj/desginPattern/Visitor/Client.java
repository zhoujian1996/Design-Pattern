package com.zj.desginPattern.Visitor;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  13:36
 */
public class Client {

    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());


        //成功
        Successs success =new Successs();
        objectStructure.display(success);
    }
}
