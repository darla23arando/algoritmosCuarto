package ejercicio10;

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
		
		int numeroAleatorio = (int) Math.random()*99;

		System.out.println("El número aleatorio entre 0 y 99 es: " + numeroAleatorio);
                                           
	    System.out.println("Ingrese un numero: ");
        numero1 = datos.nextFloat();
        
		if (edad>=18) {
			System.out.println("Podes pasar al casino.  \n"); // \n da salto de linea		 	
		}
		
		else {
			System.out.println("Sos menor. Chau, pipi. \n");  // \n da salto de linea
		
        
	}
	
}