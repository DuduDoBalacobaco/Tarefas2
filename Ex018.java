package Exercicios2;
import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um dos lados do triangulo : ");
		double l1 = ent.nextDouble();
		System.out.print("Digite o segundo lado do triangulo : ");
		double l2 = ent.nextDouble();
		System.out.print("Digite o ultimo lado do triangulo : ");
		double l3 = ent.nextDouble();
		
		if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
			if (l1==l2 && l2==l3) {
				System.out.println("O triângulo é equilátero");
			}
			if ((l1==l2 && l1!=l3 && l2!=l3) || (l2==l3 && l2!=l1 && l3!=l1 ) || (l3==l1 && l1!=l2 && l3!=l2)) {
				System.out.println("O triângulo é isósceles");
			}
			if (l1!=l2 && l2!=l3 && l3!=l1) {
				System.out.println("O triângulo é escaleno");
			}
		}else {
			System.out.println("Não é um triângulo");
		}
		ent.close();

	}

}
