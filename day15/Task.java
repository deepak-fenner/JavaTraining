package com.celcom.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,Integer>map=new LinkedHashMap<>();
		System.out.println("Enter the number of tasks to be done:");
		int noOfTasks=sc.nextInt();
		for(int i=0;i<noOfTasks;i++) {
			System.out.println("Enter "+" Task "+i+":");
			String task=sc.next();
			map.put(task,map.getOrDefault(task, 0)+1);
		}
		List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
			@Override
			public int compare(Map.Entry<String,Integer> obj1,Map.Entry<String,Integer> obj2)
			{
				return Integer.compare(obj2.getValue(), obj1.getValue());
			}
		});
		System.out.println("The most frequently executed task is:");
		System.out.println(list.get(0).getKey());
	}

}
