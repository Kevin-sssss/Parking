//Exercises
package p03.pkg1;

import java.util.Scanner;

public class P031 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        userMenu();
        int option = keyboard.nextInt();
        switch (option) {
            case 1:
                Atracciones();
                break; //salir del switch
            case 2:
                Estaciones();
                break;//salir del switch
            case 3:
                horarios();
                break;//salir del switch
            case 4:
                Ball();
                break; //salir del switch
            default: //sentencias de los casos NO previstos
        }
    }

    private static void userMenu() {
        System.out.println("Atracciones");
        System.out.println("Estaciones");
        System.out.println("Horarios");
        System.out.println("Balón de oro");
        System.out.println("escoge una opción");
    }

    private static void Atracciones() {

        System.out.println("Put your age for determine the price of ticket");
        int age = keyboard.nextInt();

        if (age >= 5 && age <= 12) {
            System.out.println("The ticket price is 3€");
        }
        if (age > 12 && age <= 17) {
            System.out.println("The ticket price is 5€");
        }
        if (age > 17 && age <= 30) {
            System.out.println("The ticket price is 10€");
        }
        if (age > 30 && age <= 65) {
            System.out.println("The ticket price is 15€");
        }
        if (age < 5 || age > 65) {
            System.out.println("The ticket price is 0€");
        }

    }

    private static void Estaciones() {
        System.out.println("Put the day");   
    
        int day=keyboard.nextInt();
    System.out.println("Put the month");
    
       int month=keyboard.nextInt();
    System.out.println(month +" " + day);  
    if (month <= 3){
        System.out.println("Is Winter");
    }
    if (month >= 4 && month <=6){
        System.out.println("Is Spring");
    }
    if (month >= 7 && month <=9){
        System.out.println("Is Summer");
    }    
    if (month >= 10 && month <=12){
        System.out.println("Is Autumn");
    }
    }

    private static void horarios() {
        System.out.println("Give me the duration of the flight in minutes");
        long minfly=keyboard.nextInt();
        System.out.println("The departure of the flight is at...");
        System.out.println("Hour:");
        long hours=keyboard.nextInt();
        System.out.println("Minutes:");
        long minout=keyboard.nextInt();
        System.out.println("The time of the departure is: "+ hours +":"+ minout);
       long a = minfly/60;
       long b = minfly%60;
       long sumamin=minout+b;
       if(sumamin>59) {
System.out.println("The arrival time is " + (hours+a+1) +":"+ (minout+b-60));        
       }
       else{
System.out.println("The arrival time is " + (hours+a) +":"+ (minout+b));          
       } 
    }


    private static void Ball() {     
System.out.println("¿Who is the Ball the or of the year...? ");    
int ball=keyboard.nextInt();
if (ball==2000){
System.out.println("Luis Figo");
}
if (ball==2001){
System.out.println("Michael Owen");
}if (ball==2002){
System.out.println("Ronaldo");
}if (ball==2003){
System.out.println("Pavel Nedved");
}if (ball==2004){
System.out.println("Andriy Shevchenko");
}if (ball==2005){
System.out.println("Ronaldinho");
}if (ball==2006){
System.out.println("Fabio Cannavaro");
}if (ball==2007){
System.out.println("Kaká");
}if (ball==2008){
System.out.println("Cristiano Ronaldo");
}if (ball==2009){
System.out.println("Lionel Messi");
}if (ball==2010){
System.out.println("Lionel Messi");
}if (ball==2011){
System.out.println("Lionel Messi");
}if (ball==2012){
System.out.println("Lionel Messi");
}  
if (ball==2013){
System.out.println("Cristiano Ronaldo");
}
if (ball==2014){
System.out.println("Cristiano Ronaldo");
}
if (ball==2015){
System.out.println("Lionel Messi");
}
if (ball==2016){
System.out.println("Cristiano Ronaldo");
}
if (ball==2017){
System.out.println("Cristiano Ronaldo");
}
if (ball==2018){
System.out.println("Luca Modric");
}
if (ball==2019){
System.out.println("Lionel Messi");
}
if (ball<2000){
System.out.println("I really don't know, at that time i didn't born yet");
}
    }
}
   
    