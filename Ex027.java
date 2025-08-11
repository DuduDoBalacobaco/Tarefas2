package Exercicios2;
import java.util.Scanner;

public class Ex027 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um número direi se é decimal ou inteiro : ");
		double num = ent.nextDouble();
		
		if (Math.floor(num) != num) {
			System.out.println("Este número é um decimal");
		}else {
			System.out.println("Este número é um inteiro");
		}
		ent.close();

	}

}
