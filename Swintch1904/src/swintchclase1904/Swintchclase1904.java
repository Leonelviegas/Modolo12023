
package swintchclase1904;

import java.util.Scanner;

public class Swintchclase1904 {

    
    public static void main(String[] args) {
        //Variables 
        int dias;
        String mes = "";
        
        //Objeto scanner
        Scanner leerdia = new Scanner(System.in);
        Scanner leermes = new Scanner(System.in);
        
        System.out.println("---- Dias de la semana ----");
        System.out.println("---------------------------");
        System.out.println("---- 1 Lunes---------------");
        System.out.println("---- 2 Martes -------------");
        System.out.println("---- 3 Miercoles ----------");
        System.out.println("---- 4 Jueves -------------");
        System.out.println("---- 5 Viernes ------------");
        System.out.println("---- 6 Sabado -------------");
        System.out.println("---- 7 Domingo ------------");
        System.out.println("---------------------------");
        System.out.println("Que dia es hoy de la semana?");
        
        dias = leerdia.nextInt();
        
        //Logica del switch
        switch (dias)
        {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miercoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sabado");
                break;
            case 7:
                System.out.println("Hoy es domingo");
                break;
                
        }    
                
        //Cantidad de dias de meses del año
        System.out.println("---- Meses del año ----");
        System.out.println("-----------------------------");
        System.out.println("---- 1 Enero-----------------");
        System.out.println("---- 2 Febrero --------------");
        System.out.println("---- 3 Marzo ----------------");
        System.out.println("---- 4 Abril ----------------");
        System.out.println("---- 5 Mayo -----------------");
        System.out.println("---- 6 Junio ----------------");
        System.out.println("---- 7 Julio ----------------");
        System.out.println("---- 8 Agosto ---------------");
        System.out.println("---- 9 Septiembre -----------");
        System.out.println("---- 10 Octubre -------------");
        System.out.println("---- 11 Noviembre -----------");
        System.out.println("---- 12 Diciembre -----------");
        System.out.println("-----------------------------");
        System.out.println("De que mes queres saber su cantidad de dias?");
        mes = leermes.nextLine();
        
        switch (mes)
        {
            
               
                
        //Grupo 28/29 dias
        case "Febrero":System.out.println("Este mes puede tener 28 o 29 dias segun el año");
                break;   
                
        //Grupo 30 dias 
        case "Abril":
        case "junio":
        case "Septiembre":
        case "Noviembre":    
            System.out.println("Este mes tiene 30 dias");
            break;
            
        //Grupo 31 dias 
        case "Enero": 
        case "Marzo":
        case "Mayo":
        case "Julio":
        case "Agosto":
        case "Octubre":
        case "Diciembre":
            System.out.println("Este mes tiene 31 dias");
            break;
            
        default:
            System.out.println("Este no es un mes del año");
            break;
        }
        
        
        
    }
    
}
