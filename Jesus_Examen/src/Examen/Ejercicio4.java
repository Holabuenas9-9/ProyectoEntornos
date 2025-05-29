package Examen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num;
		int res = 0;
		
		do {
			
			System.out.println("Introduce un número entero positivo: ");
			num = scan.nextInt();
			
			if (num < 0) {
			System.out.println("Número no válido");
			}else if (num % 2 == 0) {
				res +=num;
			}
			
			
		}while (num != 0);
		
		System.out.println("El resultado de la suma es: " + res);
		
		scan.close();
	}

}
