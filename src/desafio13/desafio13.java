package desafio13;

import java.util.Scanner;

public class desafio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
        
        char medida;
	    int S,M,L;
		
		System.out.println("Ingrese una medida S,M,L: ");
		medida = entrada.next().charAt(0);
        
		if (medida == 's' || medida == 'S') {
        	System.out.println("Solo quedan 5 remeras.");
        }
        
        else if (medida =='m' || medida =='M'){
        	System.out.println("Solo quedan 2 remeras.");
        }
        else if (medida == 'l' || medida == 'L'){

		System.out.println("Lamentablemente, no quedaron mas remeras.");
        }
		
}
}
	