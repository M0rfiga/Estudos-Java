import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para conversão de temperaturas entre Celsius e Fahrenheit.
 * Este código demonstra o uso de Scanner para entrada de dados e try-catch para validação.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Inicializa o Scanner para ler a entrada do usuário pelo console
        Scanner teclado = new Scanner(System.in);

        // --- ATIVIDADE A: Converter Celsius para Fahrenheit ---
        double Celsius = 0;
        double TFahrenheit = 0;

        try {
            System.out.print("Digite a temperatura em Celsius que deseja converter para Fahrenheit: ");
            // Lê o valor numérico digitado
            Celsius = teclado.nextDouble();
            
            // Fórmula: F = (9 * C + 160) / 5
            TFahrenheit = (9 * Celsius + 160) / 5;
            
        } catch (InputMismatchException e) {
            // Caso o usuário digite texto em vez de números, o programa captura o erro
            System.out.print("ERRO: Digite um valor numérico");
            // Encerra a execução para evitar cálculos com dados inválidos
            System.exit(0);
            e.printStackTrace(); 
        }
        
        // Exibe o resultado formatado com duas casas decimais
        System.out.printf("A temperatura convertida para Fahrenheit é: %.2f \n", TFahrenheit);

        // --- ATIVIDADE B: Converter Fahrenheit para Celsius ---
        System.out.print("Agora digite a temperatura que deseja converter de Fahrenheit para Celsius: ");
        double Fahrenheit = 0;

        try {
            // Captura a nova entrada do usuário
            Fahrenheit = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("ERRO: Digite um valor numérico");
            System.exit(0);
            e.printStackTrace();
        }

        // Fórmula: C = ((F - 32) * 5) / 9
        double TCelsius = ((Fahrenheit - 32) * 5) / 9;
        
        // Exibe o resultado final da segunda conversão
        System.out.printf("A temperatura convertida para Celsius é: %.2f", TCelsius);

        // Fecha o objeto Scanner para liberar os recursos do sistema
        teclado.close();
    }
}