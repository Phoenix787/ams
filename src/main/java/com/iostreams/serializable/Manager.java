package com.iostreams.serializable;

import com.iostreams.serializable.Employee;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ксения on 06.03.2016.
 */
public class Manager extends Employee implements Serializable {
    private static final long serialVersionUID = -3052839511037112430L;
    private Employee secretary;

    public Manager(String name, int age, double salary, Date hireDate) {
        super(name, age, salary, hireDate);
    }

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }
}
