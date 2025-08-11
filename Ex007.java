package Exercicios2;
import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um numero : ");
		int n1 = ent.nextInt();
		
		System.out.print("Digite outro numero : ");
		int n2 = ent.nextInt();
		
		System.out.print("Digite um último numero : ");
		int n3 = ent.nextInt();
		
		int maior = n1;
		int menor = n1;
		int meio = n1;
		
		if(maior < n2) {
			maior = n2;
		}
		if(maior < n3) {
			maior = n3;
		}
		if(menor > n2) {
			menor = n2;
		}
		if(menor > n3) {
			menor = n3;
		}
		if(maior > n2 && menor < n2) {
			meio = n2;
		}
		if(maior > n3 && menor < n3) {
			meio = n3;
		}
		System.out.println("O maior número é " + maior + " , o  menor é " + menor + " e o do meio é " + meio);
		ent.close();
	}

}
