// sum of n number using lamda expression
package com.globallogic.July25;

import java.util.*;

interface Sum {
	public int sum(int a);

}

public class Sumlamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// defining lamda expression
		Sum A = (int n) -> {
			return (n * (n + 1) / 2);
		};
		System.out.println(A.sum(sc.nextInt()));

	}

}
