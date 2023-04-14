
package javaapplication4;

import java.util.Scanner;

public class clima {
 
    public static void main(String[] args) {
        
        //variables
        int tem;
        String nombre;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        nombre = lector.nextLine();
        System.out.print("Ingrese la temperatura actual: ");
        tem = lector.nextInt();
        
        System.out.println("Hola " + nombre + ", " + "hace" + " " + tem + " grados.");
        if (tem >= 30 ){
        System.out.println("Vaya a la playa!!!");
        }
        if (tem > 25 && tem < 30){
        System.out.println("Vaya a la pileta!!!");    
        }
        if (tem <= 25 && tem > 10){
        System.out.println("Vaya a caminar!!!");
        }
        if (tem <= 10){
        System.out.println("Pongase un abrigo!!!");
        }
    }
    
}
