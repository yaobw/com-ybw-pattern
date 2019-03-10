package com.pattern.singleton.verifycoding;

import com.pattern.singleton.lazy.LazyInnerSingleton;

import java.lang.reflect.Constructor;

/**
 * @author yaobw
 * @date 2019/3/10 1:21 PM
 * @since V1.0
 */
public class LazyInnerSingletonTest {

    public static void main(String[] args) {
        Class clazz = LazyInnerSingleton.class;
        try {
            Constructor c =  clazz.getDeclaredConstructor(null);
            c.setAccessible(true);

            Object o = c.newInstance();

            Object o2 = LazyInnerSingleton.getInstance();

            System.out.println(o == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
