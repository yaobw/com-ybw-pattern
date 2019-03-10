package com.pattern.singleton.verifycoding;

import com.pattern.singleton.threadlocal.ThreadLocalSingleton;
import com.pattern.singleton.util.ThreadLocalThreadExecutor;

/**
 * @author yaobw
 * @date 2019/3/10 2:29 PM
 * @since V1.0
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ThreadLocalThreadExecutor());
        Thread t2 = new Thread(new ThreadLocalThreadExecutor());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
