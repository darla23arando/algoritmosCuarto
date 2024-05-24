package desafio29;

import java.util.Scanner;

public class desafio29 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 100; i >20; i--) {
			System.out.println("Bateria: "+i);	
			Thread.sleep(20);
		}
		System.out.println("Bateria Baja");
		
		for (int d = 20; d >=0; d--) {
			System.out.println("Bateria: "+d);	
			Thread.sleep(50);
		}
		System.out.println("Bateria Agotada");
		
}	
}
