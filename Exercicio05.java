package exerciciosManzano;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int expoente=0;
		while(expoente<=15) {
			double result = Math.pow(3, expoente);
			System.out.println("3^"+expoente+" = "+result);
			expoente++;
		}

	}

}
