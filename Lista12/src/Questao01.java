import java.util.Scanner;

/**
 * Programa que lê 10 números inteiros e contabiliza 
 * quantos são pares e quantos são ímpares.
 */
public class Questao01 {
    // Scanner estático para uso em toda a classe
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Inicialização dos contadores e da variável de controle do laço (i)
        int contagemPar = 0, contagemImpar = 0, i = 0;
        
        // Variável para armazenar o valor lido em cada repetição
        double valorLido = 0; 

        // --- ESTRUTURA DE REPETIÇÃO DO-WHILE ---
        // O bloco dentro do 'do' será executado pelo menos uma vez
        do {
            // Chamada de método de outra classe (Leitura) para capturar o dado
            // Nota: Embora a variável se chame 'soma' no original, ela armazena o número atual
            valorLido = Leitura.lerValorInteiro("Digite um valor: ");

            // --- LÓGICA DE PARIDADE ---
            // O operador % (módulo) retorna o resto da divisão por 2
            if (valorLido % 2 == 0) {
                // Se o resto for 0, o número é par
                contagemPar++;
            } else {
                // Caso contrário, o número é ímpar
                contagemImpar++;
            }

            // Incrementa o contador para evitar um loop infinito
            i++;
            
        } while (i < 10); // Condição de parada: o laço termina após 10 execuções

        // --- SAÍDA DE DADOS ---
        System.out.println("Numeros pares: " + contagemPar + "\nNumeros impares: " + contagemImpar);
        
        // Fecha o scanner para liberar recursos
        teclado.close();
    }
}