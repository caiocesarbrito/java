package ArqDeSoftware;

public class Jogador {

	private String nome;
	private String posicao;
	private int idade;
	private Arremessar acao;

	public Jogador(String nome, String posicao, int idade) {
		this.nome = nome;
		this.posicao = posicao;
		this.idade = idade;
		
		switch (posicao) {
		case "goleiro":
			acao = new Arremessar();
			break;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void jogar() {
		acao.jogar(this);

	}

}
