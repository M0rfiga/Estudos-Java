import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo11 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double preco = 0, valorFinal = 0;
        int formaPagamento = 0;
        try {
            System.out.println("Qual o preço do produto de etiqueta?");
            preco = teclado.nextDouble();
            System.out.println("Qual a forma de pagamento? Escolha:\n1- À Vista em dinheiro ou cheque, recebe 10% de desconto.");
            System.out.println("2- À vista no cartão de crédito, recebe 15% de desconto.");
            System.out.println("3- Em duas vezes, preço normal de etiqueta sem juros.");
            System.out.println("4- Em duas vezes, preço normal de etiqueta mais juros de 10%");
            formaPagamento = teclado.nextInt();

            if (formaPagamento == 1) valorFinal = (preco * 0.90);
            else if (formaPagamento == 2) valorFinal = (preco * 0.85);
            else if (formaPagamento == 3) valorFinal = preco;
            else if (formaPagamento == 4) valorFinal = (preco * 1.10);
            
            System.out.printf("O valor pago será: R$%.2f", valorFinal);

        } catch (InputMismatchException e) {
			System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
			System.out.println("ERRO DESCONHECIDO");
        }
        
        teclado.close();
    }
}