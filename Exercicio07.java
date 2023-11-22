package exerciciosManzano;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int primeiroT=1;
		int segundoT=1;
		int i=1;
		
		System.out.println("Série de Fibonacc até o décimo quinto termo");
		
		while(i<=15) {
			System.out.println(primeiroT+" ");
			
			int proximoT = primeiroT+segundoT;
			primeiroT=segundoT;
			segundoT=proximoT;
			
			i++;
		}

	}

}
