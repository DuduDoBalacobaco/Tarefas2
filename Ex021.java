package Exercicios2;
import java.util.Scanner;

public class Ex021 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite uma data no formato dd/mm/aaaa");
		System.out.print("Digite o dia : ");
		int dia = ent.nextInt();
		System.out.print("Digite o mês : ");
		int mes = ent.nextInt();
		System.out.print("Digite o ano : ");
		int ano = ent.nextInt();
			System.out.println(dia + " / " + mes + " / " + ano);
			if (dia >= 1 && dia <=31) {
				if (mes >= 1 && mes <= 12) {
					if (mes == 2 && dia > 28) {
						System.out.println("Data inválida");
					}else if (ano >= 1 && ano <= 2025) {
						System.out.println("Data válida");
						
					}else {
						System.out.println("Data inválida");
					}
				}else {
					System.out.println("Data inválida");
				}
				
			}else {
				System.out.println("Data inválida");
			}
		
		ent.close();
	
	}

}
