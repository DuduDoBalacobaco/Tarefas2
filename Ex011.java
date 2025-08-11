package Exercicios2;
import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o turno em que você estuda : M-Matutino V-Vespertino N-Noturno ");
		char turn = ent.next().charAt(0);
		
		switch(turn) {
		
		case 'm' : case 'M' :
			System.out.println(" Bom dia ");
		break;
		case 'v' : case 'V' :
			System.out.println(" Boa tarde ");
		break;
		case 'n' : case 'N' :
			System.out.println(" Boa noite ");
		}
		ent.close();
	}

}
