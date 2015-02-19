package pkg.nward.quiz4;

import java.util.Scanner;

public class Program {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat();
		Dog d = new Dog();
		
		int input;
		
		System.out.println("1: Cat");
		System.out.println("2: Dog");
		System.out.println("3: Exit");
		
		input = scan.nextInt();
		
		if(input == 1){
		System.out.println(c.makeSound());
		}
		else if(input == 2){
		System.out.println(d.makeSound());
		}
		else{
			System.exit(0);
			
		}
		
	}

}
