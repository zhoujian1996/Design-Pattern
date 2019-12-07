package com.zj.desginPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  11:11
 */
public class Client {
    public static void main(String[] args) {

        //创建学院
        List<Colleage> colleages = new ArrayList<Colleage>();


        colleages.add(new ComputerColleage());
        colleages.add(new InfoColleage());

        new OutPutImpl(colleages).printColleage();
    }
}
