package desafio14;

import java.util.Scanner;

public class desafio14 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
         int numero1;
		
		System.out.println("Ingrese un numero: ");
		numero1 = datos.nextInt();
		
		if (numero1 != 0) {
			System.out.println("Se puede dividir. ");
		}
			
			else if (numero1 <1) {
			System.out.println("No se puede dividir");	
		
		}
		
		
}
}
