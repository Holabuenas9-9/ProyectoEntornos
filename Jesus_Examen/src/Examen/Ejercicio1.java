package Examen;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Introduce una hora válida: ");
		int hora = scan.nextInt();
		
		if (hora < 0 || hora > 23){
			System.out.println("Hora no válida.");
		}else if(hora >= 6 && hora < 12) {
			System.out.println("¡Buenos días! Son las " + hora);
		}else if (hora >= 12 && hora < 21) {
			System.out.println("¡Buenos tardes! Son las " + hora);
		}else if (hora >= 21 || hora < 6) {
			System.out.println("¡Buenos noches! Son las " + hora);
		}
		
		scan.close();
	}

}
