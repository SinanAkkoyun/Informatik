import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Gebe eine Zahl ein.");
		int number = s.nextInt();
		
		System.out.println(fib(number));
	}
	
	public static int fib(int input) {
		if(input > 1) {
			return fib(input-1) + fib(input-2);
		} else if(input == 1) {
			return 1;
		} else {
			return 0;
		}
	}
}
//  n: 0 1 2 3 4 5 6
//fib: 0 1 1 2 3 5 8

// O(2^n)
