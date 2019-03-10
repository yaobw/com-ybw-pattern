package com.pattern.singleton.hungry;

/**
 * @author yaobw
 * @date 2019/3/10 12:48 PM
 * @since V1.0
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
