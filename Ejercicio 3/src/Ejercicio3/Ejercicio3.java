
package Ejercicio3;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        
        //Declaro variables
int numero1;
int numero2;
int suma;
int edad;
String nombre;

        //Declaro constante
final int numero3 = 4;

        //Ingreso los valores a las variables numero1 y numero2
numero1 = 30;
numero2 = 40;

        //Operacion suma
suma = (numero1 + numero2);

        //Muestro en pantalla las dos variables y resultado de suma
    System.out.println("---------- Variables -----------");
    System.out.println("Variable 1 = " +numero1);
    System.out.println("Variable 2 = " +numero2);
    System.out.println("Resultado suma = " +suma);
    System.out.println("--------------------------------");

        //Cambio valores variables y vuelvo a sumar
numero1 = 100;
numero2 = 400;

        //Operacion suma
suma = (numero1 + numero2);

        //Nuevas variables y suma 
    System.out.println("------- Nuevas variables -------");
    System.out.println("Variable 1 = " +numero1);
    System.out.println("Variable 2 = " +numero2);
    System.out.println("Resultado suma = " +suma);
    System.out.println("--------------------------------");
    
        //Instancio y muestro en pantalla nombre y edad
nombre = "Leo";
edad = 32;

    System.out.println("Nombre = " +nombre);
    System.out.println("Edad = " +edad);
    
        //Muestro en pantalla la constante
    System.out.println("Valor constante: " +numero3);
    }
       
}
