package exerciciosManzano;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int soma=0;
		int contadora=1;
		while(contadora<501) {
			if(contadora%2==0) {
				soma=soma+contadora;
			}
			contadora++;
		}
		System.out.println("A soma dos primeiros números pares entre 1 e 500 é: "+soma);

	}

}
