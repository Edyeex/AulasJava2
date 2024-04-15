import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	System.out.println("Digite o numero1 op numero2: ex (2 * 4) => ");

	Scanner s = new Scanner(System.in);
	double num1 = s.nextDouble();
	char op = s.next().charAt(0);
	double num2 = s.nextDouble();

	if (op == '+')
	  System.out.println((int) num1 + num2);
	else if (op == '-')
	  System.out.println((int) num1 - num2);
	else if (op == '*')
	  System.out.println((int) num1 * num2);
	else if(op == '/')
	  System.out.println((int) num1 / num2);
	else
	  System.out.println("Dados incorretos");



  }
}