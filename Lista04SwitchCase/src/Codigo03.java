import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Sistema de Menu para Gerenciamento de Usuários.
 * Demonstra o uso de branching (desvios) para criar um fluxo de navegação.
 */
public class Codigo03 {
    public static void main(String[] args) {
        // Inicializa o Scanner para capturar as escolhas do usuário
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        // --- INTERFACE VISUAL (MENU) ---
        System.out.println("MENU:");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Listar usuários");
        System.out.println("3 - Editar usuário");
        System.out.println("4 - Remover usuário");
        System.out.print("Escolha uma opção: ");

        // --- TRATAMENTO DE ERROS DE ENTRADA ---
        try {
            // Tenta capturar a opção numérica
            opcao = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um valor numérico");
            // Nota: Como não há um return aqui, o programa tentará seguir para o if abaixo
        } catch (Exception e) {
            System.out.println("ERRO DESCONHECIDO");
        }

        // --- VALIDAÇÃO DE INTERVALO ---
        // Garante que o switch só seja executado se a opção estiver entre 1 e 4
        // Em termos matemáticos: $0 < opcao < 5$
        if (opcao > 0 && opcao < 5) {
            
            // --- LÓGICA DE DIRECIONAMENTO (SWITCH) ---
            switch (opcao) {
                case 1: 
                    System.out.println("Cadastrar usuário");
                    // Futuro: chamar um método como cadastrarUsuario();
                    break;
                
                case 2: 
                    System.out.println("Listar usuários");
                    // Futuro: chamar um método como listarUsuarios();
                    break;
                
                case 3: 
                    System.out.println("Editar usuário");
                    // Futuro: chamar um método como editarUsuario();
                    break;
                
                case 4: 
                    System.out.println("Remover usuário");
                    // Futuro: chamar um método como removerUsuario();
                    break;
            }
        } else {
            // Executado se o número for 0, negativo ou maior que 4
            System.out.println("Opção inválida");
        }

        // Libera o recurso do sistema
        teclado.close();
    }
}