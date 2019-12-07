package com.zj.desginPattern.Observer;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  12:19
 *接口，让WheaterData实现
 */
public interface Subject {

    /**
     * 注册
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知
     */
    public void notifyObservers();



}
