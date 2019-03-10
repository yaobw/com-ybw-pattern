package com.pattern.singleton.lazy;

/**
 * @author yaobw
 * @date 2019/3/10 12:49 PM
 * @since V1.0
 */
public class DoubleCheckSingleton {
    //指令重排序的问题， volatile
    public volatile static DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }

        return singleton;
    }
}
