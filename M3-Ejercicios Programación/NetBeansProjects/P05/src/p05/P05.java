//package: exercise1
package exercise1;
//import: Library
import java.util.Scanner;
public class Exercise1 {
public static void main(String[] args) {
System.out.println("Nombre del producto");
Scanner reader=new Scanner (System.in);
reader.useDelimiter("\n");
String nombre=reader.next();
System.out.println("Precio del producto");
float Precio=reader.nextInt();
System.out.println("% del IVA");
float IVA=reader.nextInt();
System.out.println("% de descuento");
float Descuento=reader.nextInt();
float resultadoiva = Precio*IVA/100;
float resultadodes = Precio*Descuento/100; M1 - Implantación de Sistemas Operativos Uf1 P02 Zambrano Jiménez, Kevin Omar Ejercicios M3:Programación
float resultadototal= Precio+resultadoiva-resultadodes;
System.out.println("Precio total PVP: " +resultadototal);
}
}