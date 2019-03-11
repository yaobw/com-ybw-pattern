package com.pattern.prototype.simpleprototype;

import java.util.ArrayList;

/**
 * @author yaobw
 * @date 2019/3/11 9:32 AM
 * @since V1.0
 */
public class SimplePrototypeTest {

    public static void main(String[] args) {

        Agent agent = new Agent();
        agent.setName("秦仲海");
        agent.setPhone("13999998888");
        agent.setAge(30);
        agent.setCompany(new ArrayList());
        System.out.println(agent);

        Customer customer = new Customer(agent);

        Agent agentCopy = (Agent) customer.shallowClone(agent);
        System.out.println(agentCopy);

        //浅拷贝 虽然创建了两个对象 但是指向的值却是一个
        System.out.println(agent.getCompany() == agentCopy.getCompany());


    }
}
