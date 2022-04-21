package week1.day2ass1;

public class MyCalculator {

	public static void main(String[] args) {

		// calling methods

		Calculator obj = new Calculator();
		int sum = obj.add(5, 2, 3);
		System.out.println(sum);

		int sub = obj.sub(5, 3);
		System.out.println(sub);

		double mult = obj.mult(22.45, 12.23);
		System.out.println(mult);

		float div = obj.div(4.23f, 2.15f);
		System.out.println(div);

	}

}
