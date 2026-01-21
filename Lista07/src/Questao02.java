import java.util.Scanner;

/**
 * Programa para cálculo de Média de Aproveitamento (MA).
 * Utiliza o conceito de média ponderada e modularização total por métodos.
 */
public class Questao02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // --- ENTRADA DE DADOS VIA MÉTODOS ---
        // Aqui você centralizou a lógica de pedir e receber dados em métodos externos
        int numIdentificacao = obterValorInt(teclado, "Informe o código de matrícula do aluno: ");
        double nota1 = obterValorDouble(teclado, "Informe a 1ª nota: ");
        double nota2 = obterValorDouble(teclado, "Informe a 2ª nota: ");
        double nota3 = obterValorDouble(teclado, "Informe a 3ª nota: ");
        double ME = obterValorDouble(teclado, "Informe a média dos exercícios (ME): ");

        // --- PROCESSAMENTO ---
        // Calcula a média ponderada através de um método específico
        double MA = obterPercentualAumento(nota1, nota2, nota3, ME);

        // --- SAÍDA ---
        exibirResultado(numIdentificacao, MA);
        
        teclado.close();
    }

    /**
     * Exibe os dados do aluno e verifica sua situação acadêmica.
     */
    static void exibirResultado(int numIdentificacao, double MA) {
        System.out.println("\n--- Resultado ---");
        System.out.println("Número de identificação: " + numIdentificacao);
        System.out.printf("Média de aproveitamento: %.2f%n", MA);
        
        // Lógica de status baseada na média
        if (MA >= 6) System.out.println("Aprovado");
        else if (MA < 4) System.out.println("Reprovado");
        else System.out.println("Recuperação");
    }

    /**
     * Realiza o cálculo da Média Ponderada.
     * Pesos: nota1 (1), nota2 (2), nota3 (3), ME (1). Total de pesos = 7.
     */
    static double obterPercentualAumento(double nota1, double nota2, double nota3, double ME) {
        // Fórmula: $MA = \frac{N1 + (N2 \times 2) + (N3 \times 3) + ME}{7}$
        double MediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + ME) / 7;
        return MediaAproveitamento;
    }

    // --- MÉTODOS DE UTILITÁRIOS (ENTRADA DE DADOS) ---

    static String obterString(Scanner teclado, String mensagem) {
        System.out.println(mensagem);
        return teclado.nextLine();
    }

    static double obterValorDouble(Scanner teclado, String mensagem) {
        System.out.println(mensagem);
        return teclado.nextDouble();
    }

    static float obterValorfloat(Scanner teclado, String mensagem) {
        System.out.println(mensagem);
        return teclado.nextFloat();
    }

    static int obterValorInt(Scanner teclado, String mensagem) {
        System.out.println(mensagem);
        return teclado.nextInt();
    }
}