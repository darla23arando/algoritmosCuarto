package desafio9;

import java.util.Scanner;


public class desafio9 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		String nombre;
		String apellido;
		
		System.out.println("Ingrese un nombre:");
		nombre = datos.next();
		
		System.out.println("Ingrese un apellido:");
		apellido = datos.next();
        
        int numeroAleatorio = (int) Math.random()*99;
        
        System.out.println("El numero aleatorio entre 0 y 99 es: " + numeroAleatorio);
        
        
        

}
}
		