package taskpackage;

//Main.java
public class Main {
public static void main(String[] args) {
  Employee manager = new Manager("putta praveen kumar reddy", 6000, 1000);
  Employee programmer = new Programmer("reddy rajesh", 5000, 20, 25.0);

  manager.displayInfo();
  System.out.println("---------------------");
  programmer.displayInfo();
}
}

