package cartoesFuncionarios;

public class Empregado {
    private String nome;
    private int idade;
    private String cpf;
    private String alergias;
    private String problemasDeSaude;
    private String telefone;
    private String email;

    public Empregado(String nome, String cpf, int idade, String alergias, String problemasDeSaude, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.alergias = alergias;
        this.problemasDeSaude = problemasDeSaude;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getProblemasDeSaude() {
        return problemasDeSaude;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

	public void imprimirInformacoes() {
		
		System.out.println("Nome: " + nome);
	    System.out.println("CPF: " + cpf);
	    System.out.println("Idade: " + idade);
	    System.out.println("Alergias: " + alergias);
	    System.out.println("Problemas de Saúde: " + problemasDeSaude);
	    System.out.println("Telefone: " + telefone);
	    System.out.println("Email: " + email);
	}
    
}