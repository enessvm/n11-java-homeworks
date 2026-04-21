package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary < 1000) {
            return 0;
        }
        return salary * 0.03;
    }

    double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int yearsWorked = 2021 - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxAndBonus + raise;

        return "Name : " + name +
                "\nSalary : " + salary +
                "\nWork Hours : " + workHours +
                "\nHire Year : " + hireYear +
                "\nTax : " + tax +
                "\nBonus : " + bonus +
                "\nSalary Raise : " + raise +
                "\nSalary with Tax and Bonus : " + salaryWithTaxAndBonus +
                "\nTotal Salary : " + totalSalary;
    }
}

