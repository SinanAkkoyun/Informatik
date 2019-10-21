import java.util.Scanner;

public class recursive {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Gebe eine Zahl ein.");
		int number = s.nextInt();
		
		System.out.println(Minus1(number));
	}
	
	public static int Minus1(int input) {
		int out = 0;
		if(input > 0) {
			out = input - 1;
			return Minus1(out);
		} else {
			return out;
		}
	}
}
