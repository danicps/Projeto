package cartoesFuncionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaEmpregados {

		private static Map<String, Empregado> funcionarios = new HashMap<>();
		private static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
        	
            System.out.println("\nBem-vindo, ao Sistema de Cadastro de Funcionários!");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Procurar Funcionário por CPF");
            System.out.println("3 - Sair");
            System.out.print("\nEscolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    procurarFuncionarioPorCPF();
                    break;
                case 3:
                    System.out.println("\nEncerrando o sistema, até mais...");
                    executando = false;
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }

        private static void cadastrarFuncionario() {
        	
        	System.out.println("\nCadastro de Novo Funcionário");
    		System.out.print("CPF: ");
    		String cpf = scanner.nextLine();
    		System.out.print("Nome: ");
    		String nome = scanner.nextLine();
    		System.out.print("Idade: ");
    		int idade = scanner.nextInt();
    		scanner.nextLine(); 
    		System.out.print("Alergias: ");
    		String alergias = scanner.nextLine();
    		System.out.print("Problemas de Saúde: ");
    		String problemasDeSaude = scanner.nextLine();
    		System.out.print("Telefone: ");
    		String telefone = scanner.nextLine();
    		System.out.print("Email: ");
    		String email = scanner.nextLine();

        Empregado novoFuncionario = new Empregado( nome, cpf, idade, alergias, problemasDeSaude, telefone, email);
        funcionarios.put (cpf, novoFuncionario);

        System.out.println("\nFuncionário cadastrado com sucesso!");
    }

        private static void procurarFuncionarioPorCPF() {
        System.out.print ("\nDigite o CPF do funcionário:");
        String cpf = scanner.nextLine();

        if (funcionarios.containsKey(cpf)) {
            Empregado funcionario = funcionarios.get(cpf);
            System.out.println ("\nInformações do Funcionário");
            funcionario.imprimirInformacoes();
        }
        	else {
            System.out.println("\nFuncionário não encontrado com o CPF informado.");
        }
    }
}