package Exercicios2;
import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Calculadora de segundo grau");
		
		System.out.print("Digite o valor de A : ");
		double a = ent.nextDouble();
		
		if (a != 0) {
			
			System.out.print("Digite o valor de B : ");
			double b = ent.nextDouble();
			System.out.print("Digite o valor de C : ");
			double c = ent.nextDouble();
			
			double delta = (b*b)-4*a*c;
			
			if (delta < 0 ) {
				System.out.println("Delta negativo e não possui raízes reais");
			}
			if (delta ==  0) {
				double resp = -b/2*a;
				System.out.println("O delta é igual a zero e possui apenas uma raíz que é " + resp);
			}
			if (delta > 0) {
				double rz1 = (-b + Math.sqrt(delta))/2*a;
				double rz2 = (-b - Math.sqrt(delta))/2*a;
				System.out.println("O delta é positivo e deu duas raizes uma igual a " + rz1 + " e outra igual a " + rz2);
			}
		}else {
			System.out.println("'A' igual à zero, não é equação de segundo grau");
		}
		ent.close();

	}

}
