package desafio10;

import java.util.Scanner;


public class ejercicio10 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		String nombre;
		String apellido;
		int num1;	
		float numero1;
		
		System.out.println("Ingrese un nombre:");
		nombre = datos.next();
		
		System.out.println("Ingrese un apellido:");
		apellido = datos.next();
		
	    System.out.println("Ingrese un numero: ");
        numero1 = datos.nextFloat();
        
		
		double numeroAleatorio = (double) Math.random()*99;

		System.out.println("El número aleatorio entre 0 y 99 es: " + numeroAleatorio);
                                           
        // while (numero1 != numeroAleatorio) { 
		//     System.out.println("Pifiaste. Ingrese un numero: ");
        // numero1 = datos.nextFloat();
		// }
		
		if (numero1==numeroAleatorio) {
			System.out.println("Ganaste.  \n");		 	
		}
		
		else {
			System.out.println("Perdiste. \n"); 
		}
}
}
