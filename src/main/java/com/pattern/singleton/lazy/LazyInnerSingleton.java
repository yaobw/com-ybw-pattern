package com.pattern.singleton.lazy;

/**
 * @author yaobw
 * @date 2019/3/10 1:00 PM
 * @since V1.0
 */
public class LazyInnerSingleton {

    private LazyInnerSingleton(){
        if(LazyInit.singleton != null){
            throw new RuntimeException("不可重复创建多个实例");
        }

    }

    public static final LazyInnerSingleton getInstance(){
        return LazyInit.singleton;
    }

    private static class LazyInit{
        private static final LazyInnerSingleton singleton = new LazyInnerSingleton();

    }
}
