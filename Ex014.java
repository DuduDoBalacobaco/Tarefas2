package Exercicios2;
import java.util.Scanner;
	
public class Ex014 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um numero correspondente a um dia da semana : ");
		int num = ent.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Valor inválido");
			}
		ent.close();
		
		
		
	}

}
