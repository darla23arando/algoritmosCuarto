package desafio18;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class desafio18 {
	public static void main(String[] args) {
	Scanner datos = new Scanner (System.in);
	
	int opcion; 
	
	System.out.println("Bienvenido");
	System.out.println("eliga un cafe");
	System.out.println("1. es café cortado");
	System.out.println("2. es el cafe latte");
	System.out.println("3. es el cafe solo");
	System.out.println("4. es el cafe lagrima");
	 
	opcion = datos.nextInt();
	
	switch(opcion) {
	
	case 1:
	System.out.println("eligio cafe cortado");
	break;
	case 2:
	System.out.println("eligio cafe latte");
	break;
	case 3:
	System.out.println("eligio cafe solo");
	break;
	case 4:
	System.out.println("eligio cafe lagrima");
	break;	
	
	default:
		System.err.println("Opcion incorrecta");
	}
}
}
