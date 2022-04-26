package com.Stackimplementation;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueue {
	Queue <Integer>queue; //reference objects
	Queue <Integer>tempQueue;
	
	public StackUsingQueue() {
		queue = new LinkedList<Integer>();
		tempQueue = new LinkedList<Integer>();
		
	}
	public void push(int data) {
		/* if no element is present in queue then
		 * enqueue the new element into queue */
		if(queue.size() == 0)
			queue.add(data);
		else {
			/*If elements are present in queue then
			 * dequeue all the elements to temporary Queue tempQueue */
			int size = queue.size();
			
			for(int i = 0; i<size;i++)
				tempQueue.add(queue.remove());
			//Enequeue the new element into queue
			queue.add(data);
			
			//dequeue all the elements from temporary queue to queue
			
			for(int i =0; i< size; i++)
				queue.add(tempQueue.remove());
		
	}
}
	public int pop() {
		if(queue.size() == 0)
			throw new NoSuchElementException("Underflow Exception");
		return queue.remove();
	}
	
	public boolean isEmpty() {
		return queue.size() == 0;
	}
	
	public int getSize() {
		return queue.size();
	}
	
	public void display() {
		if (queue.isEmpty())
			System.out.println("Empty");
		else {
			for(Integer val: queue) 
				System.out.println(val);
		}
	}
	
}
