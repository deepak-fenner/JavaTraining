package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Task{
	private String task;
	private boolean isTaskCompleted;
	
	Task(String task){
		this.task=task;
		this.isTaskCompleted=false;
	}
    
	public String getTask() {
		return task;
	}
	public boolean isTaskCompleted() {
		return isTaskCompleted;
	}
	public void markAsCompleted() {
		this.isTaskCompleted=true;
	}	
}

public class TaskManagementSystem {
	static Scanner sc=new Scanner(System.in);
	private static List<Task>tasks=new ArrayList<>();
	private static void addTask() {
		System.out.println("Enter the task:");
		String task1=sc.nextLine();
		tasks.add(new Task(task1));
	}
	private static void viewTask() {
		System.out.println("All the tasks are as follows");
		for(int i=0;i<tasks.size();i++) {
			if(tasks.get(i).isTaskCompleted()==false)
			{
			System.out.println("Task:"+(i+1)+"-->"+tasks.get(i).getTask()+"---> Not completed");
			}
			else {
			System.out.println("Task:"+(i+1)+"-->"+tasks.get(i).getTask()+"---> Completed");
			}
		}
	}
	private static void deleteTask() {
		viewTask();
		System.out.println("Enter the task number to remove task:");
		int num=sc.nextInt();
		tasks.remove(num-1);
		System.out.println("Task Deleted successfully..");
		}
    private static void markTaskAsCompleted() {
    	viewTask();
    	System.out.println("Enter the task number to mark task as Completed");
    	int num1=sc.nextInt();
    	tasks.get(num1-1).markAsCompleted();
    	System.out.println("Task Marked Succesfully");
    }
    private static void searchTask() {
    	System.out.println("Enter the task to be searched:");
    	String task2=sc.nextLine().toLowerCase();
    	for(int i=0;i<tasks.size();i++) {
    		if(tasks.get(i).getTask().toLowerCase().equals(task2)) {
    			System.out.println("Task exists...");
    		}
    		else {
    			System.out.println("Task Doesnot exist");
    		}
    	}
    }
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("Enter 1---->To add a new Task.");
			System.out.println("Enter 2---->To View all Tasks");
			System.out.println("Enter 3---->To Mark a task as completed.");
			System.out.println("Enter 4---->To Delete a task");
			System.out.println("Enter 5---->To Search for a particular task.");
			System.out.println("Enter 6---->To Exit");
			System.out.println("Enter a choice:");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				addTask();
				System.out.println("The task is added successfully");
				break;
			case 2:
				viewTask();
				break;
			case 3:
				markTaskAsCompleted();
				break;
			case 4:
				deleteTask();
				break;
			case 5:
				searchTask();
				break;
			case 6:
				System.out.println("Task Management Program Ended....");
				break;
			default:
				System.out.println("Enter a valid choice");
			}
			
		}while(choice!=6);
	}

}
