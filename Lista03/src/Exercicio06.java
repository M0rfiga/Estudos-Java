import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa que traduz um número inteiro para o dia da semana correspondente.
 * Demonstra o uso de validação de intervalo e a estrutura switch-case.
 */
public class Exercicio06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        System.out.printf("Digite um número para cada dia da semana -> \n(1 - Domingo, 2 - Segunda, 3 - Terça, 4 - Quarta, 5 - Quinta, 6 -Sexta, 7 - Sábado): ");

        // --- ENTRADA E VALIDAÇÃO ---
        try {
            numero = teclado.nextInt();
            
            // Verifica se o número está fora do intervalo permitido (1 a 7)
            if (numero < 1 || numero > 7) {
                System.out.print("Valor inválido");
                // Dica: Adicionar um 'return;' aqui evitaria que o código tentasse entrar no switch
            }
        } catch (InputMismatchException e) {
            // Captura se o usuário digitar letras ou símbolos
            System.out.print("Valor inválido");
            return; 
        } catch (Exception e) {
            System.out.print("\nValor inválido");
            return;
        }

        // --- ESTRUTURA SWITCH-CASE ---
        // O switch "escolhe" o caminho baseado no valor exato da variável 'numero'
        switch (numero) {
            case 1:
                System.out.print("Domingo");
                break; // O break é essencial para não "atropelar" e executar os dias seguintes
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
            // Dica: O switch aceita um bloco 'default' para lidar com valores não mapeados
        }    
        
        teclado.close();
    }
}