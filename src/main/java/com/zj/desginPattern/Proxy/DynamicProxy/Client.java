package com.zj.desginPattern.Proxy.DynamicProxy;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/30 0030  12:20
 */
public class Client {

    public static void main(String[] args) {

        //创建目标对象
        TeacherDao target = new TeacherDao();

        //给目标对象，创建代理对象，可以转换成ITeacherDao
        ProxyFactory proxyFactory = new ProxyFactory(target);


        IteacherDao proxyInstance = (IteacherDao)proxyFactory.getProxyInstance();

        //proxyInstanceclass com.sun.proxy.$Proxy0 在内存中动态生成了代理对象
       // System.out.println("proxyInstance"+proxyInstance.getClass());

        //通过代理对象，调用目标对象的方法
        proxyInstance .teach();
    }
}
