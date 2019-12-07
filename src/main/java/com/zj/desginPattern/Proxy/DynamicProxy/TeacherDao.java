package com.zj.desginPattern.Proxy.DynamicProxy;


/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/30 0030  11:32
 * 被代理对象
 */
public class TeacherDao implements IteacherDao {

    public void teach() {
        System.out.println("被代理对象中的老师在教书");
    }
}
