package com.zj.desginPattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  11:10
 */
public class InfoColleage implements Colleage {

    List<Department> departments;


    public String getName() {
        return "信息学院";
    }

    public InfoColleage() {
        departments = new ArrayList<Department>();
        addDepartment("信息","xinxi ");
        addDepartment("电子","电子");

    }

    public void addDepartment(String name, String desc) {
      departments.add(new Department(name,desc));

    }

    public Iterator<Department> createIterator() {
        return new InfoColleageIterator(departments);
    }
}
