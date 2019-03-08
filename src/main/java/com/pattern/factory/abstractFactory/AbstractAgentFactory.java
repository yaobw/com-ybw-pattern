package com.pattern.factory.abstractFactory;

import com.pattern.factory.methodFactory.MethodPersonFactory;
import com.pattern.factory.simpleFactory.Person;

/**
 * @author yaobw
 * @date 2019/3/7 4:53 PM
 * @since V1.0
 */
public class AbstractAgentFactory extends AbstractPersonFactory implements MethodPersonFactory {

    @Override
    public Person register(String name, String phone) {
        return null;
    }

    @Override
    public String setUpPassword(String pwd) {
        return null;
    }

    public Person createAccount() {

        return null;
    }

    @Override
    public String attendance() {
        System.out.println("代理人签到成功");
        return null;
    }
}
