package listaArrayListGabrieljr;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Aluno;

/*
 * 3. Dado um ArrayList de Objetos Aluno(ra,nome,nascimento,coeficiente), escreva um programa Java para atualizar o nome do aluno(a) em uma posição específica do Arraylist
(dado por um índice).

 */
public class Ex03ObjetosAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		String nomeAlterar;

		System.out.printf("Informe um número p/ alterar o nome:\n");
		n = teclado.nextInt();
		System.out.printf("Informe um nome:\n");
		nomeAlterar = teclado.next();

		ArrayList<Aluno> alunos = new ArrayList<>();

		alunos.add(new Aluno(1234, "Gabriel", 19, 8.32));

		alunos.add(new Aluno(4321, "Facincani", 20, 10.32));

		alunos.add(new Aluno(445451, "Sormani", 22, 11.32));

		alunos.add(new Aluno(43123, "Benja", 18, 22.32));
		
		System.out.println(alunos);
		
		Aluno alterar = alunos.get(n);
		alterar.setNome(nomeAlterar);
		
		System.out.println(alunos);

	}

}
