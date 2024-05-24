package desafio11;

	import java.util.Scanner;

	public class desafio11 {
		
		public static void main(String[] args) {
			Scanner datos = new Scanner (System.in);	
			float numero1;
			
			System.out.println("Ingrese un numero: ");
			numero1 = datos.nextFloat();
	        
	        if (numero1 >0) {
	        	System.out.println("El numero es positivo.");
	        }
	        
	        else if (numero1 <0){
	        	System.out.println("El numero es negativo.");
	        }
	        
	        else if (numero1 == 0){
	        	System.out.println("El numero es 0");
	        }
	        
}
}