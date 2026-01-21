import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa para cálculo de média escolar com quatro notas.
 * Inclui validação de intervalo (0-10) e atribuição de conceitos de A+ a F.
 */
public class Codigo02 {
    public static void main(String[] args) {
        // Inicializa o Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis para as quatro notas bimestrais/mensais
        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;

        // --- BLOCO DE ENTRADA ---
        try {
            // Leitura individual de 4 notas através do teclado
            System.out.print("Digite a nota 1 (0 a 10): ");
            nota1 = scanner.nextDouble();

            System.out.print("Digite a nota 2 (0 a 10): ");
            nota2 = scanner.nextDouble();

            System.out.print("Digite a nota 3 (0 a 10): ");
            nota3 = scanner.nextDouble();

            System.out.print("Digite a nota 4 (0 a 10): ");
            nota4 = scanner.nextDouble();

        } catch (InputMismatchException e) {
            // Captura erro caso o usuário digite texto em vez de números decimais
            System.out.println("ERRO: Digite um valor numérico");
        } catch (Exception e) {
            // Captura qualquer outra falha inesperada na leitura
            System.out.println("ERRO DESCONHECIDO");
        }

        // --- VALIDAÇÃO DE REGRAS DE NEGÓCIO ---
        // Verifica se todas as notas estão dentro do intervalo permitido (0 a 10)
        // O operador && (E) garante que a condição só seja verdadeira se TODAS forem válidas
        boolean notasValidas = 
            (nota1 >= 0 && nota1 <= 10) &&
            (nota2 >= 0 && nota2 <= 10) &&
            (nota3 >= 0 && nota3 <= 10) &&
            (nota4 >= 0 && nota4 <= 10);

        if (!notasValidas) {
            // Se o sinal de negação (!) indicar que as notas não são válidas, exibe erro
            System.out.println("Uma ou mais notas são inválidas. Todas devem estar entre 0 e 10.");
        } else {
            // --- CÁLCULO E AVALIAÇÃO ---
            
            // Fórmula da Média Aritmética: $M = \frac{n_1 + n_2 + n_3 + n_4}{4}$
            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.printf("Média: %.2f\n", media);

            // Escala de Conceitos Baseada na Média Final
            if (media == 10) {
                System.out.println("Conceito A+"); // Desempenho máximo
            } else if (media >= 9) {
                System.out.println("Conceito A");
            } else if (media >= 8) {
                System.out.println("Conceito B");
            } else if (media >= 7) {
                System.out.println("Conceito C");
            } else if (media >= 6) {
                System.out.println("Conceito D");
            } else {
                System.out.println("Conceito F"); // Abaixo da média mínima (6.0)
            }
        }

        // Encerra o scanner para liberar memória do sistema
        scanner.close();
    }
}