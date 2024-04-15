public class Clients {
  String firstName;
  int age;

  int Balance;
  Clients() {
	Balance = 10;

  }
  void newAccount() {
	System.out.println(firstName + " Account created!");
	System.out.println("The new balance is $" + Balance);
  }
}
