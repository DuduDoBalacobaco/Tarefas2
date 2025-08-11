package Exercicios2;

import java.util.Scanner;

public class Ex031 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("PREÇOS ATÉ 5 KG, MORANGO R$ 2,50 E MAÇÃ R$ 1,80");
		System.out.println("PREÇOS ACIMA 5 KG, MORANGO R$ 2,20 E MAÇÃ R$ 1,50");

		System.out.print("Digite a quantidade de kg de morango que você deseja : ");
		double kgmo = ent.nextDouble();
		System.out.print("Digite a quantidade de kg de maçã que você deseja : ");
		double kgma = ent.nextDouble();
		double kgt = kgmo + kgma;

		if (kgma <= 5 && kgmo <= 5) {
			
		double valorma = kgma * 1.80;
		double valormo = kgmo * 2.50;
		double valort = valormo + valorma;
			if (valort > 25 || kgt > 8) {
				double desc = valort * 10/100;
				valort = valort - desc;
				System.out.println("O valor total deu R$ " + valort);
			}else {
				System.out.println("O valor total deu R$ " + valort);
			}
		}
		if (kgma > 5 && kgmo <= 5) {
			
			double valorma = kgma * 1.50;
			double valormo = kgmo * 2.50;
			double valort = valormo + valorma;
				if (valort > 25 || kgt > 8) {
					double desc = valort * 10/100;
					valort = valort - desc;
					System.out.println("O valor total deu R$ " + valort);
				}else {
					System.out.println("O valor total deu R$ " + valort);
				}
		}
		if (kgma <= 5 && kgmo > 5) {
			
			double valorma = kgma * 1.80;
			double valormo = kgmo * 2.20;
			double valort = valormo + valorma;
				if (valort > 25 || kgt > 8) {
					double desc = valort * 10/100;
					valort = valort - desc;
					System.out.println("O valor total deu R$ " + valort);
				}else {
					System.out.println("O valor total deu R$ " + valort);
				}
		}
		if (kgma > 5 && kgmo > 5) {
			
			double valorma = kgma * 1.50;
			double valormo = kgmo * 2.20;
			double valort = valormo + valorma;
				if (valort > 25 || kgt > 8) {
					double desc = valort * 10/100;
					valort = valort - desc;
					System.out.println("O valor total deu R$ " + valort);
				}else {
					System.out.println("O valor total deu R$ " + valort);
				}
		}
		ent.close();

	}

}
