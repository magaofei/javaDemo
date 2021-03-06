package main.com.mark.design.observer;

public interface Observer {
    /**
     * 当气象观测数据改变时，主题会把这些状态值当作方法的参数，传送给观察者
     */
    public void update(float temp, float humidity, float pressure);

}