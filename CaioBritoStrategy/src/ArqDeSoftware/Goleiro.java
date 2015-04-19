package ArqDeSoftware;

public class Goleiro extends Jogador {
	private Defender acao;
	
	public Goleiro(String nome, String posicao) {
		super(nome, posicao);
		
		switch (posicao) {
		case "goleiro":
			acao = new Defender();
			break;
		}
		
	}
	public void defender() {
		acao.jogar(this);

	}


}
