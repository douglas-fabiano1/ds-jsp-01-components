import entities.Employee;
import services.SalaryService;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        SalaryService salaryService = new SalaryService();

        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salario liquido = %.2f%n", netSalary);

        sc.close();

    }
}