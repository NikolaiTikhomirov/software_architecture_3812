package Seminar3.HomeWork3.Task1;

import java.util.Date;

// Переписать код в соответствии с Single Responsibility Principle:

public class Employee {
private String name;
private Date dob;
private int baseSalary;
public Employee(String name, Date dob, int baseSalary) {
    this.name = name;
    this.dob = dob;
    this.baseSalary = baseSalary;
    }
    
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    
}

// Подсказка: вынесите метод calculateNetSalary() в отдельный класс