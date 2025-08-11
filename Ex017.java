package Exercicios2;
import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite sua primeira nota : ");
		double n1 = ent.nextDouble();
		
		System.out.print("Digite sua segunda nota : ");
		double n2 = ent.nextDouble();
		
		double media = (n1+n2)/2;
		
		if (media >= 9 && media <= 10) {
			System.out.println("Você tirou A");
			System.out.println("Suas notas foram " + n1 + " e " + n2);
			System.out.println("Sua média foi de " + media);
			System.out.println("Aprovado");
		}
		if (media >= 7.5 && media < 9) {
			System.out.println("Você tirou B");
			System.out.println("Suas notas foram " + n1 + " e " + n2);
			System.out.println("Sua média foi de " + media);
			System.out.println("VAprovado");
		}
		if (media >= 6 && media < 7.5) {
			System.out.println("Você tirou C");
			System.out.println("Suas notas foram " + n1 + " e " + n2);
			System.out.println("Sua média foi de " + media);
			System.out.println("Aprovado");
		}
		if (media >= 4 && media < 6) {
			System.out.println("Você tirou D");
			System.out.println("Suas notas foram " + n1 + " e " + n2);
			System.out.println("Sua média foi de " + media);
			System.out.println("Reprovado");
		}
		if (media >= 0 && media < 4 ) {
			System.out.println("Você tirou E");
			System.out.println("Suas notas foram " + n1 + " e " + n2);
			System.out.println("Sua média foi de " + media);
			System.out.println("Reprovado");
		}
		ent.close();

	}

}
