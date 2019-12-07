package com.zj.desginPattern.Singleton.Type8;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  13:57
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance==instance1);
    }
}

//使用枚举，可以实现单例，推荐
enum Singleton{

    INSTANCE;//属性

    public void  sayOk(){
        System.out.println("ok~");
    }


}