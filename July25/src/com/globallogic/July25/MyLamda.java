// sum of two number using lamda expression
package com.globallogic.July25;
import java.util.*;
interface Do{
	public int sum(int a, int b);
	
}

public class MyLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Do A = (a,b)->a+b;
		System.out.println(A.sum(10,20));
		

	}

}
