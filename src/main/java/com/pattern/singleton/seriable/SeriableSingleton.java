package com.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @author yaobw
 * @date 2019/3/10 2:31 PM
 * @since V1.0
 */
public class SeriableSingleton implements Serializable {

    private SeriableSingleton(){}

    private static final SeriableSingleton singleton = new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return singleton;
    }

    private  Object readResolve(){
        return  singleton;
    }
}
