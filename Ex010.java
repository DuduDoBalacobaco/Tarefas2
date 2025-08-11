package Exercicios2;
import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro : ");
		int n1 = ent.nextInt();
		System.out.print("Digite um numero inteiro : ");
		int n2 = ent.nextInt();
		System.out.print("Digite um numero inteiro : ");
		int n3 = ent.nextInt();
		
		int maior = n1;
		int menor = n1;
		
		if (n2 > maior) {
			maior = n2;
		}
		if (n2 < menor) {
			menor = n2;
		}
		if (n3 > maior) {
			maior = n3;
		}
		if (n3 < menor) {
			menor = n3;
		}
		System.out.println("O maior numero foi " + maior + " e o menor foi " + menor);
		ent.close();
	}

}
