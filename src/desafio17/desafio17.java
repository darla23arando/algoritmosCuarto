package desafio17;

import java.util.Scanner;

public class desafio17 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("ingrese un numero: ");
		n1 = datos.nextInt();
		System.out.println("ingrese un numero: ");
		n2 = datos.nextInt();
		System.out.println("ingrese un numero: ");
		n3 = datos.nextInt();
		
		if ( n1 >n2 && n2 > n3) {
			System.out.println("El numero mayor es "+ n1);
			System.out.println("El numero intermedio  es "+ n2);
			System.out.println("El numero menor es "+ n3);
		}
		else if (n1 >n3 && n3 > n2){
			System.out.println("El numero mayor es "+ n1);
			System.out.println("El numero intermedio  es "+ n3);
			System.out.println("El numero menor es "+ n2);
		}
		
		else if (n2 >n3 && n3 > n1){
			System.out.println("El numero mayor es "+ n2);
			System.out.println("El numero intermedio  es "+ n3);
			System.out.println("El numero menor es "+ n1);
		}		
		else if (n2 >n1 && n1 > n3){
			System.out.println("El numero mayor es "+ n2);
			System.out.println("El numero intermedio  es "+ n1);
			System.out.println("El numero menor es "+ n3);
		}
		
		
		else if (n3 >n1 && n1 > n2){
			System.out.println("El numero mayor es "+ n3);
			System.out.println("El numero intermedio  es "+ n1);
			System.out.println("El numero menor es "+ n2);
		}
		else if (n3 >n2 && n2 > n1){
			System.out.println("El numero mayor es "+ n3);
			System.out.println("El numero intermedio  es "+ n2);
			System.out.println("El numero menor es "+ n1);
		}
		
}
}
