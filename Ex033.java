package Exercicios2;
import java.util.Scanner;

public class Ex033 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int result = 0;
		int contador = 0;
		
		while (contador < 10) {
		contador = contador + 1;
		char resp = 'p';

		while(resp != 'a' && resp != 'A' && resp != 'b' && resp != 'B' && resp != 'c' && resp != 'C' && resp != 'd' && resp != 'D' && resp != 'e' && resp != 'E') {
			System.out.print("Digite o resultado da " + contador + " : ");
			resp = ent.nextLine().charAt(0);
		}
		if ((contador == 1 || contador == 2) && (resp == 'a' || resp == 'A')) {
			result = result + 1;
			System.out.println("Correto resposta A ");
		}else if (contador == 1 || contador == 2) {
			System.out.println("Errada, resposta correta (A)");
		}
		if ((contador == 3 || contador == 4) && (resp == 'b' || resp == 'B')) {
			result = result + 1;
			System.out.println("Correto resposta B ");
		}else if (contador == 3 || contador == 4) {
			System.out.println("Errada, resposta correta (B)");
		}
		if ((contador == 5 || contador == 6) && (resp == 'c' || resp == 'C')) {
			result = result + 1;
			System.out.println("Correto resposta C ");
		}else if (contador == 5 || contador == 6) {
			System.out.println("Errada, resposta correta (C)");
		}
		if ((contador == 7 || contador == 8) && (resp == 'd' || resp == 'D')) {
			result = result + 1;
			System.out.println("Correto resposta D ");
		}else if (contador == 7 || contador == 8) {
			System.out.println("Errada, resposta correta (D)");
		}
		if ((contador == 9 || contador == 10) && (resp == 'e' || resp == 'E')) {
			result = result + 1;
			System.out.println("Correto resposta E ");
		}else if (contador == 9 || contador == 10) {
			System.out.println("Errada, resposta correta (e)");
		}
		}
		System.out.println("Pontuação final : " + result);
		ent.close();
	}

}
