package com.zj.desginPattern.flyweight;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  19:35
 */
public class Client {

    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        //客户要求一个以新闻形式哦发布的网站
        User user = new User();
        user.setName("tom");
        WebSite webSite = factory.getWebSiteCategory("新闻",user);

        webSite.use();

//        //客户要求一个以新闻形式哦发布的网站
//        WebSite webSite1 = factory.getWebSiteCategory("boke");
//
//        webSite1.use();
    }
}
