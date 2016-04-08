package com.icehousecorp.gof.proxypatern.protection;

/**
 * Created by mexanjuadha on 3/24/16.
 */
public class EmployeeImpl implements Employee {

    private String name;

    private int grade;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
