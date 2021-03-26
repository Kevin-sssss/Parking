//Approved or no
package pkg02101;

import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
//Approved?

    public static void main(String[] args) {
    System.out.println("Put your note of this course");
    
        float approved = keyboard.nextFloat();
        if (approved >= 7)
        System.out.print("Congratulions! You approved!");
        else {
                System.out.print("Don´t be disappointed, you can work much better!");
                }

    }
}

