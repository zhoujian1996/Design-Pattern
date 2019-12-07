package com.zj.desginPattern.Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  13:33
 * 维护了一个集合
 *
 * 数据结构，管理很多（Man,Woman)
 */
public class ObjectStructure {

    private List<Person> persons = new LinkedList<Person>();

    //添加一出方法
    public void attach(Person person){
        persons.add(person);
    }


    public void detach(Person person){
        persons.remove(person);
    }

    //显示测评的情况
    public void display(Action action){
        for(Person p:persons){
            p.accept(action);
        }
    }

}
