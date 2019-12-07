package com.zj.desginPattern.flyweight;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  19:34
 */

public class ConcreteWebSite extends WebSite {
    //网站发布类型
    private  String type="";
    private  User user;


    public ConcreteWebSite(String type,User user) {
        this.type = type;
        this.user = user;
    }

    public void use() {
        System.out.println("网站发布形式为"+type+"  "+user.getName()+"在使用");
    }
}
