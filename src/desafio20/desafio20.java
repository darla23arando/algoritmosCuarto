package desafio20;

public class desafio20 {
	public static void main(String[] args) throws InterruptedException {
		int seguidores = 0 ;
		
		while (seguidores <100) {
					
			seguidores++; // temperatura +=2 (esto suma de a 2 en 2, sirve para ejercicio 21)
			System.out.println("Cantidad de seguidores: "+seguidores);
			Thread.sleep(200);
			
			if (seguidores == 100) {
			System.out.println("Llegaste a los 100 seguidores!!!");
			
			}
		}
		
		
	}
}
