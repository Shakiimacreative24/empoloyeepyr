public class PartTimeEmployee extends Employee implements Taxable{


PartTimeEmployee(int id, double salary) {
    super(id, salary);
}

public double calculateSalary() {
    return salary;
}

public double calculateTax() {
    return salary * 0.05; // 5% tax
}
}