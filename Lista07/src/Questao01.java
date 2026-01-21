import java.util.Scanner;

/**
 * Programa para geração de tabuada completa (as quatro operações).
 * Demonstra o uso de métodos estáticos para evitar repetição de lógica de impressão.
 */
public class Questao01 {
    public static void main(String[] args) {
        // Inicializa o Scanner para entrada de dados
        Scanner teclado = new Scanner(System.in);
        float numero;

        System.out.print("Informe o numero para o calculo da tabuada: ");
        // Nota: teclado.nextInt() lê um inteiro, mas armazena em um float (conversão implícita)
        numero = teclado.nextInt();

        // --- TABUADA DE SOMA E SUBTRAÇÃO ---
        System.out.println("\nTabuada do + e - para o numero " + numero);

        // Chamadas manuais do método para cada valor de 0 a 9
        calcularSomaSubtracao(numero, 0);
        calcularSomaSubtracao(numero, 1);
        calcularSomaSubtracao(numero, 2);
        calcularSomaSubtracao(numero, 3);
        calcularSomaSubtracao(numero, 4);
        calcularSomaSubtracao(numero, 5);
        calcularSomaSubtracao(numero, 6);
        calcularSomaSubtracao(numero, 7);
        calcularSomaSubtracao(numero, 8);
        calcularSomaSubtracao(numero, 9);

        // --- TABUADA DE MULTIPLICAÇÃO E DIVISÃO ---
        System.out.println("\nTabuada do * e / para o numero " + numero);

        calcularMultiplicacaoDivisao(numero, 0);
        calcularMultiplicacaoDivisao(numero, 1);
        calcularMultiplicacaoDivisao(numero, 2);
        calcularMultiplicacaoDivisao(numero, 3);
        calcularMultiplicacaoDivisao(numero, 4);
        calcularMultiplicacaoDivisao(numero, 5);
        calcularMultiplicacaoDivisao(numero, 6);
        calcularMultiplicacaoDivisao(numero, 7);
        calcularMultiplicacaoDivisao(numero, 8);
        calcularMultiplicacaoDivisao(numero, 9);

        teclado.close();
    }

    /**
     * Método estático para calcular e exibir Soma e Subtração lado a lado.
     * @param valor1 O número base da tabuada.
     * @param valor2 O incremento (0 a 9).
     */
    static void calcularSomaSubtracao(float valor1, float valor2) {
        // \t insere um espaço de tabulação para alinhar as colunas
        // Math.abs garante que o resultado da subtração seja sempre positivo (valor absoluto)
        System.out.printf("%.0f + %.0f = %.0f \t\t %.0f - %.0f = %.0f%n", 
            valor1, valor2, valor1 + valor2, 
            valor1, valor2, Math.abs(valor1 - valor2));
    }

    /**
     * Método estático para calcular e exibir Multiplicação e Divisão lado a lado.
     */
    static void calcularMultiplicacaoDivisao(float valor1, float valor2) {
        // Nota: A divisão por zero resultará em "Infinity" por estarmos usando floats
        System.out.printf("%.0f * %.0f = %.0f \t\t %.0f / %.0f  = %.1f%n", 
            valor1, valor2, valor1 * valor2, 
            valor1, valor2, valor1 / valor2);
    }
}