package desafio33;

import java.util.Scanner;

public class desafio33 {
public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		String nombre;
		int edad;
		
		for (int i = 1; i <= 11; i++) {
			System.out.println("Jugador: "+i);	
		    
			if (i < 11 )
			System.out.println("Nombre:");
			nombre = datos.next();
			System.out.println("Edad:");
			edad = datos.nextInt();
		}
		
		
}	
}
