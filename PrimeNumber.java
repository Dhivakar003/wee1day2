package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {

		int a = 13;
		int b = 6;       //half of the input a
		boolean c = false;

		for (int i = 2; i < b; i++) {
			if (b % i == 0) {
				c=true;
				break;
			}
		}
		if (c == false) {
			System.out.println(a + "is not a prime number");

		} else {
			System.out.println(a + "is a prime number");
		}
	}

}
