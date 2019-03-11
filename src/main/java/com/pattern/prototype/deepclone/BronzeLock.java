package com.pattern.prototype.deepclone;

import java.util.Date;

/**
 * @author yaobw
 * @date 2019/3/11 10:30 AM
 * @since V1.0
 */
public class BronzeLock {

    public String lock_id = "000001";

    public String lock_shape = "方形";

    public Date date;


    public void setLock_shape(String lock_shape) {
        this.lock_shape = lock_shape;
    }

    public String getLock_id() {
        return lock_id;
    }

    public String getLock_shape() {
        return lock_shape;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
