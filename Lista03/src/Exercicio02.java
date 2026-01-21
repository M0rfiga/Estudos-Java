import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para cálculo de venda de combustível com descontos progressivos.
 * Regras: 
 * - Álcool: até 20L (3%), acima de 20L (5%)
 * - Gasolina: até 20L (4%), acima de 20L (6%)
 */
public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in); 
        
        // Definição de preços e inicialização de variáveis
        float PrecoGasolina = 5.50f;
        float PrecoAlcool = 3.90f;
        float LtsGasolina = 0, LtsAlcool = 0;
        float valorFinalAlcool = 0, valorFinalGasolina = 0;
        
        boolean entradaValida = false;
        int decisao = 0;

        try {
            System.out.print("Olá, bem vindo ao posto, você precisa de álcool ou gasolina?");
            System.out.print("\nDigite 1 para álcool e 2 para gasolina: ");
            decisao = teclado.nextInt();
        
            // Validação da opção inicial
            if (decisao == 1 || decisao == 2) {
                entradaValida = true;
            } else {
                System.out.print("ERRO: Opção inválida! Por favor, digite APENAS 1 ou 2");
            } 

            // --- LÓGICA PARA ÁLCOOL ---
            // CORREÇÃO: Usamos '==' para comparação, '=' é atribuição
            if (entradaValida == true && decisao == 1) {
                System.out.print("Informe quantos litros de álcool você necessita: ");
                LtsAlcool = teclado.nextFloat();
                
                if (LtsAlcool < 20) {
                    // Cálculo com 3% de desconto (multiplicar por 0.97)
                    valorFinalAlcool = (LtsAlcool * PrecoAlcool) * 0.97f;
                    System.out.printf("O valor de %.0f litros de Alcool é R$ %.2f (3%% de desconto aplicado)", LtsAlcool, valorFinalAlcool);
                } else {
                    // Cálculo com 5% de desconto (multiplicar por 0.95)
                    valorFinalAlcool = (LtsAlcool * PrecoAlcool) * 0.95f;
                    System.out.printf("O valor de %.0f litros de Alcool é R$ %.2f (5%% de desconto aplicado)", LtsAlcool, valorFinalAlcool);
                }

            // --- LÓGICA PARA GASOLINA ---
            } else if (entradaValida == true && decisao == 2) {
                System.out.print("Informe quantos litros de gasolina você necessita: ");
                LtsGasolina = teclado.nextFloat();
                
                if (LtsGasolina < 20) {
                    // Cálculo com 4% de desconto (multiplicar por 0.96)
                    valorFinalGasolina = (LtsGasolina * PrecoGasolina) * 0.96f;
                    System.out.printf("O valor de %.0f litros de Gasolina é R$ %.2f (4%% de desconto aplicado)", LtsGasolina, valorFinalGasolina);
                } else {
                    // Cálculo com 6% de desconto (multiplicar por 0.94)
                    valorFinalGasolina = (LtsGasolina * PrecoGasolina) * 0.94f;
                    System.out.printf("O valor de %.0f litros de Gasolina é R$ %.2f (6%% de desconto aplicado)", LtsGasolina, valorFinalGasolina);
                }
            }

        } catch (InputMismatchException e) {
            System.out.print("ERRO: Digite um valor númerico");
            teclado.next(); // Limpa o buffer do scanner
        } catch (Exception e) {
            System.out.print("ERRO desconhecido");
            teclado.next();
        }     
        
        teclado.close();
    }
}