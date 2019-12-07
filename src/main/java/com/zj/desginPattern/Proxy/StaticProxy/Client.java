package com.zj.desginPattern.Proxy.StaticProxy;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/30 0030  11:35
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象)
        TeacherDao target = new TeacherDao();

        //创建代理对象，同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(target);

        //通过代理对象，调用被代理对象的方法
        //即：执行的时代理对象的方法，代理对象再去调用目标对象的方法
        teacherDaoProxy.teach();
    }
}
