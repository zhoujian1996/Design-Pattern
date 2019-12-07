package com.zj.desginPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  17:57
 */
public class Colleage extends OrgnizationComponent {

    //list中存放的Department
    List<OrgnizationComponent> orgnizationComponents = new ArrayList<OrgnizationComponent>();


    public Colleage(String name, String desc) {
        super(name, desc);
    }


    @Override
    public void add(OrgnizationComponent orgnizationComponent) {
        orgnizationComponents.add(orgnizationComponent);
    }

    @Override
    public void remove(OrgnizationComponent orgnizationComponent) {
        orgnizationComponents.remove(orgnizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    //print输出，就是输出University包含的学员
    public void print() {
        System.out.println(getName());
        for (OrgnizationComponent orgnizationComponent : orgnizationComponents) {
            orgnizationComponent.print();
        }
    }
}
