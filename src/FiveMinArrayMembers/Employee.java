package FiveMinArrayMembers;

public class Employee {
    String name;
    double salary;
    double pct;

    public static void main(String[] args) {
        Calculator.calcBonus(new Employee());
    }
}

class Calculator {
    public static double calcBonus(Employee employee) {
        return employee.salary * employee.pct;
    }
}
