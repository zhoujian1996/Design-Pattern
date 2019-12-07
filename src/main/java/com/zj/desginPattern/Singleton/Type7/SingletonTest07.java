package com.zj.desginPattern.Singleton.Type7;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  22:14
 *  静态内部类
 * j */
public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println("懒汉式线程不安全");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode()==singleton1.hashCode());
    }

}

/**
 * 静态内部类，推荐使用
 *
 * 优缺点：
 *      1）这种方式采用了类加载机制来保证初始化实例时只有一个线程
 *      2）静态内部类在Singleton类被加载时并不会立即实例化，而是在需要实例化的时候，调用
 *         getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化
 *       3）类的属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全，在类初始化时，别的线程时无法进入的
 *       优点：避免了线程不安全，利用静态内部类特点实现了延迟加载，效率高
 */
class Singleton{


    //私有的构造函数
    private  Singleton(){}

    //写一个静态内部类，该类中有一个静态属性
    private static class SingketonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一工友的静态方法，直接返回SingletonInstance.INSTANCE
    public static synchronized  Singleton getInstance(){
        return  SingketonInstance.INSTANCE;
    }

}
