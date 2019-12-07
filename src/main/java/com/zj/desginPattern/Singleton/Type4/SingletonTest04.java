package com.zj.desginPattern.Singleton.Type4;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  22:14
 * 懒汉狮(改进===线程安全 加入sychnronized
 * 懒加载
 */
public class SingletonTest04 {


    public static void main(String[] args) {
        System.out.println("懒汉式线程不安全");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode()==singleton1.hashCode());
    }

}

/**
 * 优缺点说明:
 * 1)解决了线程安全的问题
 * 2）效率太低了，每个线程在想获得类的实例时候，执行getInSTANCE()方法都要进行同步。
 *   而其实这个方法只执行一次实例化代码就够了，后面想获得该类实例，直接return
 *
 */
class Singleton{
    private  static Singleton instance;

    //私有的构造函数
    private  Singleton(){}

    //提供一个公有的静态方法，当使用该方法时，才去创建instance
    //即懒汉狮,和Type1和Type2的区别是只有当使用到对象时才创建，即懒汉式，前面的迫不及待的创建，饿汉狮
    //加入Synchronized线程安全
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return  instance;
    }

}
