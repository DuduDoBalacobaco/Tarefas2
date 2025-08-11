package Exercicios2;
import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite uma vogal :");
		char vogal = ent.next().charAt(0);
		
		switch (vogal) {
		
		case 'a': case 'A' :
			System.out.println("A letra é vogal");
			break;
		case 'e': case 'E' :
			System.out.println("A letra é vogal");
			break;
		case 'i': case 'I' :
			System.out.println("A letra é vogal");
			break;
		case 'o': case 'O' :
			System.out.println("A letra é vogal");
			break;
		case 'u': case 'U' :
			System.out.println("A letra é vogal");
			break;
		default:
			System.out.println("É uma consoante");

		}
		ent.close();
	}

}
