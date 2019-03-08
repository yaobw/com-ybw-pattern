package com.pattern.factory.verifycoding;

import com.pattern.factory.methodfactory.AgentFactory;
import com.pattern.factory.methodfactory.MethodPersonFactory;
import com.pattern.factory.simplefactory.Person;

/**
 * @author yaobw
 * @date 2019/3/7 4:41 PM
 * @since V1.0
 */
public class MethodFactoryVerify {

    public static void main(String[] args) {
        MethodPersonFactory factoryAgent = new AgentFactory();
        Person agent = factoryAgent.createAccount();
        agent.register("" ,"秦仲海");

        MethodPersonFactory factoryCustomer = new AgentFactory();
        Person customer = factoryCustomer.createAccount();
        customer.register("" ,"范路遥");
    }
}
