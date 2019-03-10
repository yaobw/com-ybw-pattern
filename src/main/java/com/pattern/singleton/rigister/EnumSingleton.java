package com.pattern.singleton.rigister;

/**
 * @author yaobw
 * @date 2019/3/10 12:51 PM
 * @since V1.0
 */
public enum EnumSingleton {

    /**
     * 最好的单例模式
     */
    SINGLETON;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return SINGLETON;
    }
}
