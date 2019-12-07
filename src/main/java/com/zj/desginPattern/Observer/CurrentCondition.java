package com.zj.desginPattern.Observer;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/12 0012  12:23
 */
public class CurrentCondition implements  Observer {

    private float temperature;
    private float  pressure;
    private float  humidity;

    public CurrentCondition() {
    }

    public CurrentCondition(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
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

    public void display(){
        System.out.println("温度为"+temperature);
        System.out.println("起亚为"+pressure);
        System.out.println("湿度为"+humidity);
    }

    public void update(float temperature, float pressure, float humidity) {
        this.pressure=pressure;
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
}
