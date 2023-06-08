
import java.util.List;

public class Livro {
	private String nomeLivro, autor;
	private List<String> conteudo;
	private int anoPublicacao;
	private int qtePalavras;

	public Livro(String nomeLivro, String autor, List<String> conteudo, int anoPublicacao, int qtePalavras) {
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.conteudo = conteudo;
		this.anoPublicacao = anoPublicacao;
		this.qtePalavras = qtePalavras;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getQtePalavras() {
		return qtePalavras;
	}

	public void setQtePalavras(int qtePalavras) {
		this.qtePalavras = qtePalavras;
	}

	public void setConteudo(List<String> conteudo) {
		this.conteudo = conteudo;
	}

	public List<String> getConteudo() {
		return conteudo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoPublicacao;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
		result = prime * result + ((nomeLivro == null) ? 0 : nomeLivro.hashCode());
		result = prime * result + qtePalavras;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (anoPublicacao != other.anoPublicacao)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (conteudo == null) {
			if (other.conteudo != null)
				return false;
		} else if (!conteudo.equals(other.conteudo))
			return false;
		if (nomeLivro == null) {
			if (other.nomeLivro != null)
				return false;
		} else if (!nomeLivro.equals(other.nomeLivro))
			return false;
		if (qtePalavras != other.qtePalavras)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nO livro: " + nomeLivro + 
				" tem como autor " + autor + 
				" e foi lançado em " + anoPublicacao+ 
				" e tem um total de " + qtePalavras + 
				" palavras! ";
	}
}