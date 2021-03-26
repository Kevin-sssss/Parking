/*
P07-26/10/2020
for; while ; do while
 */
package práctica07;

import java.util.Scanner;

public class Práctica07 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        //apartado0();
        apartado1();
    }

   /*private static void apartado0() {
        //calcular la media de edad de la clase
        int edad;
        float suma = 0; //sumatorio
        int nAlumnos;
        float media;

        System.out.print("Número de alumnos: ");
        nAlumnos = keyboard.nextInt();

        int index;
        for (index = 0; index < nAlumnos; index++) {
            //---------------Bucle
            System.out.print("Tu edad?: ");
            edad = keyboard.nextInt();
            suma = suma + edad;
            //---------------Fin de for         
        }
media=suma/nAlumnos;
        System.out.println("La media es igual a "+media);
    }*/

    private static void apartado1() {
        System.out.println("LALA");
       int number=100;
       int i;
       for(i=1;i<=number;i++);
       
        System.out.println( i+ " ");
       
    }
}
