package Exercicios2;
import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.print("Digite o valor do produto : ");
		float val = ent.nextFloat();
		System.out.print("Digite um numero correspondente a seu produto : ");
		int num = ent.nextInt();

		switch (num) {
		case 1:
			System.out.println("Produto de valor R$ " + val + " de origem do Sul");
			break;
		case 2:
			System.out.println("Produto de valor R$ " + val + " de origem do Norte");
			break;
		case 3:
			System.out.println("Produto de valor R$ " + val + " de origem do Leste");
			break;
		case 4:
			System.out.println("Produto de valor R$ " + val + " de origem do Oeste");
			break;
		case 5: case 6:
			System.out.println("Produto de valor R$ " + val + " de origem do Nordeste");
			break;
		case 7: case 8:
			System.out.println("Produto de valor R$ " + val + " de origem do Centro-Oeste");
			break;
		default:
			System.out.println("Produto de valor R$ " + val + " de origem importada");
		}
		ent.close();
	}

}
