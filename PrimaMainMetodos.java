package despliegue;

import java.util.Scanner;

/**
 * Clase principal del programa
 * Programa que calcula el tipo de prima de un empleado 
 * dependiendo del tipo de empleado que sea y los meses que lleve trabajando.
 * @author Adrián Vázquez
 *
 */
public class PrimaMainMetodos {

	static Scanner  teclado=new Scanner(System.in);
	
	/**
	 * Este es el método principal que va llamando a diferentes métodos
	 * mientras respondamos con S
	 * @param args
	 */
	public static void main(String[] args) {
		int numEmple;
		String nomEmple;
		int meses;
		char esDirectivo;
		char respuesta;
		

		do {
			System.out.println("\nDATOS  EMPLEADO/A");
			numEmple=leerNumEmple();
			nomEmple=leerNomEmple();
			meses=leerMeses();
			esDirectivo=leerEsDirectivo();
			System.out.println("\n\tLe corresponde la prima "+hallarPrima(esDirectivo, meses));
			
			
			System.out.println("\n¿CALCULAR MAS PRIMAS? (S/N): ");
			respuesta=teclado.nextLine().toUpperCase().charAt(0);
		}while(respuesta=='S');		
	}


	/**
	 * Método que nos dice el tipo de prima que le corresponde a un empleado dependiendo de 
	 * si este es directivo o no y los meses que lleva trabajados.
	 * @param esDirectivo - Valor introducido por el usuario indicando si el empleado es directivo o no.
	 * @param meses - Valor introducido por el usuario indicando el número de meses que lleva trabajados un empleado.
	 * @return - Retorna un valor String indicando el tipo de prima que le corresponde al empleado.
	 */
	public static String hallarPrima(char esDirectivo, int meses) {
		if(esDirectivo=='+') // ES DIRECTIVO
			if(meses>=12)
				return "P1";
			else
				return "P3";
		else 	// NO ES DIRECTIVO
			if(meses>=12)
				return "P2";
			else
				return "P4";
	}

	
	/**
	 * Método que pide el número del empleado.
	 * @return - Retorna un valor entero que es el número de empleado
	 */
	public static int leerNumEmple() {		
		int numEmple;
		do{
			System.out.println("NÚMERO [100-999]: ");
			numEmple = teclado.nextInt();
		}while(numEmple<100 || numEmple>999);		
		teclado.nextLine();
		return numEmple;
	}
	
	
	/**
	 * Método que pide el nombre del empleado.
	 * @return - Retorna un valor String con el nombre del empleado.
	 */
	public static String leerNomEmple() {
		String nomEmple;
		do {
			System.out.println("NOMBRE (max 10 caracteres): ");
			nomEmple = teclado.nextLine();
		}while(nomEmple.length()>10);		
		return nomEmple;
	}
	

	/**
	 * Método que pide los meses que lleva trabajando un empleado.
	 * @return - Retorna un valor entero con el número de meses que lleva trabajados un empleado.
	 */
	public static int leerMeses() {
		int meses;
		do {
			System.out.println("MESES DE TRABAJO: ");
			meses = teclado.nextInt();
		}while(meses<0);
		teclado.nextLine();
		return meses;
	}
	

	/**
	 * Método en el cual se indica si un empleado es directivo o no.
	 * @return - Retorna un valor char indicando si el empleado es directivo o no.
	 */
	public static char leerEsDirectivo() {
		char esDirectivo;
		do {
			System.out.println("¿ES DIRECTIVO? (+/-): ");
			esDirectivo = teclado.nextLine().charAt(0);
		}while(esDirectivo!='+' && esDirectivo!='-');
		return esDirectivo;
	}		

}



