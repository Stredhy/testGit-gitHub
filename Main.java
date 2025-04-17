import java.util.Scanner;

public class Main{

	public static Double operation(int opc, Double num1, Double num2){
		Double result=0.0;
		switch(opc){
			case 1: result = num1 + num2;
				break;
			case 2: result = num1 - num2;
				break;
			default: 
			System.out.println("Operacion no disponible");
		}
		return result;
	}
	public static void main(String[] args){
		Scanner cs = new Scanner(System.in);
		int opc;
		Double num1, num2;
		System.out.println("Selecciona una opcion:");
		System.out.println("[ 1 ] - Suma");
		System.out.println("[ 2 ] - Resta");
		System.out.println("opc: ");
		opc = cs.nextInt();
		if(opc == 1){
			System.out.println("Suma, dame 2 numeros: ");
			System.out.println("numero 1: ");
			num1 = cs.nextDouble();
			System.out.println("numero 2: ");
			num2 = cs.nextDouble();
		}else{
			System.out.println("Resta, dame 2 numeros: ");
			System.out.println("numero 1: ");
			num1 = cs.nextDouble();
			System.out.println("numero 2: ");
			num2 = cs.nextDouble();
		}

		System.out.println("Resultado: " + operation(opc,num1,num2));
	}
}