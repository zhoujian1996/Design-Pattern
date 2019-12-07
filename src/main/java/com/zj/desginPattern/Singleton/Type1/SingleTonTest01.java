package com.zj.desginPattern.Singleton.Type1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/31 0031  21:55
 */
public class SingleTonTest01 {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println(singleTon);
    }






}

/**
 * 优缺点说明:
 *          1)优点：这种写法比较简单，就是在类装载的时候就去实例化，避免了线程同步问题
 *          2)缺点： 在类装载的时候就完成实例化，没有达到Lazy Loading的效果。
 *                    如果从食职中从未使用这个实例，则会造成内存的浪费
 *
 *                    要求：
 *                          1）构造器私有化
 *                          2）类的内部创建对象
 *                          3）向外暴露一个静态的公共方法：getInstance()
 *
 */
//饿汉狮（静态变量)
class SingleTon{
    //1、构造器私有化,，外部不那个new
    private SingleTon(){ }

    //2、在本类类部创建对象实例
    private static SingleTon instance = new SingleTon();

    //3、对外提供一个公有的静态方法，返回实例对象
    public static  SingleTon getInstance(){
        return  instance;
    }


}
