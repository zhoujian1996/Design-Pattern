package com.zj.desginPattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  11:08
 */
public class InfoColleageIterator implements Iterator<Department> {

    List<Department> departments;
    int index = 0;//索引

    public InfoColleageIterator(List<Department> departments) {
        this.departments = departments;
    }

    //判断集合中是否有下一个元素
    public boolean hasNext() {

        if(index>=departments.size()-1){
            return false;
        }
        else{
            index++;
            return  true;
        }
    }

    public Department next() {
        return departments.get(index);
    }

    public void remove() {

    }
}
