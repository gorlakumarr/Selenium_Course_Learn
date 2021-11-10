package day1;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 100; i++) {

			if (i % 2 == 1 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0 && i % 8 != 0) {
				System.out.println("Prime no from 1 to 100  is " + i);
			}
		}
	}
}
