package exerciciosManzano;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nComodos;
		double areaT = 0;
		
		System.out.println("Quantos comodos tem a residência: ");
		nComodos = sc.nextInt();
		int contador = 1;
		while(contador<=nComodos) {
			System.out.println("\nCômodo: "+contador);
			
			System.out.println("Nome do cômodo");
			String nomeComodo = sc.next();
			
			System.out.println("Largura do cômodo em metros: ");
			double largura = sc.nextDouble();
			
			System.out.println("Comprimento do cômodo em metros: ");
			double comprimento = sc.nextDouble();
			
			double areaComodo = largura*comprimento;
			System.out.println("Área do cômodo "+areaComodo+ " m²");
			areaT += areaComodo;
			contador++;
		}
		
		System.out.println("Área total da residencia "+areaT+ " m²");
		
		sc.close();

	}

}
