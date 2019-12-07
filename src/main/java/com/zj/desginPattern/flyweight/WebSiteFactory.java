package com.zj.desginPattern.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  19:34
    网站工程：根据需求返回
 */
public class WebSiteFactory {

    //集合。充当池的作用
    Map<String,ConcreteWebSite> pool = new HashMap<String, ConcreteWebSite>();

    //根据网站的类型，返回一个网站，如果没有就创建一个对象，并放入到吃中
    public WebSite getWebSiteCategory(String type,User user){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type,user));
        }
        return (WebSite)pool.get(type);
    }


    //获取网站分类中暑
    public int getPoolSize(){
        return pool.size();
    }
}
