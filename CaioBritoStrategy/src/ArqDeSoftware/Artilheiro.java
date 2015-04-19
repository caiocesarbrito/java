package ArqDeSoftware;

public class Artilheiro extends Jogador {

	private Arremessar acao;
	
	public Artilheiro(String nome, String posicao) {
		super(nome, posicao);
		
		switch (posicao) {
		case "artilheiro":
			acao = new Arremessar();
			break;
		}
		
	}
	public void marcar() {
		acao.jogar(this);

	}

}
