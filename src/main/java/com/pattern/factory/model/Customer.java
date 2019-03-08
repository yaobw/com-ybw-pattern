package com.pattern.factory.model;

import com.pattern.factory.simpleFactory.Person;

/**
 * @author yaobw
 * @date 2019/3/7 4:26 PM
 * @since V1.0
 */
public class Customer implements Person {

    public void register(String phone, String name) {
        System.out.println("恭喜"+name +", 你已成功注册APP会员");
    }
}
