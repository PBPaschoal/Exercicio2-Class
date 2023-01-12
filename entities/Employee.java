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

package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
