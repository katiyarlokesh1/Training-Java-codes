package com.globallogic.July22;

import java.util.*;

class E {
	int Id, Salary;
	String Name;

	public E(int id, int salary, String name) {

		this.Id = id;
		this.Salary = salary;
		this.Name = name;
	}

	public String toString() {
		return "Employee [Id=" + Id + ", Salary=" + Salary + ", Name=" + Name + "]";
	}

}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details");
		E e1 = new E(sc.nextInt(), sc.nextInt(), sc.next());
		E e2 = new E(sc.nextInt(), sc.nextInt(), sc.next());
		Set<E> s = new HashSet<E>();
		s.add(e1);
		s.add(e2);
		s.remove(e1);

		System.out.println(s);
		// now create a

	}

}
