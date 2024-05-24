package desafio21;

public class desafio21 {
	
	public static void main(String[] args) throws InterruptedException {
		 int grado = 34, resultado;
		
		while (grado <100) {
			grado +=2;  
			System.out.println("grados: "+grado);
			Thread.sleep(20);
			
			if ( grado == 84) {
			resultado = grado + 1;
			System.out.println("grados: "+ resultado);
			System.err.println("Cuidado, Temperatura peligrosa");
			Thread.sleep(1000);
			}
			
            if(grado ==100) {
			System.err.println("Valor extremo, apagando pc");
 			Thread.sleep(1000);
		}
		
}
}
}
