import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int N = num.nextInt();

	if (N % 2 == 1)
	  System.out.println("Impar");
	else {
	  if (N >= 2 && N <= 5)
		System.out.println("A");
	  else if (N >= 6 && N <= 20)
		System.out.println("B");
	  else
		System.out.println("C");
		


	}
  }
}