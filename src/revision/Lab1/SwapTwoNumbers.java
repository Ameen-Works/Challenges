package revision.Lab1;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float first=5.5f,second=3.5f;
		System.out.println("----Before Swapping----");
		System.out.println("The first number is: "+first);
		System.out.println("The second number is: "+second);
		double temp=first;
		first=second;
		second=(float) temp;
		System.out.println("----After Swapping----");
		System.out.println("The first number is: "+first);
		System.out.println("The second number is: "+second);
	}

}
