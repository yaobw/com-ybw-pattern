package com.pattern.singleton.verifycoding;

import com.pattern.singleton.util.LazyExecutorThread;

/**
 * @author yaobw
 * @date 2019/3/10 1:54 PM
 * @since V1.0
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new LazyExecutorThread());
        Thread thread2 = new Thread(new LazyExecutorThread());

        thread1.start();

        thread2.start();
    }
}
