package com.zj.desginPattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/14 0014  10:07

 */
public class Caretaker {

    //在List集合中有很多备忘录对象
    private List<Memento> mementoList =new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    /**
     * 获取第index个Originator的备忘录对象（即保存状态)
     * @param index
     * @return
     */
    public Memento get(int index){
        return mementoList.get(index);
    }


}
