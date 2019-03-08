package com.pattern.factory.abstractFactory;

import com.pattern.factory.methodFactory.CustomerFactory;
import com.pattern.factory.methodFactory.MethodPersonFactory;
import com.pattern.factory.simpleFactory.Person;

/**
 * @author yaobw
 * @date 2019/3/7 4:53 PM
 * @since V1.0
 */
public class AbstractCustomerFactory extends AbstractPersonFactory implements MethodPersonFactory {

    @Override
    public Person register(String phone, String name) {
        MethodPersonFactory factory = new CustomerFactory();
        Person person = factory.createAccount();
        person.register(phone , name);
        return person;
    }

    @Override
    public String setUpPassword(String pwd) {
        return pwd;
    }

    @Override
    public String attendance() {
        System.out.println("会员签到成功");
        return null;
    }

    public Person createAccount() {
        return null;
    }
}
