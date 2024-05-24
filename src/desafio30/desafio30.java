package desafio30;

import java.util.Scanner;

public class desafio30 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		for (int die = 0; die <= 100; die++) {
			System.out.println("Cantidad de seguidores: " + die);
			Thread.sleep(200);

			if (die == 100)
				System.out.println("Llegaste a los 100 seguidores");

		}

	}
}