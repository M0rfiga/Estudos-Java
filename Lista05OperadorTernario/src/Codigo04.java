import java.util.Scanner;

public class Codigo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 0, b = 0;
        try {
            // Solicita dois números ao usuário
            System.out.print("Digite o primeiro número: ");
            a = teclado.nextInt();
            System.out.print("Digite o segundo número: ");
            b = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERRO: Digite um valor numérico");
        }
        int maior;

        // Verifica qual dos dois números é maior
        maior = (a > b)? a : b;

        // Exibe o maior número
        System.out.println("Maior número: " + maior);

        teclado.close();
    }
}