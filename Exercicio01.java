package exerciciosManzano;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número para saber a tabuada");
		
		int num = sc.nextInt();
		int contadora=1;
		
		while(contadora<11) {
			System.out.println(num+" X "+contadora+" = "+num*contadora);
			contadora++;
		}
		sc.close();
	}

}
