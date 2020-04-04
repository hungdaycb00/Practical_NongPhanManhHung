package DISM;

import java.util.Scanner;

public class EmployeeFullTime extends SalaryPolicy {
    public float rate;

    public EmployeeFullTime(float baseSalary){
        super(baseSalary);
        this.rate = 4.0f;
    }
    @Override
    public float getSalary() {
        return rate * super.getBaseSalary();
    }
}
