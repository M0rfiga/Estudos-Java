import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para classificação de faixa etária.
 * Categoriza o usuário entre Criança, Adolescente, Adulto ou Idoso com base na idade.
 */
public class Codigo04 {
    public static void main(String[] args) {
        // Inicializa o Scanner para capturar a entrada do usuário
        Scanner teclado = new Scanner(System.in);
        int idade = 0;

        System.out.print("Digite a sua idade: ");

        // --- TRATAMENTO DE ERRO DE ENTRADA ---
        try {
            // Tenta ler a idade como um número inteiro
            idade = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um valor numérico");
            // Nota: Sem um 'return' ou 'System.exit', o código continuará com idade = 0
        } catch (Exception e) {
            System.out.println("ERRO DESCONHECIDO");
        }

        // --- LÓGICA DE CLASSIFICAÇÃO (IF-ELSE IF) ---
        // A ordem aqui é fundamental: o Java para na primeira condição verdadeira.
        
        if (idade < 0) {
            // Validação para números negativos
            System.out.println("Idade inválida.");
        } else if (idade < 12) {
            // Faixa: $0 \leq idade < 12$
            System.out.println("Criança");
        } else if (idade < 18) {
            // Faixa: $12 \leq idade < 18$
            System.out.println("Adolescente");
        } else if (idade < 60) {
            // Faixa: $18 \leq idade < 60$
            System.out.println("Adulto");
        } else {
            // Faixa: $idade \geq 60$
            System.out.println("Idoso");
        }

        // Fecha o scanner para liberar recursos
        teclado.close();
    }
}