import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para cálculo de compras em um hortifrúti.
 * Aplica preços diferentes por quilo conforme a quantidade e 
 * oferece um desconto adicional de 10% para compras acima de 8kg.
 */
public class Exercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        // Inicialização de variáveis para preços, pesos e valores calculados
        float PrecoMorango = 0, PrecoMaca = 0;
        float KgsMorango = 0, KgsMaca = 0;
        float ValorFinalMorango = 0, ValorFinalMaca = 0;

        try {
            // Entrada de dados para Morangos
            System.out.print("Informe quantos kilos de morango deseja: ");
            KgsMorango = teclado.nextFloat();
            
            // Entrada de dados para Maçãs
            System.out.print("Informe quantos kilos de maçã deseja: ");
            KgsMaca = teclado.nextFloat();
            
            // --- LÓGICA PARA MORANGOS ---
            if (KgsMorango > 8) {
                // Preço atacado + 10% de desconto adicional
                PrecoMorango = 1.8f;
                ValorFinalMorango = (PrecoMorango * KgsMorango) * 0.9f;
                System.out.printf("O valor de %.1f kilos de Morango é: R$%.2f (10%% de desconto aplicado)", KgsMorango, ValorFinalMorango);
            } else if (KgsMorango > 5) {
                // Apenas preço de atacado (entre 5.1kg e 8kg)
                PrecoMorango = 1.8f;
                ValorFinalMorango = (PrecoMorango * KgsMorango);
                System.out.printf("O valor de %.1f kilos de Morango é: R$%.2f", KgsMorango, ValorFinalMorango);
            } else {
                // Preço de varejo (até 5kg)
                PrecoMorango = 2.5f;
                ValorFinalMorango = (PrecoMorango * KgsMorango);
                System.out.printf("O valor de %.1f kilos de Morango é: R$%.2f", KgsMorango, ValorFinalMorango);
            }

            // --- LÓGICA PARA MAÇÃS ---
            if (KgsMaca > 8) {
                // Preço atacado + 10% de desconto adicional
                PrecoMaca = 1.5f;
                ValorFinalMaca = (PrecoMaca * KgsMaca) * 0.9f;
                System.out.printf("\nO valor de %.1f kilos de Maçã é: R$%.2f (10%% de desconto aplicado)", KgsMaca, ValorFinalMaca);
            } else if(KgsMaca > 5) {
                // Apenas preço de atacado
                PrecoMaca = 1.5f;
                ValorFinalMaca = (PrecoMaca * KgsMaca);
                System.out.printf("\nO valor de %.1f kilos de Maçã é: R$%.2f", KgsMaca, ValorFinalMaca);
            } else {
                // Preço de varejo
                PrecoMaca = 1.8f;
                ValorFinalMaca = (PrecoMaca * KgsMaca);
                System.out.printf("\nO valor de %.1f kilos de Maçã é: R$%.2f", KgsMaca, ValorFinalMaca);
            } 

        } catch (InputMismatchException e) {
            // Captura erros de digitação (letras em vez de números)
            System.out.print("ERRO: Digite um valor númerico");
            teclado.next(); 
        } catch (Exception e) {
            // Captura qualquer outro erro inesperado
            System.out.print("ERRO desconhecido");
            teclado.next();
        }    
        
        // Encerramento do programa e liberação de recursos
        teclado.close();
    }
}