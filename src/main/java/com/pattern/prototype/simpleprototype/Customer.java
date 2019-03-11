package com.pattern.prototype.simpleprototype;

/**
 * @author yaobw
 * @date 2019/3/11 9:29 AM
 * @since V1.0
 */
public class Customer {

    private Prototype prototype;

    public Customer(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype shallowClone(Prototype pro){
        return (Prototype)pro.clone();
    }

}
