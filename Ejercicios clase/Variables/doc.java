public class doc{
//Declaro metodo main
	public static void main(String arg[ ]) {
//Declarar variables
	int VarA = 10;
	int VarB = 20;
	int VarC = 30;
	int VarD = 40;
//Mostrar valor variables
	System.out.println("------Variables Iniciales------");
	System.out.println("--El valor VarA es:" + VarA);
	System.out.println("--El valor VarB es:" + VarB);
	System.out.println("--El valor VarC es:" + VarC);
	System.out.println("--El valor VarD es:" + VarD);
	System.out.println("----------------------------");
//Cambio de valores
	VarB = VarC;
	VarC = VarA;
	VarA = VarD;
	VarD = VarB;
//Mostrar resultados
	System.out.println("------Valores finales------");
	System.out.println("--El valor VarB es:" + VarB);
	System.out.println("--El valor VarC es:" + VarC);
	System.out.println("--El valor VarA es:" + VarA);
	System.out.println("--El valor VarD es:" + VarD);
}
}

