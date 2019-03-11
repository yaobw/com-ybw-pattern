package com.pattern.prototype.simpleprototype;

import java.util.List;

/**
 * @author yaobw
 * @date 2019/3/11 9:27 AM
 * @since V1.0
 */
public class Agent implements Prototype {

    private String name;

    private String phone;

    private int age;

    private List company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getCompany() {
        return company;
    }

    public void setCompany(List company) {
        this.company = company;
    }

    @Override
    public Prototype clone() {
        Agent agent = new Agent();
        agent.setName(this.name);
        agent.setPhone(this.phone);
        agent.setAge(this.age);
        agent.setCompany(this.company);
        return agent;
    }
}
