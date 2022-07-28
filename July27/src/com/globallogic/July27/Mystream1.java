package com.globallogic.July27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mystream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(23);//
		ls.add(-24);
		ls.add(1);
		ls.add(1234);
		// filter based on conditions.
		List<Integer> positive = ls.stream().filter(e -> e > 0).collect(Collectors.toList());
		System.out.println(positive);
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
		List<String> man = names.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());// filering
																										// in
																										// string
		System.out.println(man);
		// map use to manupulate the data
		// List<Integer> square =
		ls.stream().filter(e -> e > 0).map(e -> e * 2).sorted().distinct().forEach(System.out::println);
		//

	}

}
