/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p022;

import java.util.Scanner;
public class P022 {
static Scanner keyboard=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       String curso;
        System.out.println("Course?: ");   
       curso=keyboard.next();
       if (curso.equals("DAM"))
            System.out.println("Vas a ser un buen programador!");
       else System.out.println("Buenos días.");    
    }
    
}
    
}
