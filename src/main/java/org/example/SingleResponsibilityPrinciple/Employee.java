package org.example.SingleResponsibilityPrinciple;

import java.util.Date;

/**
 * Класс информации о работнике
 */
public class Employee {
    private String name;
    private Date dob;

    /**
     * Конструктор класса информации о работнике
     * @param name имя
     * @param dob дата рождения
     */
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}
