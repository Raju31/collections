package com.maptolist.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapTest {
	public static void main(String[] args) {
		List<User> l= new ArrayList<>();
		l.add(new User(1,"siva"));
		l.add(new User(2, "raju"));
		l.add(new User(3, "yadav"));
		
		Map map = l.stream().collect(Collectors.toMap(User::getId, User::getName));
		System.out.println(map);
	}

}
