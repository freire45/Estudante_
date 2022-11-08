package br.com.erickfreire.estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante("Erick Freire", 92.5);
		Estudante estudante2 = new Estudante("Maria Fernandes", 70.00);
		
		System.out.printf("A nota do %s é igual a %s%n", estudante1.getNome(), estudante1.letraNota());
		System.out.printf("A nota do %s é igual a %s%n", estudante2.getNome(), estudante2.letraNota());

	}

}
