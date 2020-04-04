package DISM;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base salary of full time: ");
        SalaryPolicy p1 = new EmployeeFullTime(scanner.nextFloat());

        System.out.println("Enter base salary of part time: ");
        SalaryPolicy p2 = new EmployeePartime(scanner.nextFloat());
        System.out.println("Salary of EmployeePartTime: " + p2.getSalary());
        System.out.println("Salary of EmployeeFullTime: " + p1.getSalary());
    }
}
