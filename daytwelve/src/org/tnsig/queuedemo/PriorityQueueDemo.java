package org.tnsig.queuedemo;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		//add and offer method is used to insert an element
		obj.offer(13);
		obj.add(55);
		obj.offer(91);
		obj.add(15);
		System.out.println("Queue elements are:" +obj);
		/*obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();*/
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		obj.poll();
		
		System.out.println("Queue elements are:" +obj);
		System.out.println("Head element is: "+obj.peek());
	}

}
