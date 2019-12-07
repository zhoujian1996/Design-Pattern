package com.zj.desginPattern.Proxy.StaticProxy;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/30 0030  11:33
 */
//代理对象，静态代理
public class TeacherDaoProxy implements IteacherDao {

    private TeacherDao target;//目标对象，通过接口来聚合

    //构造器
    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    public void teach() {

        System.out.println("代理对象开始");
        target.teach();
        System.out.println("代理对象结束");
    }
}
