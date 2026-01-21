import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa para cálculo de insumos (ingredientes) para produção de sanduíches.
 * Calcula o peso total necessário de mussarela, presunto e carne.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Variável inteira para armazenar a quantidade de unidades
        int sanduiche = 0;
    
        // Inicializa o Scanner para leitura de dados
        Scanner teclado = new Scanner(System.in);

        // --- ENTRADA DE DADOS ---
        try {
            System.out.print("Digite a quantidade de sanduiches: ");
            // Captura o número de sanduíches
            sanduiche = teclado.nextInt();

        } catch (InputMismatchException e) {
            // Tratamento caso o usuário não digite um número inteiro
            System.out.print("ERRO: Digite um valor numérico");
            System.exit(0); // Encerra o programa em caso de erro
        }
        
        // --- PROCESSAMENTO (CÁLCULO DOS PESOS) ---
        // Lógica: Cada sanduíche leva uma quantidade fixa em kg
        double mussarela = 0.1 * sanduiche;    // 100g por sanduíche
        double presunto = 0.05 * sanduiche;    // 50g por sanduíche
        double hamburger = 0.120 * sanduiche;  // 120g por sanduíche

        // --- SAÍDA DE DADOS ---
        System.out.println("Para produzir " + sanduiche + " sanduiches serao necessarios:");
        
        // Uso do printf para formatação numérica:
        // %.2f -> Formata para 2 casas decimais (ponto flutuante)
        // \n   -> Pula para a próxima linha
        System.out.printf("%.2f kgs de mussarela\n", mussarela); 
        System.out.printf("%.2f kgs de presunto\n", presunto); 
        System.out.printf("%.2f kgs de hamburger\n", hamburger); 

        // Fecha o recurso do teclado
        teclado.close();
    }
}