package com.main;

import com.main.math.Calculator;

/**
 * Hello world!
 *
 */
public class Test
{
    public static void main( String[] args )
    {
         Calculator c = new Calculator();
         System.out.println(c.add(100, 200));
         System.out.println(c.sub(500, 200));
         System.out.println(c.mul(500, 200));
          
    }
}
