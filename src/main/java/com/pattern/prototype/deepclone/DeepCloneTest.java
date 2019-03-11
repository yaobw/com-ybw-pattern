package com.pattern.prototype.deepclone;

/**
 * @author yaobw
 * @date 2019/3/11 10:37 AM
 * @since V1.0
 */
public class DeepCloneTest {

    public static void main(String[] args) throws Exception{



        BronzeKeys key = new BronzeKeys(new LockColor());

        BronzeKeys keyCopy = (BronzeKeys) key.clone();

        LockColor color = new LockColor();

        color.setColor("蓝色");
        keyCopy.lockColor = color;

        BronzeKeys shallowClone = key.shallowClone(key);

        System.out.println(keyCopy.lockColor);

        System.out.println(shallowClone.lockColor);

        System.out.println(key.lockColor == keyCopy.lockColor);

        System.out.println(key.lockColor == shallowClone.lockColor);



    }
}
