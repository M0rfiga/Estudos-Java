import java.util.Scanner;

/**
 * Programa para calcular o reajuste salarial e os descontos de folha de pagamento.
 * Fluxo: Aumento de 15% -> Cálculo de INSS (11%) -> Cálculo de FGTS (8%) -> Salário Líquido.
 */
public class App {
    public static void main(String[] args) throws Exception {  
        // Declaração da variável para armazenar o valor de entrada
        double salario; 

        // Inicializa o Scanner para leitura de dados via console
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor do seu salário: ");
        salario = teclado.nextDouble();

        // Exibição do valor digitado originalmente
        System.out.println("Salario inicial: " + salario);

        // --- CÁLCULO DE REAJUSTE ---
        // Multiplicar por 1.15 equivale a somar 15% ao valor original
        double salario_reajustado = salario * 1.15;
        System.out.println("Salario com reajuste: " + salario_reajustado);

        // --- CÁLCULO DE DESCONTOS ---
        // Cálculo do INSS (11% sobre o salário já reajustado)
        double desconto_INSS = salario_reajustado * 0.11;
        System.out.println("Desconto 11% do INSS: " + desconto_INSS);

        // Cálculo do FGTS (8% sobre o salário já reajustado)
        double desconto_FGTS = salario_reajustado * 0.08;
        System.out.println("Desconto 8% do FGTS: " + desconto_FGTS);

        // Soma de todos os descontos calculados
        double total_descontos = desconto_INSS + desconto_FGTS;
        System.out.println("Total de descontos: " + total_descontos);

        // --- RESULTADO FINAL ---
        // O salário final é o reajustado subtraindo a soma dos descontos
        double salario_final = salario_reajustado - total_descontos;
        System.out.println("Salario final: " + salario_final);

        // Encerra o objeto Scanner
        teclado.close();
    }
}
