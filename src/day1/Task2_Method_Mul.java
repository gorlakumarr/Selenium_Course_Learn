package day1;

import java.util.Scanner;

public class Task2_Method_Mul {

	public double MulOfTwoNum() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the values of a");
		int a = sc.nextInt();

		System.out.println("Enter the vaues of b");
		double b = sc.nextDouble();

//		int a=10;
//		double b=2.5;
// Scanner a = new Scanner(source)
		// int a=10;
//		int b=20;
		double mul = a * b;
		System.out.println("Multiplication of Two a and b is =" + mul);
		return mul;

	}

}
