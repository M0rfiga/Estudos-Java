import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para converter média aritmética em conceitos (A a E).
 * Demonstra o uso de estruturas condicionais encadeadas para faixas de valores.
 */
public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);         
        float nota1 = 0, nota2 = 0, media = 0;
        
        try {
            // Entrada de dados
            System.out.print("Digite a sua primeira nota: ");
            nota1 = teclado.nextFloat();
            
            // DICA: No seu código original, a mensagem abaixo também dizia "primeira nota".
            System.out.print("Digite a sua segunda nota: "); 
            nota2 = teclado.nextFloat();
            
            // Cálculo da média aritmética: $M = \frac{nota_1 + nota_2}{2}$
            media = (nota1 + nota2) / 2;

            // --- LÓGICA DE CONCEITOS ---
            // O Java testa as condições de cima para baixo.
            
            if (media > 9) {
                // Média entre 9.1 e 10.0
                System.out.printf("Seu conceito é A");
            } else if (media > 7.5) {
                // Média entre 7.6 e 9.0
                System.out.printf("Seu conceito é B");
            } else if (media > 6) {
                // Média entre 6.1 e 7.5
                System.out.printf("Seu conceito é C");
            } else if (media > 4) {
                // Média entre 4.1 e 6.0
                System.out.printf("Seu conceito é D");
            } else if (media >= 0) {
                // Média entre 0.0 e 4.0
                System.out.printf("Seu conceito é E");
            }

        } catch (InputMismatchException e) {
            // Captura erro se o usuário digitar letras ou símbolos
            System.out.print("Valor inválido");
        } catch (Exception e) {
            // Captura erros inesperados
            System.out.print("\nValor inválido");
        }   
        
        // Libera os recursos do Scanner
        teclado.close();
    }
}