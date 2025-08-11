package Exercicios2;
import java.util.Scanner;

public class Ex026 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um némero inteiro e direi se é par ou ímpar : ");
		int num = ent.nextInt();
		
		if (num != 0) {
			if(num % 2 == 0) {
				System.out.println("O número é par");
			}else {
				System.out.println("O número é ímpar");
			}
		}else {
			System.out.println("O número é igual a zero");
		}
		ent.close();

	}

}
