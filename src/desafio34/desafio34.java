package desafio34;

import java.util.Scanner;

public class desafio34 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int num;
		
		for (int i = 1; i <= 11; i++) {
			System.out.println("Mes: "+i);	
		    
			if (i < 12 ) {
			System.out.println("Ingresar valor:");
			num = datos.nextInt();
		}
		else if (num < 15000) {
			System.out.println("El costo es:"+ num);
		}
			
	}
}
}
	