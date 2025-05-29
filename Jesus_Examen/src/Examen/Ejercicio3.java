package Examen;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce un número entero positivo: ");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println("No es un entero positivo.");
		}else {
		
		boolean esPrimo = true;
		int siguiente = num;
		String SiNo;
		
		for (int x = num; x < num+5; x++) {
			
			siguiente++;
			esPrimo = true;
			
			for(int i = 2; i < siguiente; i++) {
			
				if (siguiente % i == 0) {
					esPrimo = false;
					break;
				}
				
			}
			
			if (esPrimo) {
				SiNo = " es primo.";
			}else {
				SiNo = " no es primo.";
			}
			
			System.out.println(siguiente + SiNo);
			
			scan.close();
		}
		
		}
	}

}
