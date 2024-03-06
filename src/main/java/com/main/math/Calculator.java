package com.main.math;

public class Calculator {

	public int add(int firstNum, int secondNum)
	{
		return firstNum+secondNum;
	}
        //Bug-102
       public int mul(int a1, int a2)
      {
          return a1*a2;
      }
        //BUG-101
        public int sub(int num1 , int num2)
        {   
               int f1 = num1;
               int f2 = num2;
             //logic is middle
           return f1-f2;
        }
     public void m1()
     {
        System.out.println("Hello");
     }	 
}
