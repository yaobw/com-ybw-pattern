package com.pattern.factory.verifycoding;

import com.pattern.factory.abstractfactory.AbstractCustomerFactory;
import com.pattern.factory.abstractfactory.AbstractPersonFactory;

/**
 * @author yaobw
 * @date 2019/3/7 5:04 PM
 * @since V1.0
 */
public class AbstractFactoryVerify {

    public static void main(String[] args) {
        AbstractPersonFactory abFactory = new AbstractCustomerFactory();

        abFactory.register("", "范路遥");
    }
}
