package Exercicios2;
import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite seu genero : M - masculino e F - feminino ");
		char gen = ent.next().charAt(0);
		System.out.print("Digite seu peso em KG : ");
		double peso = ent.nextDouble();
		System.out.print("Digite sua altura em cm : ");
		double alt = ent.nextDouble();
		double h = alt/100;
		
		switch (gen) {
		
		case 'f' : case 'F' :
			double peso_ideal = (62.1*h)-44.7;
			
		System.out.println("Sexo : " + gen);
		System.out.println("Peso : " + peso);
		System.out.println("Altura : " + h);
		System.out.println("Peso ideal : " + peso_ideal);
		
		if (peso_ideal > peso) {
			System.out.println("Você está abaixo do peso ideal");
		} else {
			System.out.println("Você está acima do peso ideal");
			break;
		}
		case 'm' : case 'M' :
			double peso_idealM = (72.7*h)-58;
			
		System.out.println("Sexo : " + gen);
		System.out.println("Peso : " + peso);
		System.out.println("Altura : " + h);
		System.out.println("Peso ideal : " + peso_idealM);
		
		if (peso_idealM > peso) {
			System.out.println("Você está abaixo do peso ideal");
		} else {
			System.out.println("Você está acima do peso ideal");
		}
		}
		ent.close();
		

	}

}
