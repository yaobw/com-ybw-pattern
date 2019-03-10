package com.pattern.singleton.verifycoding;

import com.pattern.singleton.rigister.ContainerSingleton;
import com.pattern.singleton.util.ConcurrentExecutor;

/**
 * @author yaobw
 * @date 2019/3/10 2:15 PM
 * @since V1.0
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {

        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("com.pattern.singleton.util.Person");;
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10,6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
