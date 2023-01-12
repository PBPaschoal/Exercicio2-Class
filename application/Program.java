/* Rio de Janeiro, Dia 11/01/2023
Exercício 2

Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
Em seguida, mostrar os dados do funcionário (nome e salário líquido).
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
Use a classe projetada abaixo.

Employee

- Name: string
- GrossSalary: double
- Tax: double
+ netSalary(): double
+ IncreaseSalary(percentage: double): void

Exemplo:

Name: Brenda Silva
Gross salary: 6000.00
Tax: 1000.00

Employee: Brenda Silva, $ 5000.00

Which percentage to increase salary? 10.0

Updated data: Brenda Silva, $ 5600.00 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = teclado.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = teclado.nextDouble();
		System.out.print("Tax: ");
		emp.tax = teclado.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = teclado.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		teclado.close();
	}

}
