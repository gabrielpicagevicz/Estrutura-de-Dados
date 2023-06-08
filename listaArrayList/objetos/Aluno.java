package objetos;

public class Aluno {

	private String nome;
    private int ra;
    private int idade;
    private double coeficiente;

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", ra=" + ra + ", idade=" + idade + " coeficiente: "+coeficiente+ "]\n";
    }

    public Aluno(int ra, String nome, int idade, double coeficiente) {
        super();
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
		this.coeficiente = coeficiente;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}

}