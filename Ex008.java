package Exercicios2;
import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
			
			System.out.print("Digite a primeira nota : ");
			double nota1 = ent.nextDouble();
			
			System.out.print("Digite a segunda nota : ");
			double nota2 = ent.nextDouble();
			
			if ((nota1 + nota2)/2 >= 7) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
			ent.close();
	}

}
