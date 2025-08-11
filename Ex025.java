package Exercicios2;
import java.util.Scanner;

public class Ex025 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Não tem moedas");
		System.out.print("Digite a quantidade do valor que gostaria de sacar (minimo de 10 e maximo de 600) : ");
		int valor = ent.nextInt();
		
		if (valor >= 10 && valor <= 600) {
			int notas_100 = (int) valor / 100;
			int notas_50 = (int) (valor % 100) / 50;
			int notas_10 = (int) ((valor % 100)% 50) / 10;
			int notas_5 = (int) (((valor % 100)% 50) % 10) / 5;
			int notas_1 = (int) ((((valor % 100)% 50) % 10) % 5) / 1;
			
			System.out.println("Serão fornecidas");
			if (notas_100 > 0) {
				System.out.println(notas_100 + " notas de 100");
			}
			if (notas_50 > 0) {
				System.out.println(notas_50 + " notas de 50");
			}
			if (notas_10 > 0) {
				System.out.println(notas_10 + " notas de 10");
			}
			if (notas_5 > 0) {
				System.out.println(notas_5 + " notas de 5");
			}
			if (notas_1 > 0) {
				System.out.println(notas_1 + " notas de 1");
			}
		}else {
			System.out.println("Valor inválido");
		}
		ent.close();
		

	}

}
