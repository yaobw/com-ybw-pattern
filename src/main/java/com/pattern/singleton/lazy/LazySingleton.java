package com.pattern.singleton.lazy;

/**
 * @author yaobw
 * @date 2019/3/10 12:57 PM
 * @since V1.0
 */
public class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
