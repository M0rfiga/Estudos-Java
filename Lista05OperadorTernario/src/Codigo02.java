import java.util.Scanner;
public class Codigo02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita o valor da compra ao usuário
        double valorCompra =0;
        System.out.print("Digite o valor da compra: ");
        try {
            valorCompra = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("ERRO: Digite um valor numérico");
        }
        double desconto;

        // Se o valor for maior que 300, aplica 10% de desconto
        // Caso contrário, aplica 5%
        desconto = (valorCompra > 300.0)? valorCompra * 0.10 : valorCompra * 0.05;
        // Exibe o valor do desconto calculado
        System.out.println("Desconto aplicado: R$ " + desconto);

        teclado.close();
    }
}