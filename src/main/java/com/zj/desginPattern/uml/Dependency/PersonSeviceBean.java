package com.zj.desginPattern.uml.Dependency;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  20:08
 */
public class PersonSeviceBean {
    private PersonDao personDao;//类

    public void save(Person person){}

    public IdCard getIdCard(Integer personId){
        return null;
    }

    public void modify(){
        DepartMent departMent = new DepartMent();
    }


}
