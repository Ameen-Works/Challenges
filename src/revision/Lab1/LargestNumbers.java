package revision.Lab1;

public class LargestNumbers {
	public static void main(String[] args) {
		double n1 = -5.5, n2 = 33.6, n3 = 33;
		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the greatest");
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the greatest");
		else
			System.out.println(n3 + " is the greatest");
	}

}
