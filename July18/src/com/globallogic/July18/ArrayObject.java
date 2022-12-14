//create a array of object of student type and create and store 10 object and print 10 object value
package com.globallogic.July18;


import java.util.Scanner;

class Student{
  public int roll;
  public String name;
 
  Student(int roll, String name){
    this.roll = roll;
    this.name = name;
  }
 
  //Override toString() to print object directly
  public String toString(){
    return "{roll: "+this.roll+", name: "+this.name+"}";
  }
  
}
 
class  ArrayObject {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    //Declare Array of class Students
    Student stdArray[]= new Student[10];
 
    System.out.println("Enter 10 students details");    
    for(int i=0; i<10; i++){
      //Create a new object of class Student
      Student newStudent = new Student(in.nextInt(),in.next());
      //Assign the object to the object array
      stdArray[i] = newStudent;
    }
 
    System.out.println("Students details are:");    
    for(int i=0; i<10; i++){
      //Student.toString() method will be used to output object
      System.out.println(stdArray[i]);
    }
 
  }
}