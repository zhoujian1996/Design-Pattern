package com.zj.desginPattern.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/30 0030  12:12
 */
public class ProxyFactory {

    //维护一个目标对象，Object,被代理对象
    private TeacherDao target;

    //构造器，对target进行初始化
    public ProxyFactory(TeacherDao target) {
        this.target = target;
    }

    /**
     *
     * @
     * 给目标对象生成一个代理对象
     * 1、根据传入的对象，被代理对象
     * 2、利用反射机制，返回一个代理对象
     * 3、然后通过
     */
    public Object getProxyInstance(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("使用动态代理模式");
                        //反射机制调用目标对象的方法
                        Object o = method.invoke(target,args);
                        System.out.println("动态代理对象模式结束");
                        return o;
                    }
                });
    }
}
