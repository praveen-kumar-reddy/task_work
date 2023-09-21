package taskpackage;

//Main.java
public class Main {
	public static void main(String[] args) {
		Employee manager = new Manager("putta praveen kumar reddy", 6000, 1000);
		Employee manager1 = new Manager("ganesh", 6000, 1000);
		Employee programmer = new Programmer("reddy rajesh", 5000, 20, 25.0);
		Employee programmer1 = new Programmer("reddy", 5000, 20, 25.0);
 
		manager.displayInfo();
		manager1.displayInfo();
		System.out.println("---------------------");
		programmer1.displayInfo();
		programmer.displayInfo();
	}
}
