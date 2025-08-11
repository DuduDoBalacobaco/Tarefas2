package Exercicios2;
import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.print("Digite um numero inteiro : ");
		int n = ent.nextInt();

		if (n % 2 == 0) {
			int impar = n + 1; 
			System.out.println("O número é " + n + " e agora é " + impar);
		} 
		if (n % 2 == 1) {
			int par= n + 1;
			System.out.println("O número é " + n + " e agora é " + par);
		}
		ent.close();

	}

}
