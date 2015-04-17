public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Caio", "102.608.814-30", 1200, 123, 15);

		System.out.println("Nome: " + gerente1.getNome());
		System.out.println("CPF: " + gerente1.getCpf());
		System.out.println("Salario: " + gerente1.getSalario());
		System.out.println("Senha: " + gerente1.getSenha());
		System.out.println("Nº de funcionários: "
				+ gerente1.getNumeroDeFuncionariosGerenciados());

	}

}
