package Seminar3.HomeWork3.Task1;

public class AccauntsDepartment {


    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25); //calculate in otherway
        return employee.getBaseSalary() - tax;
    }
    
}
