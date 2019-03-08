package com.pattern.factory.methodfactory;

import com.pattern.factory.model.Customer;

/**
 * @author yaobw
 * @date 2019/3/7 4:35 PM
 * @since V1.0
 */
public class CustomerFactory implements MethodPersonFactory ,MethodCusromerFactory{


    public void setUpPassword(String pwd) {
        System.out.println("密码设置为："+pwd);
    }

    public Customer createAccount() {
        System.out.println("创建账号成功");
        return new Customer();
    }

    public void buyGoods(String goodsName) {

    }
}
