
package ejercicio.pkg5;


public class Ejercicio5 {

    public static void main(String[] args) {
        
/*Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de 
tipo double y asigna a cada una un valor. A continuación, muestra por pantalla:
El valor de cada variable.
La suma X + Y
La diferencia X – Y
El producto X * Y
El cociente X / Y
El resto X % Y
La suma N + M
La diferencia N – M
El producto N * M
El cociente N / M
El resto N % M
La suma X + N
El cociente Y / M
El resto Y % M
El doble de cada variable
La suma de todas las variables
El producto de todas las variables
Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2 y a N el valor 4.7 se debe mostrar por pantalla:
Variable X = 1
Variable Y = 2
Variable M = 3.2
Variable N = 4.7
1 + 2 = 3
1 - 2 = -1
1 * 2 = 2
1 / 2 = 0
1 % 2 = 1
4.7 + 3.2 = 7.9
4.7 - 3.2 = 1.5
4.7 * 3.2 = 15.040000000000001
4.7 / 3.2 = 1.46875
4.7 % 3.2 = 1.5
1 + 4.7 = 5.7
2 / 3.2 = 0.625
2 % 3.2 = 2.0
Variable X = 1 el doble es 2
Variable Y = 2 el doble es 4
Variable M = 3.2 el doble es 6.4
Variable N = 4.7 el doble es 9.4
1 + 2 + 4.7 + 3.2 = 10.9
1 * 2 * 4.7 * 3.2 = 30.080000000000002*/

    
        //Variables
        
        int X = 1;
        int Y = 2;
        double M = 3.2;
        double N = 4.7;
        
        
    System.out.println(".........Variables.........");    
    System.out.println("X vale: " + X);
    System.out.println("Y vale: " + Y);
    System.out.println("M vale: " + M);
    System.out.println("N vale: " + N);
        
        
        //Operaciones
        
        int suma = X + Y;
        int resta = X - Y;
        int multi = X * Y;
        double divi = X / Y;
        double resto = X % Y;
        double suma2 = M + N;
        double resta2 = N - M;
        double multi2 = N * M;
        double divi2 = N / M;
        double resto2 = N % M;
        double suma3 = X + N;
        double divi3 = N / M;
        double resto3 = Y % M;
        int dobleX = X * 2;
        int dobleY = Y * 2;
        double dobleM = M * 2;
        double dobleN = N * 2;
        double sumatodas = X + Y + M + N;
        double multitodas = X * Y * M * N;
        
    
    System.out.println("...Resultado operaciones...");
    System.out.println("X + Y = " + suma);
    System.out.println("X - Y = " + resta);
    System.out.println("X * Y = " + multi);
    System.out.println("X / Y = " + divi);
    System.out.println("X % Y = " + resto);
    System.out.println("M + N = " + suma2);
    System.out.println("M - N = " + resta2);
    System.out.println("M * N = " + multi2);
    System.out.println("M / N = " + divi2);
    System.out.println("M % N = " + resto2);
    System.out.println("X + N = " + suma3);
    System.out.println("N / M = " + divi3);
    System.out.println("Y % M = " + resto3);
    System.out.println("Doble de X = " + dobleX);
    System.out.println("Doble de Y = " + dobleY);
    System.out.println("Doble de M = " + dobleM);
    System.out.println("Doble de N = " + dobleN);
    System.out.println("Suma total de variables = " + sumatodas);
    System.out.println("Multiplicacion total de variables = " + multitodas);
    System.out.println("...........Fin............");
  
    
    
    
    
    }
   
        

    }
    
