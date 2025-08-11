package Exercicios2;
import java.util.Scanner;

public class Ex023 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite a idade de um dos alunos : ");
		int ida1 = ent.nextInt();
		System.out.print("Digite a idade de outro aluno : ");
		int ida2 = ent.nextInt();
		System.out.print("Digite a idade de outro aluno : ");
		int ida3 = ent.nextInt();
		
		int media = (int)(ida1 + ida2 + ida3)/3;
		
		if (media < 25) {
			System.out.println("Turma Jovem");
		}
		if (media >= 25 && media < 40) {
			System.out.println("Turma Adulta");
		}
		if (media >= 40) {
			System.out.println("Turma Idosa");
		}
		ent.close();

	}

}
