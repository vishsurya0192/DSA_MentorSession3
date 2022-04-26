package com.Stackimplementation;

import java.util.Scanner;

public class StackImplementationUsingTwoQueues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StackUsingQueue stackUsingQueue = new StackUsingQueue();
		System.out.println("Stack using two queues \n ");
		char ch;
		do {
			System.out.println("Stack Operations");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. check empty");
			System.out.println("4. size");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter integer element to push");
				stackUsingQueue.push(scanner.nextInt());
				break;
			case 2:
				try {
				System.out.println("Popped Element = "+stackUsingQueue.pop());
			}catch(Exception e) {
				System.out.println("Error : "+ e.getMessage());
			}
				break;
			case 3:
				System.out.println("Empty Status = "+stackUsingQueue.isEmpty());
				break;
			case 4:
				System.out.println("Size = "+stackUsingQueue.getSize());
				break;
			default:
				System.out.println("Enter a valid option \n");
				break;
		}
			stackUsingQueue.display();
			System.out.println("Do you want to continue (Type y or n \n");
			ch = scanner.next().charAt(0);	

	}while(ch == 'Y' || ch == 'y');
		scanner.close();	

}
	
}
