package com.pattern.factory.abstractfactory;

import com.pattern.factory.simplefactory.Person;

/**
 * @author yaobw
 * @date 2019/3/7 4:49 PM
 * @since V1.0
 */
public abstract class AbstractPersonFactory {

    abstract public Person register(String name, String phone);

    abstract public String setUpPassword(String pwd);

    abstract public String attendance();
}
