package com.globallogic.July28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		al.add(20);

		int index = Collections.binarySearch(al, 10);
		System.out.println(index);

		index = Collections.binarySearch(al, 13);
		System.out.println(index);
	}
}
