package com.pattern.singleton.verifycoding;

import com.pattern.singleton.rigister.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author yaobw
 * @date 2019/3/10 1:58 PM
 * @since V1.0
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        streamVerify();

//        paramVerify();
    }

    /**
     * 实际上创建了两个实例，但是后者会覆盖第一个创建的实例对象作为返回结果，JVM会将第一个实例回收
     */
    private static void streamVerify() {
        try {
            EnumSingleton instance1 = null;

            EnumSingleton instance2 = EnumSingleton.getInstance();
            instance2.setData(new Object());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData() == instance2.getData());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * enum编译后文件不再是一个枚举类，里面的方法带有参数
     */
    private static void paramVerify() {
        Class clazz = EnumSingleton.class;

        try {
            Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) constructor.newInstance("ybw", 88);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
