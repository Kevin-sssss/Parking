//Package E4
package exercise4;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
System.out.println("Comenecemos el cambio de divisas!");
System.out.println("Introduzca el valor en euros: ");
Scanner keyboard = new Scanner(System.in);
 double euros=keyboard.nextDouble();
System.out.println( euros+ "€ Euros");
double libras = euros*0.91;
System.out.println(libras+ "£ Libras esterlinas");
double dolar = euros*1.17;
System.out.println(dolar+ "$ Dolares");
double coronaN = euros*11.09;
System.out.println(coronaN + "kr Coronas Noruega");
double pesoA = euros* 89.31;
System.out.println(pesoA+"$ Pesos argentinos");














    }
    
}
