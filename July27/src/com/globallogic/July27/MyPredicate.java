package com.globallogic.July27;
import java.util.function.Predicate;


public class MyPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> hlw = e->(e>18);
		System.out.println(hlw.test(23));
		
		

	}

}
