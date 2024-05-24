package desafio22;

import java.util.Scanner;

public class desafio22 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
	int numero1;
	int numeroaleatorio;

    System.out.println("Ingrese un numero: ");
    numero1 = datos.nextInt();
    
    
	int numeroAleatorio = (int) Math.random()*99;
	System.out.println("El número aleatorio entre 0 y 99 es: " + numeroAleatorio);
                                       
    while (numero1 != numeroAleatorio) { 
	    System.out.println("Pifiaste. Ingrese un numero: ");
    numero1 = datos.nextInt();
	 
    }
	if (numero1==numeroAleatorio) {
		System.out.println("Ganaste.  \n");		 	
	}
	
    
		
}
}
