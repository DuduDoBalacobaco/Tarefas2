package Exercicios2;
import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um ano com 4 digitos : ");
		int ano = ent.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("O ano " + ano + " é bissexto");
		}
			else {
				System.out.println("O ano " + ano + " não é bissexto");
			}
		ent.close();
	}

}
