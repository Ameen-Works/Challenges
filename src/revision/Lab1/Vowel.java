package revision.Lab1;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the letter: ");
		String ch=scan.next();
		scan.close();
		if(ch=="a"||ch=="e"||ch=="i"||ch=="o"||ch=="u")
			System.out.println("The given letter "+ch+" is a vowel");
		else
			System.out.println("The given letter "+ch+" is a Consonent");
			
		
	}

}
