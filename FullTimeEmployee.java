public class FullTimeEmployee extends  Employee implements Taxable, BonusEligible {
    FullTimeEmployee(int id, double salary)
    {super(id, salary);
    }
    public double calculateSalary() {
        return salary + calculateBonus();
    }

    public double calculateTax() {return  salary * 0.10; // 10% tax

    }

    public double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }

}