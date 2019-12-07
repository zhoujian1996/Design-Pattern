package com.zj.desginPattern.Singleton.Type3;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  22:14
 * 懒汉狮(线程不啊安全）
 * 懒加载
 */
public class SingletonTest03 {


    public static void main(String[] args) {
        System.out.println("懒汉式线程不安全");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode()==singleton1.hashCode());
    }

}

/**
 * 优缺点说明:
 *          1)起到了懒加载的效果，但是只能在单线程下使用
 *          2）如果在多线程的情况下，一个线程进入了 if(singleton==null)判断语句
 *              还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例
 *              所以在多线程环境下不可使用这种方式
 */
class Singleton{
    private  static  Singleton instance;

    //私有的构造函数
    private  Singleton(){}

    //提供一个公有的静态方法，当使用该方法时，才去创建instance
    //即懒汉狮,和Type1和Type2的区别是只有当使用到对象时才创建，即懒汉式，前面的迫不及待的创建，饿汉狮
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return  instance;
    }

}
