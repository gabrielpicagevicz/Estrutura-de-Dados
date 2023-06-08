package ListasLigadasGabrieljunior;

public class TesteLista {
	
	public static void main(String []args) {
		
		ListaLigada<Integer> lista = new ListaLigada<>();
		ListaLigada<Integer> lista1 = new ListaLigada<>();
		lista.addInicio(1);
		
		lista.addInicio(5);
		
		lista.addInicio(7);
		
		lista.addFim(10);
		
		System.out.println(lista);
		
		System.out.println(lista.removeInicio());
		
		System.out.println(lista);
		
		ListaLigada<Aluno> lista2 = new ListaLigada<>();
		
		lista2.addFim(new Aluno("joao","2241"));
		lista2.addFim(new Aluno("ana","2399"));
		
		
		System.out.println(lista2);
		//contem o E;
		System.out.println("Contem o E: "+lista2.contem(null));
		
		//add elementos novos na lista1
		lista1.addInicio(1);lista1.addInicio(1);lista1.addInicio(1);lista1.addFim(1);
		//descomentar aqui p/ printar o adicionaTodosInicio.
		/*adiciona todos no inicio e printa;
		lista.adicionaTodosInicio(lista1);
		System.out.println("Todos no inicio: "+lista);*/
		//adiciona todos fim e printa;
		lista.adicionaTodosFim(lista1);
		System.out.println("Todos no fim: "+lista);

	}

}

