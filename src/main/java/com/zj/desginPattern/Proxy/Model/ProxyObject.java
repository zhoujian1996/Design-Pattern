package com.zj.desginPattern.Proxy.Model;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/30 0030  11:14
 * 代理对象，使用被代理对象
 */
public class ProxyObject {

    //以来被代理对象
    private TargetObject targetObject;

    public ProxyObject(TargetObject targetObject) {
        this.targetObject = targetObject;
    }






}
