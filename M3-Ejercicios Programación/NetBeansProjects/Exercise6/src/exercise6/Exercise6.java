//package E6
package exercise6;

import java.util.Scanner;

public class Exercise6 {

//operaciones
    public static void main(String[] args) {
System.out.println("Introduce los números para saber la suma y el producto");
Scanner keyboard = new Scanner(System.in);
System.out.println("Introduzca el primer número");
 double numero1=keyboard.nextDouble();
System.out.println("Introduzca el segundo número");
 double numero2=keyboard.nextDouble();   
System.out.println("Introduzca el tercer número");
 double numero3=keyboard.nextDouble();
System.out.println("Introduzca el cuarto número");
 double numero4=keyboard.nextDouble();
 double suma= numero1+numero2+numero3+numero4;
System.out.println("La suma total es: " + suma);
 double producto= numero1*numero2*numero3*numero4;
System.out.println("El producto total es: " + producto);
        
    }
    
}
