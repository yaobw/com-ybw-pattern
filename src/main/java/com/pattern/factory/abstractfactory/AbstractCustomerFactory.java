package com.pattern.factory.abstractfactory;

import com.pattern.factory.methodfactory.CustomerFactory;
import com.pattern.factory.methodfactory.MethodCusromerFactory;
import com.pattern.factory.methodfactory.MethodPersonFactory;
import com.pattern.factory.simplefactory.Person;

/**
 * @author yaobw
 * @date 2019/3/7 4:53 PM
 * @since V1.0
 */
public class AbstractCustomerFactory extends AbstractPersonFactory implements MethodPersonFactory, MethodCusromerFactory {

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

    /**
     * 接口实现
     * @return
     */
    public Person createAccount() {
        return null;
    }

    public void buyGoods(String goodsName) {

    }
}
