import java.util.InputMismatchException;
import java.util.Scanner;
public class Codigo01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        System.out.println("Informe o valor de A: ");
        try {
            a = teclado.nextInt();
            System.out.println("Informe o valor de B: ");
            b = teclado.nextInt();
            System.out.println("Informe o valor de C: ");
            c = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
            System.out.println("ERRO DESCONHECIDO");
        }

        if (a + b < c) System.out.println("A soma de A + B é menor que C");
        else System.out.println("A soma de A + B é maior ou igual a C");
        teclado.close();
    }
}
