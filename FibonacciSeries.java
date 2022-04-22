package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int n = 8,f=0,s=1,sum;
		
		System.out.println(f);

		for (int i = 1; i < n; i++) {

			sum = f + s;
			f = s;
			s = sum;

			System.out.println(f);

		}
	}
}
