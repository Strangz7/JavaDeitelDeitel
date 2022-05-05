package javaAssignment;

import tddClass.Staff;

public class TeachingStaff extends Staff {

    private int salary;

    public int getSalary() {
        return salary;
    }

    public TeachingStaff(String name, String department, String duties, String phoneNumber, String homeAddress, String gMail, String uniform, int salary) {
        super(name, department, duties, phoneNumber, homeAddress, gMail, uniform);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
