package com.zj.desginPattern.iterator;

import java.util.Iterator;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  11:07
 */
public class ComputerColleageIterator implements Iterator<Department> {

    //这里需要知道Department是以怎样的方式存放的
    Department[] departMents;
    int position = 0;//遍历的位置

    //带遍历的数据
    public ComputerColleageIterator(Department[] departMents) {
        this.departMents = departMents;
    }

    /**
     * 判断是否右下一个元素
     * @return
     */
    public boolean hasNext() {

        if(position>=departMents.length||departMents[position]==null){
            return  false;
        }else{
            return true;

        }
    }

    /**
     *
     * @return
     */
    public Department next() {
        return departMents[position++];
    }

    public void remove() {

    }
}
