import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para cálculo de reajuste salarial anual.
 * Aplica diferentes percentuais de aumento baseados na faixa salarial do colaborador.
 */
public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float salario = 0, salarioReajustado = 0;

        try {
            System.out.print("Insira seu salário para o reajuste:");
            salario = teclado.nextFloat();

            // --- LÓGICA DE FAIXAS SALARIAIS ---
            
            if (salario < 280) {
                // Faixa 1: Aumento de 20%
                salarioReajustado = (salario * 1.20f);
            } else if (salario < 700) {
                // Faixa 2: Aumento de 15%
                salarioReajustado = (salario * 1.15f);
            } else if (salario < 1500) {
                // Faixa 3: Aumento de 10%
                salarioReajustado = (salario * 1.10f);
            } else {
                // Faixa 4: Salários acima de 1500 recebem 5%
                salarioReajustado = (salario * 1.05f);
            } 

            // Exibição do resultado final
            System.out.printf("Seu salário reajustado é: %.2f", salarioReajustado);

        } catch (InputMismatchException e) {
            // Captura caso o usuário digite texto ou símbolos inválidos
            System.out.print("ERRO: Digite um valor númerico");
            teclado.next(); // Limpa a entrada inválida
        } catch (Exception e) {
            // Captura erros inesperados do sistema
            System.out.print("ERRO desconhecido");
            teclado.next();
        }     
        
        teclado.close();
    }
}