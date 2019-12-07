package com.zj.desginPattern.Singleton.Type6;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  22:14
 * 懒汉狮(改进===线程安全 加入sychnronized
 * 双重检查
 */
public class SingletonTest06 {


    public static void main(String[] args) {
        System.out.println("懒汉式线程不安全");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode()==singleton1.hashCode());
    }

}

/**
 * 优缺点说明:
 *      1)Double-check概念是多线程开发中经常使用的，如代码中所示，我们进行了两次if(instance==null)检查，这样就可以保证线程安全
 *
 *      2）这样，实例化代码只用执行一次，后面再次访问时，判断if(instance==null) 直接return实例化对象时，也避免了反复进行同步方法
 *
 *      线程安全：延迟加载，效率较高
 *
 *      结论：在实际开发中推荐使用
 */
class Singleton{
    private  static Singleton instance;

    //私有的构造函数
    private  Singleton(){}

    /**
     *提供静同事家态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
     * ‘
     *
     *
     */
    public static Singleton getInstance(){
        if(instance==null){

            synchronized (Singleton.class) {
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return  instance;
    }

}
