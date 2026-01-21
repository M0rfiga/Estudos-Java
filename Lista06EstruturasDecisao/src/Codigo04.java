import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double A = 0, B = 0, C;
        System.out.println("Informe o valor de A");
        try {
            A = teclado.nextDouble();
            System.out.println("Informe o valor de B");
            B = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
            System.out.println("ERRO DESCONHECIDO");
        }
        if (A == B) {
            C = (A + B);
        } else {
            C = (A * B);
        }
        System.out.printf("O valor de C é %.2f", C);

        teclado.close();
    }
}