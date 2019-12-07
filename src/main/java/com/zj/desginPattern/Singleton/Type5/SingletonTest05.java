package com.zj.desginPattern.Singleton.Type5;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  22:14
 * 懒汉狮(改进===线程安全 加入sychnronized
 * 懒加载
 */
public class SingletonTest05 {


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


    public static  Singleton getInstance(){
        if(instance==null){

            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return  instance;
    }

}
