package stack.And.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Doctor Appointment Queue: ");
		Queue<String> queue=new ArrayBlockingQueue<String>(5);
		queue.add("mohamed");
		queue.add("arshath");
		queue.add("ameen");
		queue.add("shameer");
		queue.add("irfan");
		//queue.add("bbb");
		System.out.println(queue);
		System.out.println("the 1st member is "+queue.element()+" and the list is not empty");
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll()+" went for consulting");
		queue.add("don");
		queue.offer("samosa");
		System.out.println(queue);
		queue.remove();
		System.out.println("Total Patient is "+queue.size());
	}

}
