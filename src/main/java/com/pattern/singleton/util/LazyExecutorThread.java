package com.pattern.singleton.util;

import com.pattern.singleton.lazy.LazySingleton;

/**
 * @author yaobw
 * @date 2019/3/10 1:26 PM
 * @since V1.0
 */
public class LazyExecutorThread implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":"+ singleton);
    }
}
