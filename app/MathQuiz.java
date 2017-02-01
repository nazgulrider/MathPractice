package math.practice.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MathQuiz {
	
	
	public static void main(String[] args) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
		RandomNumberGenerator rng = new RandomNumberGenerator();

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String name=input.next();
		rng.enterMax();

		System.out.println("Please enter 1 to practice Addition");
		System.out.println("Please enter 2 to practice Subtraction");
		System.out.println("Please enter 3 to practice Multiplication");
		System.out.println("Please enter 4 to practice Division");

		if (input.hasNextInt()) {
			int in = input.nextInt();
			if (in > 0 && in < 5) {
				switch (in) {
				case 1:
					rng.addition();
					System.out.println("Hi "+name);
					rng.getScore();
					System.out.println("Completed on: "+timeStamp);
					break;
				case 2:
					rng.subtraction();
					System.out.println("Hi "+name);
					rng.getScore();
					System.out.println("Completed on: "+timeStamp);
					break;
				case 3:
					rng.multiplication();
					System.out.println("Hi "+name);
					rng.getScore();
					System.out.println("Completed on: "+timeStamp);
					break;
				case 4:
					rng.division();
					System.out.println("Hi "+name);
					rng.getScore();
					System.out.println("Completed on: "+timeStamp);
					break;
				}
			} else {
				System.out.println("Error: Invalid Selection");
			}

		} else if (input.hasNext()) {
			String storeString = input.next();
			System.out.println("Please input valid Number");
		}
	}
	

}
