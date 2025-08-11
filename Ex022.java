package Exercicios2;
import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro de 1 até 999 : ");
		int num = ent.nextInt();
		int cent = (int)num/100;
		int dez = (int)(num % 100) / 10;
		int uni = (int)(num % 100) % 10;
		
		if (num >= 1 && num <= 999) {
			System.out.println(cent + " centena(s)");
			System.out.println(dez + " dezena(s)");
			System.out.println(uni + " unidade(s)");
		}else {
			System.out.println("Número inválido");
		}
		ent.close();

	}

}
