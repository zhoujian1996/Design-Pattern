package com.zj.desginPattern.composite;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  18:12
 */
public class Client {

    public static void main(String[] args) {
        //从大到小创建对象

        //大学
        OrgnizationComponent university = new University("清华大学", "中国顶级大学");

        //学院
        OrgnizationComponent computerColleage = new Colleage("计算机学院", "计算机学院");
        OrgnizationComponent infoEnginerrColleage = new Colleage("信息工程学院", "信息工程学院");

        //将学院加入到大学中
        university.add(computerColleage);
        university.add(infoEnginerrColleage);

        //创建各个学院下面的系（专业)
        computerColleage.add(new Department("软件功能", "软件工程不错"));
        computerColleage.add(new Department("网络工程", "网络工程工程不错"));
        computerColleage.add(new Department("计算机科学与技术", "计算机工程不错"));

        infoEnginerrColleage.add(new Department("通信工程", "通信工程不错"));
        infoEnginerrColleage.add(new Department("电子工程", "电子工程不错"));


        university.print();
    }}
