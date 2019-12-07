package com.zj.desginPattern.iterator;

import java.util.Iterator;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  11:09
 */
public interface Colleage {

    public String getName();

    //增加系的方法
    public void addDepartment(String name,String desc);

    //返回迭代器
    public Iterator<Department> createIterator();
}
