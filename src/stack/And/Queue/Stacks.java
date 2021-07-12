package stack.And.Queue;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> nums=new Stack<>();
		nums.push(15);
		nums.push(20);
		nums.push(15);
		nums.push(20);
		nums.push(15);
		nums.push(20);
		System.out.println(nums);
		System.out.println(nums.peek());
		nums.pop();
		System.out.println(nums);
		System.out.println(nums.peek());
		nums.pop();
		System.out.println(nums);
		System.out.println(nums.peek());
		nums.pop();
		System.out.println(nums);
		System.out.println(nums.peek());
		nums.pop();
		System.out.println(nums);
		
	}

}
