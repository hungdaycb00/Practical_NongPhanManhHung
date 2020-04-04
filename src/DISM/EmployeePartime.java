package DISM;

public class EmployeePartime extends SalaryPolicy {
    public float rate;

    public EmployeePartime(float baseSalary){
        super(baseSalary);
        this.rate = 2.5f;
    }

    @Override
    public float getSalary() {
        return super.getBaseSalary()*rate;
    }
}
