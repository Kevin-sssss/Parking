//Driver or no?
package exercise0210;

import java.util.Scanner;

public class Exercise0210 {

    static Scanner keyboard= new Scanner (System.in);
//if
    
    public static void main(String[] args) {
    System.out.println("Put your age in the following line");
   int age=keyboard.nextInt();
   if (age>=18)
   System.out.println("Congrats, you can do the exam for driving license"); 
    else{
       System.out.println("Sorry, but you can't do the driving license");
    
    }
    }
}

