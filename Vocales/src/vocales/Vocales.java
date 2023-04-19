
package vocales;

import java.util.Scanner;

public class Vocales {

    
    public static void main(String[] args) {
        //Variables
        int vocales;
        
        //Objeto scanner
        Scanner vocal = new Scanner (System.in);
        
        System.out.println("------- Vocales -------");
        System.out.println("------- 1 A -------");
        System.out.println("------- 2 E -------");
        System.out.println("------- 3 I -------");
        System.out.println("------- 4 O -------");
        System.out.println("------- 5 U -------");
        System.out.println("-----------------------");
        System.out.println("Seleccione una vocal para saber si es abierta o cerrada");
        
        vocales = vocal.nextInt();
        
        //Logica switch
        switch (vocales)
        {
               
            case 1: System.out.println("La vocal seleccionada es la A y es abierta");
            break;
            case 2: System.out.println("La vocal seleccionada es la E y es abierta");
            break;
            case 3: System.out.println("La vocal seleccionada es la I y es cerrada");
            break;
            case 4: System.out.println("La vocal seleccionada es la O y es abierta");
            break;
            case 5: System.out.println("la vocal seleccionada es la U y es cerrada");
            break;
            
            default: System.out.println("El dato ingresado no es vocal y/o es una consonante");
            break;
        }
        
    
        
    }
    
}
