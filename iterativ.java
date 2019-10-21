import java.util.Scanner;

public class recursive {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Gebe eine Zahl ein.");
		int number = s.nextInt();
		
		for(int i = number; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
