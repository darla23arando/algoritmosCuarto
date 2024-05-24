package desafio15;

import java.util.Scanner;

public class desafio15 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);

		float numero1,resultado ;
		
		
		System.out.println("ingrese el costo total: ");
		numero1 = datos.nextInt();
		
		if (numero1 > 15000) {
			resultado = numero1 - numero1/10;
		System.out.println("Costo es: "+ resultado);
		}
		
		else if (numero1 < 15000) {
			System.out.println("El costo es:"+ numero1);
		}
		
}
}