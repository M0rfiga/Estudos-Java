import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para calcular o custo total de identificação de frangos.
 * O cálculo baseia-se em um valor fixo de 11,00 por animal.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Inicialização de variáveis
        int frangos = 0;
        double identificacao_frangos = 0;
        
        // Objeto Scanner para capturar a entrada do usuário
        Scanner teclado = new Scanner(System.in);

        // Bloco try: Tenta executar o código que pode gerar erros de entrada
        try {
            System.out.print("Digite a quantidade de frangos:");
            // Captura um número inteiro. Se o usuário digitar letras ou decimais, dispara exceção.
            frangos = teclado.nextInt();

        } 
        // Captura específica: O usuário digitou um tipo de dado errado (ex: texto)
        catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um numero inteiro");
            e.printStackTrace();
        } 
        // Captura genérica: Qualquer outro erro imprevisto no sistema
        catch (Exception e) {
            System.out.println("ERRO DESCONHECIDO");
            e.printStackTrace();
        }

        // Processamento: Cálculo do custo total
        // Fórmula matemática: $C_{total} = n_{frangos} \times 11.00$
        identificacao_frangos = frangos * 11;

        // Saída: Exibe o valor formatado com duas casas decimais (padrão monetário)
        System.out.printf("O valor total para identificar os frangos é %.2f reais", identificacao_frangos);

        // Libera o recurso do Scanner
        teclado.close();
    }
}