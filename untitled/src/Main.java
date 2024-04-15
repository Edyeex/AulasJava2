public class Main {
  public static void main(String[] args) {
    Clients C001 = new Clients();
    C001.firstName = "Éder";
    C001.age = 25;

    Clients C002 = new Clients();
    C002.firstName = "Ana";
    C002.age = 20;

    Car car = new Car("Chevrolet", "Onix", 2024);
    car.setModelo("Silverado");

    System.out.println("Name: " + C001.firstName + " | " + "Age: " + C001.age);
    System.out.println(" ");
    C002.newAccount();
    System.out.println(" ");
    System.out.println("Name: " + C002.firstName + " | " + "Age: " + C002.age);
    System.out.println(" ");
    System.out.println(car.getMarca());
    System.out.println(car.getModelo());
    System.out.println(car.getAno());


  }
}