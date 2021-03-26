//package: Tarea
package p03;

//import: Library

import java.util.Scanner;
public class P03 {
{
// inicio de clase
public static void main(String[] args) {
   System.out.println("¡Empecemos las operaciones!");
   
      System.out.println("Introduzca el primer número ");
      Scanner reader = new Scanner(System.in);
       int numero1 = 0;
       float numero3 = 0;
       numero1 = reader.nextInt();
System.out.println("Introduzca el segundo número ");
int   numero2= 0;   
       numero2 = reader.nextInt();
System.out.println("Veamos los resultados: ");
        int resultado = numero1+numero2;
 System.out.println("La suma es:"); System.out.println(+ numero1 + "+" + numero2 + "=" + resultado);
       int resultado1 = numero1*numero2;
 System.out.println("La multiplicación es:");System.out.println(+ numero1 + "*" + numero2 + "=" + resultado1);
         int resultado2 = numero1-numero2;
 System.out.println("La resta es:"); System.out.println(+ numero1 + "-" + numero2 + "=" + resultado2);
       double resultado3 = (double)numero1/numero2;
 System.out.println("La división es:"); System.out.println(+ numero1 + "/" + numero2 + "=" + resultado3);
       int resultado4 = numero1%numero2;
 System.out.println("Y el residuo de la división es:"); System.out.println(+ numero1 + "%" + numero2 + "=" + resultado4);          
         
         
}
   
}
