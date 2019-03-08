package com.pattern.factory.verifyCoding;

import com.pattern.factory.model.Agent;
import com.pattern.factory.model.Customer;
import com.pattern.factory.simpleFactory.Person;

/**
 * @author yaobw
 * @date 2019/3/7 4:28 PM
 * @since V1.0
 */
public class SimpleFactoryVerify {

    public static void main(String[] args) {
        Person agent = new Agent();
        agent.register("", "秦仲海");

        Person customer = new Customer();
        customer.register("", "范路遥");
    }
}
