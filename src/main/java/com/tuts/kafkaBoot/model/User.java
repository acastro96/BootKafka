package com.tuts.kafkaBoot.model;

public class User {

    private String username;
    private String dept;
    private Long salary;

    public User(String username, String dept, Long salary) {
        this.username = username;
        this.dept = dept;
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
