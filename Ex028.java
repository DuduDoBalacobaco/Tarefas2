package Exercicios2;
import java.util.Scanner;

public class Ex028 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Calculadora com 2 números inteiros ");
		System.out.print("Forneça o primeiro número : ");
		int n1 = ent.nextInt(); 
		System.out.print("Forneça o segundo número : ");
		int n2 = ent.nextInt();
		System.out.print("selecione a opção: 1-Soma 2-Sub 3-Mult 4-Div : ");
		int opcao = ent.nextInt();
		
		switch(opcao) {
		
		case 1:
			double soma = n1+n2;
			System.out.println("A soma deu " + soma);
			if (soma >= 0) {
				System.out.println("O número é positivo");
			}else {
				System.out.println("O número é negativo");
			}
			if (soma % 2 == 0 ) {
				System.out.println("O número é par");
			}else {
				System.out.println("O número é impar");
			}
			if (Math.floor(soma) != soma){
				System.out.println("O número é decimal");
			}else {
				System.out.println("O número é inteiro");
			}
			break;
		case 2:
			double sub = n1-n2;
			System.out.println("A subtração deu " + sub);
			if (sub >= 0) {
				System.out.println("O número é positivo");
			}else {
				System.out.println("O número é negativo");
			}
			if (sub % 2 == 0 ) {
				System.out.println("O número é par");
			}else {
				System.out.println("O número é impar");
			}
			if (Math.floor(sub) != sub){
				System.out.println("O número é decimal");
			}else {
				System.out.println("O número é inteiro");
			}
			break;
		case 3:
			double mult = n1*n2;
			System.out.println("A multiplicação deu " + mult);
			if (mult >= 0) {
				System.out.println("O número é positivo");
			}else {
				System.out.println("O número é negativo");
			}
			if (mult % 2 == 0 ) {
				System.out.println("O número é par");
			}else {
				System.out.println("O número é impar");
			}
			if (Math.floor(mult) != mult){
				System.out.println("O número é decimal");
			}else {
				System.out.println("O número é inteiro");
			}
			break;
		case 4:
			if (n2 != 0) {
				
				float div = (float)n1/n2;
				System.out.println("A divisão deu " + div);
				if (div >= 0) {
					System.out.println("O número é positivo");
				}else {
					System.out.println("O número é negativo");
				}
				if (div % 2 == 0 ) {
					System.out.println("O número é par");
				}else {
					System.out.println("O número é impar");
				}
				if (Math.floor(div) != div){
					System.out.println("O número é decimal");
				}else {
					System.out.println("O número é inteiro");
				}
				break;
			}else {
				System.out.println("Erro divisão por zero");
			}
			default:
				System.out.println("Opção inválida");
		}
		ent.close();
	}

}
