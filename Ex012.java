package Exercicios2;
import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite seu salário : ");
		float sal = ent.nextFloat();
		
		if (sal < 280) {
			float perc = 20;
			float aumento = sal * perc/100;
			float sal_aumento = sal + aumento;
			System.out.println("Salario antigo : R$ " + sal);
			System.out.println("Salario novo : R$ " + sal_aumento);
			System.out.println("Aumento de  : R$ " + aumento);
			System.out.println("percentual de aumento : " + perc + " %");
			ent.close();
		}
		if (sal < 700 && sal >= 280) {
			float perc = 15;
			float aumento = sal * perc/100;
			float sal_aumento = sal + aumento;
			System.out.println("Salario antigo : R$ " + sal);
			System.out.println("Salario novo : R$ " + sal_aumento);
			System.out.println("Aumento de  : R$ " + aumento);
			System.out.println("percentual de aumento : " + perc + " %");
			ent.close();
		}
		if (sal < 1500 && sal >= 700) {
			float perc = 10;
			float aumento = sal * perc/100;
			float sal_aumento = sal + aumento;
			System.out.println("Salario antigo : R$ " + sal);
			System.out.println("Salario novo : R$ " + sal_aumento);
			System.out.println("Aumento de  : R$ " + aumento);
			System.out.println("percentual de aumento : " + perc + " %");
			ent.close();
		}
		if (sal >= 1500) {
			float perc = 5;
			float aumento = sal * perc/100;
			float sal_aumento = sal + aumento;
			System.out.println("Salario antigo : R$ " + sal);
			System.out.println("Salario novo : R$ " + sal_aumento);
			System.out.println("Aumento de  : R$ " + aumento);
			System.out.println("percentual de aumento : " + perc + " %");
			ent.close();
		}
		
		
		
	}

}
