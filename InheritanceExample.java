package course;
import java.util.Scanner;

//Parent class
class Animal {
	String name;
	Animal(String n) {
		name = n;
	}
	void eat() {
		System.out.println(name + " is eating...");
	}
	void sleep() {
		System.out.println(name + " is sleeping...");
	}
}

//Child class
class Dog extends Animal {
	Dog(String n) {
		super(n);
	}
	void bark() {
		System.out.println(name + " is barking...");
	}
}

//Main class
public class InheritanceExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Dog's name: ");
		String dogName = sc.nextLine();
		Dog d = new Dog(dogName);
		d.eat();     
		d.sleep();   
		d.bark();    
		sc.close();
	}
}
