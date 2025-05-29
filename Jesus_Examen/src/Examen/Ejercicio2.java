package Examen;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Random ran = new Random ();
		
		int num;
		int cont = 0;
		int numRan = ran.nextInt(100);
		
		do {
			
			System.out.print("Adivina un número comprendido del 1 al 100: ");
			num = scan.nextInt();
			
			if (num>numRan) {
				System.out.println("Intentalo de nuevo, el número es menor.\n");
			}else if (num<numRan) {
				System.out.println("Intentalo de nuevo, el número es mayor.\n");
			}
			
			cont++;
			
		}while(num!=numRan);
		
		System.out.println("\n¡Enhorabuena! Lo has intentado " + cont + " veces.");
		
		scan.close();
	}

}
