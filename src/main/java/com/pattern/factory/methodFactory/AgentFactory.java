package com.pattern.factory.methodFactory;

import com.pattern.factory.model.Agent;
import com.pattern.factory.simpleFactory.Person;

/**
 * @author yaobw
 * @date 2019/3/7 4:34 PM
 * @since V1.0
 */
public class AgentFactory implements MethodPersonFactory {

    public void setUpPassword(String pwd) {
        System.out.println("密码设置为："+pwd);
    }

    public Person createAccount() {
        return new Agent();
    }


}
