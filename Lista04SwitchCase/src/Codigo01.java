import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que traduz um número inteiro (1 a 7) para o dia da semana correspondente.
 * Demonstra o uso de switch-case e tratamento de erros de entrada de dados.
 */
public class Codigo01 {
    public static void main(String[] args) {
        // Inicializa o Scanner para ler a entrada do usuário
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        // Exibe as opções disponíveis para o usuário
        System.out.printf("Digite um número para cada dia da semana -> \n(1 - Domingo, 2 - Segunda, 3 - Terça, 4 - Quarta, 5 - Quinta, 6 -Sexta, 7 - Sábado): ");

        // --- BLOCO DE TRATAMENTO DE ENTRADA ---
        try {
            // Tenta ler um número inteiro
            numero = teclado.nextInt();
            
            // Valida se o número está dentro do intervalo permitido $1 \leq numero \leq 7$
            if (numero < 1 || numero > 7) {
                System.out.print("Valor inválido");
            }
        } catch (InputMismatchException e) {
            // Caso o usuário digite algo que não seja um número inteiro (ex: letras)
            System.out.print("Valor inválido");
        } catch (Exception e) {
            // Captura qualquer outro erro inesperado do sistema
            System.out.print("\nValor inválido");
        }

        // --- ESTRUTURA DE DECISÃO MULTIPLA (SWITCH) ---
        // Escolhe o bloco de código baseado no valor exato da variável 'numero'
        switch (numero) {
            case 1:
                System.out.print("Domingo");
                break; // O break interrompe o switch e sai da estrutura
            case 2:
                System.out.print("Segunda");
                break;
            case 3:
                System.out.print("Terça");
                break;
            case 4:
                System.out.print("Quarta");
                break;
            case 5:
                System.out.print("Quinta");
                break;
            case 6:
                System.out.print("Sexta");
                break;
            case 7:
                System.out.print("Sabado");
                break;
        }

        // Fecha o scanner para liberar os recursos do sistema
        teclado.close();
    }
}