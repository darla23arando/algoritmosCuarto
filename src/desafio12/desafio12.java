package desafio12;

import java.util.Scanner;

public class desafio12 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		float numero1;
		System.out.println("Ingrese un numero entre 1 y 10: ");
		numero1 = datos.nextFloat();
       
		if (numero1 > 10) {
			
			System.out.println("se ingreso un valor incorrecto.");
         }
		 else if (numero1 <4){
	        	System.out.println("Insuficiente.");
	        }
		 else if (numero1 <6){
	        	System.out.println("No logrado.");
	        }
		 else if (numero1 <8){
	        	System.out.println("Suficiente.");
	        }
		 else if (numero1 <10){
	        	System.out.println("Notable.");
	        }
		 else if (numero1 == 10){
	        	System.out.println("Sobresaliente.");
	        }
}
}
