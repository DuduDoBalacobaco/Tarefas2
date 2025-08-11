package Exercicios2;
import java.util.Scanner;

public class Ex030 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("G-Gasolina ou A-Álcool : ");
		char op = ent.nextLine().charAt(0);

		switch (op) {
		case 'a': case 'A':
			System.out.println("Até 20 litros 3% de desconto, acima disso 5% de desconto");
			System.out.println("Digite a quantidade de álcool à abastecer : ");
			int quant = ent.nextInt();
			if (quant <= 20) {

				double preco = quant * 1.90;
				double desc = preco * 3 / 100;
				double fim = preco - desc;
				System.out.println("Valor à ser pago : " + fim);
			} else {
				double preco = quant * 1.90;
				double desc = preco * 5 / 100;
				double fim = preco - desc;
				System.out.println("Valor à ser pago : " + fim);
				break;
			}
		case 'g': case 'G':
			System.out.println("Até 20 litros 4% de desconto, acima disso 6% de desconto");
			System.out.println("Digite a quantidade de gasolina à abastecer : ");
			quant = ent.nextInt();
			if (quant <= 20) {

				double preco = quant * 2.50;
				double desc = preco * 4 / 100;
				double fim = preco - desc;
				System.out.println("Valor à ser pago : " + fim);
			} else {
				double preco = quant * 2.50;
				double desc = preco * 6 / 100;
				double fim = preco - desc;
				System.out.println("Valor à ser pago : " + fim);
				break;
			}
			default:
				System.out.println("Opção inválida");
		}
		ent.close();

	}

}
