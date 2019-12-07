package com.zj.desginPattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  11:11
 */
public class OutPutImpl {

    //学院集合
    List<Colleage> colleageList;

    public OutPutImpl(List<Colleage> colleageList) {
        this.colleageList = colleageList;
    }


    //遍历所有学院，然后调用printDepartment 输出各个学院的系
    public void printColleage(){
      //从ColleageList中取出所有学院,Java已经是新
        Iterator<Colleage> iterator = colleageList.iterator();
        while(iterator.hasNext()){
            Colleage colleage = (Colleage) iterator.next();
            System.out.println("学院名称"+colleage.getName());
            printDepartment(colleage.createIterator());
        }
    }




    //输出 学院输出系
    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
