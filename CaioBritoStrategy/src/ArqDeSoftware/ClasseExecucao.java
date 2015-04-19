package ArqDeSoftware;

public class ClasseExecucao {

	public static void main(String[] args) {
		Artilheiro artilheiro = new Artilheiro("Harry", "artilheiro");
		Goleiro goleiro = new Goleiro("Cassio", "goleiro");
		artilheiro.marcar();
		goleiro.defender();

	}

}
