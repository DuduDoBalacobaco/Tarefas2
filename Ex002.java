package Exercicios2;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro : ");
		int n = ent.nextInt();
		
		if (n % 2 == 0 && n != 0) {
			System.out.println("O número é par");
		}
		else if (n == 0) {
			System.out.println("O Número é igual a zero");
		}
		if (n % 2 == 1) {
			System.out.println("O número é impar");
		}
		ent.close();
	}
		
}
