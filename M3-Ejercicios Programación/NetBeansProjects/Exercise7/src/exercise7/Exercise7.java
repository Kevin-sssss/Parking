//DNI
package exercise7;

import java.util.Scanner;

public class Exercise7 {


    public static void main(String[] args) {
System.out.println("Introduzca su Nombre completo");
Scanner keyboard= new Scanner (System.in); 
 keyboard.useDelimiter("\n");
String nombre= keyboard.next();
System.out.println("Introduzca los campos requeridos de su DNI");
System.out.println("Introduzca los números de su DNI");
int numeros=keyboard.nextInt();
System.out.println("Introduzca la letra de su DNI");
String letra=keyboard.next();
System.out.println(nombre+ " "+ numeros + letra);
 }
    }
