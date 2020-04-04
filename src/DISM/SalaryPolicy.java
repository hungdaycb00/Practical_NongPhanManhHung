package DISM;

abstract public class SalaryPolicy {
    public float baseSalary;

    public SalaryPolicy(float baseSalary){
        this.baseSalary = baseSalary;
    }
    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract public float getSalary();
}
