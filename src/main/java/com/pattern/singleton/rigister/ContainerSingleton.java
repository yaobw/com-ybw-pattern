package com.pattern.singleton.rigister;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yaobw
 * @date 2019/3/10 2:08 PM
 * @since V1.0
 */
public class ContainerSingleton {
    /**
     * Spring就用这种方式完成单例模式
     */
    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else{
                return ioc.get(className);
            }
        }
    }
}
