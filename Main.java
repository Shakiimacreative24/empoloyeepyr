public class Main {

    public static void main(String[] args) {

    FullTimeEmployee f = new FullTimeEmployee(1, 1000);
    PartTimeEmployee p = new PartTimeEmployee(2, 500);
 
        System.out.println("Full-Time Employee:");
        System.out.println("Salary: " + f.calculateSalary());
        System.out.println("Tax: " + f.calculateTax());
        System.out.println("Bonus: " + f.calculateBonus());

        System.out.println("\nPart-Time Employee:");
        System.out.println("Salary: " + p.calculateSalary());
        System.out.println("Tax: " + p.calculateTax());
}}

