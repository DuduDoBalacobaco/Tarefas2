package Exercicios2;
import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o valor que você ganha por hora : ");
		float valor = ent.nextFloat();
		
		System.out.print("Digite a quantidade de horas que você trabalhou no mês : ");
		float hora = ent.nextFloat();
		
		float sal = hora*valor;
		if (sal <= 900) {
			String  ir = "isento";
			float inss = sal*10/100;
			float fgts = sal*11/100;
			float desc = inss;
			float sal_liquido = sal - inss;
			
			System.out.println("Sálario : R$ " + sal);
			System.out.println("INSS: R$ " + inss);
			System.out.println("FGTS : R$ " + fgts);
			System.out.println("IR : " + ir);
			System.out.println("Descontos : R$ " + desc);
			System.out.println("Sálario liquído : R$ " + sal_liquido);
			
		}
		if (sal > 900 && sal <= 1500) {
			float  ir = sal * 5/100 ;
			float inss = sal*10/100;
			float fgts = sal*11/100;
			float desc = inss + ir;
			float sal_liquido = sal - inss - ir;
			
			System.out.println("Sálario : R$ " + sal);
			System.out.println("INSS: R$ " + inss);
			System.out.println("FGTS : R$ " + fgts);
			System.out.println("IR : " + ir);
			System.out.println("Descontos : R$ " + desc);
			System.out.println("Sálario liquído : R$ " + sal_liquido);
			
		}
		if (sal > 1500 && sal <= 2500) {
			float  ir = sal * 10/100 ;
			float inss = sal*10/100;
			float fgts = sal*11/100;
			float desc = inss + ir;
			float sal_liquido = sal - inss - ir;
			
			System.out.println("Sálario : R$ " + sal);
			System.out.println("INSS: R$ " + inss);
			System.out.println("FGTS : R$ " + fgts);
			System.out.println("IR : " + ir);
			System.out.println("Descontos : R$ " + desc);
			System.out.println("Sálario liquído : R$ " + sal_liquido);
			
		}
		if (sal > 2500) {
			float  ir = sal * 20/100 ;
			float inss = sal*10/100;
			float fgts = sal*11/100;
			float desc = inss + ir;
			float sal_liquido = sal - inss - ir;
			
			System.out.println("Sálario : R$ " + sal);
			System.out.println("INSS: R$ " + inss);
			System.out.println("FGTS : R$ " + fgts);
			System.out.println("IR : " + ir);
			System.out.println("Descontos : R$ " + desc);
			System.out.println("Sálario liquído : R$ " + sal_liquido);
			
		}
		ent.close();
	}

}
