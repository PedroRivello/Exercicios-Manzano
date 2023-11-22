package exerciciosManzano;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int i, base, expoente, result=1;
		
		System.out.println("Digite o valor da base: ");
		base=sc.nextInt();
		
		System.out.println("Digite o valor do expoente: ");
		expoente=sc.nextInt();
		
		for(i=1;i<=expoente;i++) {
			result *=base;
		}
		
		System.out.println(base+" Elevado a "+expoente+" é igual a: "+result);
		
		sc.close();

	}

}
