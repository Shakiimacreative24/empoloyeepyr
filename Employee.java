abstract class Employee {
    int employeeId;
    double salary;

    public Employee() {
    }


    public Employee(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;

    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract  double calculateSalary();
}
