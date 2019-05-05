package com.maptolist.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "raju");
		map.put(2, "siva");
		map.put(3, "yadav");
		
		List l= new ArrayList<>();
		//getting the key from map
		l=map.keySet().stream().collect(Collectors.toList());
		//gettin the value from the map
		//l=map.values().stream().collect(Collectors.toList());
		System.out.println(l);
	}

}
