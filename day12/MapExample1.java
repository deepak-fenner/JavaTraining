package com.celcom.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
	    Map<String,Integer>mapcopy=new HashMap<>();
		map.put("Apple", 1);
		map.put("Watermelon", 4);
		map.put("Guava",5);
		map.put("Pineapple", 1);
		//to print the keys and values
		for(Map.Entry<String,Integer>it:map.entrySet()) {
			System.out.println(it.getKey()+" "+it.getValue());
		}
		//to check whether a key is present
		System.out.println(map.containsKey("Apple"));
		
		//to check whether a value is present
		System.out.println(map.containsValue(1));
		
		//To remove a key value pair
		//map.remove("Apple");
		//System.out.println(map);
		
		//to clear the map
       	//map.clear();
		
		//to get the value
		System.out.println(map.get("Pineapple"));
		
		//return all keys
		Set<String> keys=map.keySet();
		for(String i:keys) {
			System.out.println(i);
		}
		//to copy the contents of one map to other map
		mapcopy.putAll(map);
		for(Map.Entry<String,Integer>it:mapcopy.entrySet()) {
			System.out.println(it.getKey()+" "+it.getValue());
		}
		
		//adds the key if it is not present
		map.putIfAbsent("Orange", 6);
		
		//updates the value for a particular key
		map.merge("Orange", 8, (oldvalue,newvalue)->newvalue);
		System.out.println(map);
		
		//to check whether the values are equal
		if(map.get("Apple").equals(map.get("Pineapple"))) {
			System.out.println("equal");
		}
		
		//to print all the values
		System.out.println(map.values());
		
		//to check whether the map is empty
		System.out.println(map.isEmpty());
		
		//to update a value
		System.out.println(map.getOrDefault("Apple",0)+1);
	}

}
