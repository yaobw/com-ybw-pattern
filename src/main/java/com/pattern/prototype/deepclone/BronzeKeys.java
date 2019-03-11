package com.pattern.prototype.deepclone;

import java.io.*;
import java.util.Date;

/**
 * @author yaobw
 * @date 2019/3/11 10:31 AM
 * @since V1.0
 */
public class BronzeKeys extends BronzeLock implements Cloneable, Serializable {

    public LockColor lockColor;

    public BronzeKeys(LockColor color){
        this.lockColor = color;
        this.date = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            BronzeLock copy = (BronzeLock)ois.readObject();
            copy.date = new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public BronzeKeys shallowClone(BronzeKeys target){
        BronzeKeys keys = new BronzeKeys(target.lockColor);
        keys.lock_id = target.lock_id;
        keys.lock_shape = target.lock_shape;
        keys.date = new Date();
        keys.lockColor = target.lockColor;
        return  keys;
    }


}
