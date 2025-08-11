package Exercicios2;
import java.util.Scanner;

public class Ex024 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota : ");
		int n1 = ent.nextInt();
		System.out.print("Digite a segunda nota : ");
		int n2 = ent.nextInt();
		System.out.print("Digite a terceira nota : ");
		int n3 = ent.nextInt();
		
		double media = (n1 + n2 + n3)/3;
		
		if (media < 7) {
			System.out.println("Reprovado");
		}
		if (media >= 7 && media != 10) {
			System.out.println("Aprovado");
		}
		if (media >= 10) {
			System.out.println("Aprovado com Distinção");
		}
		ent.close();


	}

}
