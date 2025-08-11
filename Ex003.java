package Exercicios2;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.print("Digite a letra F ou M : ");
		char let = ent.next().charAt(0);

		switch (let) {
		case 'F': case 'f':
			System.out.println("É feminino");
			break;
		case 'M': case 'm':
			System.out.println("É Masculino");
			break;

		default:
			System.out.println("Alternativa invalida");
		}
		ent.close();
	}

}
