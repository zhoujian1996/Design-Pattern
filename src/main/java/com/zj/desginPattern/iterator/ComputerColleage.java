package com.zj.desginPattern.iterator;

import java.util.Iterator;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  11:09
 */
public class ComputerColleage implements Colleage {

    Department[] departments;
    int numOfDepartment = 0;//保存当前数组对象个数


    public String getName() {
        return "计算机学院";
    }

    public ComputerColleage() {
        departments = new Department[5];
        addDepartment("JAVA","java专业");
        addDepartment("php","php专业");
        addDepartment("大数据","大数据专业");
    }

    public void addDepartment(String name, String desc) {
        departments[numOfDepartment++] = new Department(name,desc);

    }

    public Iterator<Department> createIterator() {
        return new ComputerColleageIterator(departments);
    }
}
