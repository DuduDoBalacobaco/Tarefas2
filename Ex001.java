package Exercicios2;
import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro : ");
		int n1 = ent.nextInt();
		
		System.out.print("Digite um numero inteiro : ");
		int n2 = ent.nextInt();
		
		if (n1 > n2) {
			System.out.println("O numero " + n1 + " é maior");
		}	
			if (n2 > n1) {
				System.out.println("O numero " + n2 + " é maior");
			}	
				if (n1 == n2) {
					System.out.println("Os numeros sao iguais");
				}
			ent.close();
	}
	
		
}
