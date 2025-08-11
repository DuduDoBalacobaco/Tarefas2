package Exercicios2;
import java.util.Scanner;

public class Ex029 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int n = 0;
		int contador = 0;
		while (n != 1 && n != 2) {
			System.out.print("Telefonou para a vítima ? 1-Sim 2- Não : ");
			n = ent.nextInt();
			if (n==1) {
				contador = contador + 1;
				}
		}
		n = 0;
		while (n != 1 && n != 2) {
			System.out.print("Esteve no local do crime ? 1-Sim 2- Não : ");
			n = ent.nextInt();
			if (n==1) {
				contador = contador + 1;
				}
		}
		n = 0;
		while (n != 1 && n != 2) {
			System.out.print("Mora perto da vítima ? 1-Sim 2- Não : ");
			n = ent.nextInt();
			if (n==1) {
				contador = contador + 1;
				}
		}
		n = 0;
		while (n != 1 && n != 2) {
			System.out.print("Devia para a vítima ? 1-Sim 2- Não : ");
			n = ent.nextInt();
			if (n==1) {
				contador = contador + 1;
				}
		}
		n = 0;
		while (n != 1 && n != 2) {
			System.out.print("Já trabalhou com a vítima ? 1-Sim 2- Não : ");
			n = ent.nextInt();
			if (n==1) {
				contador = contador + 1;
				}
		}
		switch(contador) {
		case 1:
			System.out.println("Inocente");
			break;
		case 2:
			System.out.println("Suspeito");
			break;
		case 3: case 4:
			System.out.println("Cúmplice");
			break;
		case 5 : 
			System.out.println("Assassino");
			break;
			default:
				System.out.println("Ocooreu algum erro");
		}
		ent.close();
	}

}
