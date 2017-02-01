package math.practice.app;

import java.util.*;

public class RandomNumberGenerator {
	int answer;
	int counter = 0;
	Random random = new Random();
	Scanner input = new Scanner(System.in);
	List<Integer> numberList1 = new ArrayList<Integer>();
	List<Integer> numberList2 = new ArrayList<Integer>();

	public void enterMax() {
		System.out.println("Please input the maximum Number");
		int in = input.nextInt();
		for (int i = 0; i < 10; i++) {
			int x = random.nextInt(in) + 1;
			numberList1.add(x);
			int y = random.nextInt(in) + 1;
			numberList2.add(y);
		}
		//System.out.println("Here is your 10 random numbers\n" + numberList1 + "\n" + numberList2);
	}

	public void addition() {
		Iterator<Integer> i = numberList1.iterator();
		Iterator<Integer> i1 = numberList2.iterator();

		for (int x = 0; x < 10; x++) {
			int iVariable = i.next();
			int i1Variable = i1.next();
			System.out.println("");
			System.out.println("please add " + iVariable + "+" + i1Variable);
			System.out.println("Please Enter your Answer");
			answer = input.nextInt();
			if (answer == (iVariable + i1Variable)) {
				System.out.println("Answer is Correct");
				counter++;
			}
			if (answer != (iVariable + i1Variable)) {
				System.out.println("Answer is Not Correct");
			}
		}

	}

	public void subtraction() {
		Iterator<Integer> i = numberList1.iterator();
		Iterator<Integer> i1 = numberList2.iterator();

		for (int x = 0; x < 10; x++) {
			int iVariable = i.next();
			int i1Variable = i1.next();
			System.out.println("");
			System.out.println("please subtract " + iVariable + "-" + i1Variable);
			System.out.println("Please Enter your Answer");
			answer = input.nextInt();
			if (answer == (iVariable - i1Variable)) {
				System.out.println("Answer is Correct");
				counter++;
			}
			if (answer != (iVariable - i1Variable)) {
				System.out.println("Answer is Not Correct");
			}
		}

	}

	public void multiplication() {
		Iterator<Integer> i = numberList1.iterator();
		Iterator<Integer> i1 = numberList2.iterator();

		for (int x = 0; x < 10; x++) {
			int iVariable = i.next();
			int i1Variable = i1.next();
			System.out.println("");
			System.out.println("Please Multiply " + iVariable + "X" + i1Variable);
			System.out.println("Please Enter your Answer");
			answer = input.nextInt();
			if (answer == (iVariable * i1Variable)) {
				System.out.println("Answer is Correct");
				counter++;
			}
			if (answer != (iVariable * i1Variable)) {
				System.out.println("Answer is Not Correct");
			}
		}

	}

	public void division() {
		Iterator<Integer> i = numberList1.iterator();
		Iterator<Integer> i1 = numberList2.iterator();

		for (int x = 0; x < 10; x++) {
			int iVariable = i.next();
			int i1Variable = i1.next();
			System.out.println("");
			System.out.println("Please Divide " + iVariable + "/" + i1Variable);
			System.out.println("Please Enter your Answer");
			answer = input.nextInt();
			if (answer == (iVariable / i1Variable)) {
				System.out.println("Answer is Correct");
				counter++;
			}
			if (answer != (iVariable / i1Variable)) {
				System.out.println("Answer is Not Correct");
			}
		}

	}

	public void getScore() {
		System.out.println("Your score is " + counter * 10 + "%");
	}

	
}
