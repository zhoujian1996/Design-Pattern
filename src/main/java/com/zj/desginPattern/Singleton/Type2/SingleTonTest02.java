package com.zj.desginPattern.Singleton.Type2;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  21:55
 */
public class SingleTonTest02 {

    public static void main(String[] args) {
        SingleTon1 singleTon = SingleTon1.getInstance();
        System.out.println(singleTon);
    }






}

/**
 * 这种方法和上面的方式其实类似，只不过是将类实例化的过程放在了静态代码块中，
 * 也是在类加载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面一样。
 */
//饿汉狮（静态代码块)
class SingleTon1{
    //1、构造器私有化,，外部不那个new
    private SingleTon1(){ }

    //2、在本类类部创建对象实例
    private static SingleTon1 instance ;


    static { //在静态代码块中，创建单例对象
        instance = new SingleTon1();
    }
    //3、对外提供一个公有的静态方法，返回实例对象
    public static SingleTon1 getInstance(){
        return  instance;
    }


}
