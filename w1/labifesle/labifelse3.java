package labifesle;

import java.util.Scanner;

public class labifelse3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter advance amount: ");
        double advanceAmount = scanner.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = scanner.nextDouble();

        // Calculate gross salary
        double grossSalary = basicSalary + allowance;

        // Calculate insurance
        double insurance = 0.05 * grossSalary;

        // Calculate taxable salary
        double taxableSalary = grossSalary - advanceAmount - insurance;

        // Calculate tax
        double taxAmount = 0;
        if (taxableSalary > 5000) {
            double taxBase = taxableSalary - 5000;
            taxAmount = 0.1 * taxBase;
        }

        // Calculate net salary
        double netSalary = grossSalary - advanceAmount - insurance - taxAmount;

        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Insurance: " + insurance);
        System.out.println("Taxable Salary: " + taxableSalary);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}
