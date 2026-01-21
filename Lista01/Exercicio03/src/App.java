import java.util.Scanner;

/**
 * Programa para calcular a quantidade de ferraduras necessárias para um haras
 * e o custo total da compra.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        int quantidade_cavalos;
        int valor_ferradura;
        int ferradura_por_cavalo = 4; // Valor fixo: cada cavalo usa 4 ferraduras

        // Inicializa o Scanner para capturar dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados: Quantidade de animais
        System.out.print("Digite a quantidade de cavalos: ");
        quantidade_cavalos = teclado.nextInt();

        // Entrada de dados: Preço unitário da ferradura
        System.out.print("Digite o valor da ferradura: ");
        valor_ferradura = teclado.nextInt();

        // Processamento: Cálculo da quantidade total de ferraduras
        // Lógica: $f_{necessarias} = q_{cavalos} \times 4$
        int ferraduras_necessarias = quantidade_cavalos * ferradura_por_cavalo;

        // Processamento: Cálculo do valor financeiro total
        // Lógica: $V_{total} = f_{necessarias} \times v_{unitario}$
        int valor_total = ferraduras_necessarias * valor_ferradura;

        // Saída de dados: Exibição dos resultados para o usuário
        System.out.println("Ferraduras necessarias: " + ferraduras_necessarias);
        System.out.print("Valor total: " + valor_total);

        // Fecha o scanner para liberar memória
        teclado.close();
    }
}
