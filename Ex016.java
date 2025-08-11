package Exercicios2;
import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite qual foi sua média : ");
		double media = ent.nextDouble();
		
		if (media >= 0 && media <= 3) {
			System.out.println("Reprovado");
		}
		if (media > 3 && media <= 6.9) {
			System.out.println("Em exame");
		}
		if (media >=7 && media <= 10) {
			System.out.println("Aprovado");
		}
		ent.close();

	}

}
