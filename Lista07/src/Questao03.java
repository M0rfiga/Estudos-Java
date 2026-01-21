import java.util.Scanner;

/**
 * Programa para cálculo de reajuste salarial escalonado.
 * Utiliza métodos modulares para organizar a lógica de negócio e interação com o usuário.
 */
public class Questao03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // --- ENTRADA DE DADOS ---
        // Utiliza o método utilitário para capturar o salário com segurança
        double salarioAtual = obterValorDouble(teclado, "Informe o salário atual do colaborador: R$ ");

        // --- PROCESSAMENTO ---
        // 1. Determina qual o percentual de aumento com base na faixa salarial
        double percentualAumento = obterPercentualAumento(salarioAtual);
        
        // 2. Realiza os cálculos matemáticos
        // Fórmula: $valorAumento = salarioAtual \times (percentualAumento / 100)$
        double valorAumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + valorAumento;

        // --- SAÍDA DE DADOS ---
        // Delega a responsabilidade de impressão para um método específico
        exibirResultado(salarioAtual, percentualAumento, valorAumento, novoSalario);

        teclado.close();
    }

    /**
     * Exibe o relatório detalhado do reajuste no console.
     */
    static void exibirResultado(double salarioAtual, double percentualAumento, double valorAumento, double novoSalario) {
        System.out.println("\n--- Resultado do Reajuste ---");
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n", novoSalario);
    }

    /**
     * Método utilitário para ler valores double do teclado.
     */
    static double obterValorDouble(Scanner teclado, String mensagem) {
        System.out.println(mensagem);
        return teclado.nextDouble();
    }

    /**
     * Lógica de Negócio: Define o percentual de aumento conforme a faixa salarial.
     * @param salarioAtual O valor base para a comparação.
     * @return O percentual (20, 15, 10 ou 5).
     */
    static double obterPercentualAumento(double salarioAtual){
        if (salarioAtual <= 280.00) {
            return 20.0;
        } else if (salarioAtual <= 700.00) {
            return 15.0;
        } else if (salarioAtual <= 1500.00) {
            return 10.0;
        } else {
            return 5.0;
        }
    }
}