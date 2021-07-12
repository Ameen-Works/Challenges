package revision.Lab1;

import java.util.Scanner;

public class MultiplyTwoNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int x=scan.nextInt();
		System.out.println("Enter the second value: ");
		int y= scan.nextInt();
		System.out.println("Multiplied value: "+(x*y));
		scan.close();
	}
}
