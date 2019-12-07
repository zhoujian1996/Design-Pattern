package com.zj.desginPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  12:21
 * 1、包含天气最新情况
 * 2、包含有观察者集合，使用ArrayList管理
 * 3、当数据有更新时，就主动的调用ArrayList  接收方就会看到最新的消息
 */
public class WheaterData implements Subject {


    //观察者集合,聚合观察者对象
    List<Observer> observers;

    private float temperature;
    private float  pressure;
    private float  humidity;


    public WheaterData() {
        observers = new ArrayList<Observer>();
    }


    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    public void dataChage(){
        notifyObservers();
    }

    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        dataChage();
    }
    public void notifyObservers() {
            for(Observer observer:observers){
                observer.update(temperature,pressure,humidity);
            }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
