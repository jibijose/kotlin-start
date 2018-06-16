package com.test.kotlinstart;

import java.util.stream.IntStream;

public class JavaApp 
{
    public static void main( String[] args )
    {
    	JavaApp tester = new JavaApp();
    	
        System.out.println( "Hello World Started!" );
        int start = 1;
        int end = 100;
        int[] arr = new int[end - start];
        IntStream.range(0, end - start).forEach(i -> arr[i] = i + start);
        System.out.println( "Hello World Ended!" );
        
        
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        MathOperation division = (int a, int b) -> a / b;
		
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
        
        GreetingService greetService1 = message ->
        System.out.println("Hello " + message);
  		
        //with parenthesis
        GreetingService greetService2 = (message) ->
        System.out.println("Hello " + message);
  		
        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }
    
    interface MathOperation {
        int operation(int a, int b);
     }
  	
     interface GreetingService {
        void sayMessage(String message);
     }
  	
     private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
     }
}
