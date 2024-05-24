package desafio16;

import java.util.Scanner;

public class desafio16 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		 int numero1, numero2, numero3;
		 
		 System.out.println("ingrese hora: ");
		 numero1 = datos.nextInt();
		 
		 System.out.println("ingrese minuto: ");
		 numero2 = datos.nextInt();
		 
		 System.out.println("ingrese segundo: ");
		 numero3 = datos.nextInt();
		 
		 
		 
		  if   (numero1 > 24) {
			  
			  System.out.println("Se alcanzo la 24 horas. termino el dia");
		  }
		
		  else if (numero2 > 60 ) {
			  System.out.println("se alcanzo los minutos. termino el dia");
		  }
	     else if (numero3 > 60) {
          
					 System.out.println("Se alcanzo los segundos. termino el dia");
			  }
			  
			  
}
}

