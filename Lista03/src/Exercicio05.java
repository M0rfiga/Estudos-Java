import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para processamento de folha de pagamento.
 * Calcula o Salário Bruto, descontos de IR (conforme faixa), 
 * INSS, Sindicato e o Salário Líquido final.
 */
public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        // Inicialização de todas as variáveis de controle financeiro
        float QTDEHoras = 0, ValordaHora = 0, SalarioBruto = 0;
        float IR = 0, INSS = 0, Sindicato = 0, FGTS = 0;
        float TotalDescontos = 0, SalarioLiquido = 0;

        // --- ENTRADA DE DADOS ---
        try {
            System.out.print("Informe as horas trabalhadas: ");
            QTDEHoras = teclado.nextFloat();
            System.out.print("Informe o valor da hora trabalhada: ");
            ValordaHora = teclado.nextFloat();
        } catch (InputMismatchException e) {
            System.out.print("ERRO: Digite um valor númerico");
            return; // Encerra para evitar cálculos com valores zerados
        } catch (Exception e) {
            System.out.print("\nERRO desconhecido");
            return;
        }       

        // --- CÁLCULO DO SALÁRIO BRUTO ---
        SalarioBruto = (QTDEHoras * ValordaHora);
        System.out.printf("Salário Bruto: R$%.2f", SalarioBruto);

        // --- CÁLCULO DO IMPOSTO DE RENDA (IR) ---
        // Lógica de faixas: Isento até 900, 5% até 1500, 10% até 2500 e 20% acima disso.
        if (SalarioBruto <= 900) {
            System.out.printf("\nIR (isento)");
        } else if (SalarioBruto <= 1500) {
            IR = (SalarioBruto * 0.05f);
            System.out.printf("\n(-) IR (5%%): R$%.2f", IR);
        } else if (SalarioBruto <= 2500) {
            IR = (SalarioBruto * 0.10f);
            System.out.printf("\n(-) IR (10%%): R$%.2f", IR);
        } else {
            IR = (SalarioBruto * 0.20f);
            System.out.printf("\n(-) IR (20%%): R$%.2f", IR);
        }

        // --- OUTROS DESCONTOS E ENCARGOS ---
        
        // INSS (Fixo em 10% neste exercício)
        INSS = (SalarioBruto * 0.10f);
        System.out.printf("\n(-) INSS (10%%): R$%.2f", INSS);

        // Sindicato (Fixo em 3%)
        Sindicato = (SalarioBruto * 0.03f);
        System.out.printf("\n(-) Sindicato (3%%): R$%.2f", Sindicato);

        // FGTS (11%) - Nota: O FGTS não é descontado do salário, é um custo da empresa.
        FGTS = (SalarioBruto * 0.11f);
        System.out.printf("\nFGTS (11%%): R$%.2f", FGTS);

        // --- TOTALIZAÇÃO ---
        
        // Somatória apenas do que é efetivamente descontado do contracheque
        TotalDescontos = (IR + INSS + Sindicato);
        System.out.printf("\nTotal de descontos: R$%.2f", TotalDescontos);

        // Cálculo final: Bruto menos a soma de todos os descontos
        SalarioLiquido = (SalarioBruto - TotalDescontos);
        System.out.printf("\nSalário Liquido: R$%.2f", SalarioLiquido);     

        teclado.close();
    }
}