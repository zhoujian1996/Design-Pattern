package com.zj.desginPattern.factory.absfactory.factory;

import com.zj.desginPattern.factory.absfactory.pizza.Pizza;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/1 0001  16:22
 * 抽象工厂模式的接口  抽象层
 */
public interface AbsFactory {
    /**
     * 让下面的工厂子类具体实现
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType);
}
