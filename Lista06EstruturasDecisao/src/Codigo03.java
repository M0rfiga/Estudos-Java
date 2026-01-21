import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double numero = 0;
        String ParImpar;
        System.out.print("Me informe um número: ");
        try {
            numero = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
            System.out.println("ERRO DESCONHECIDO");
        }
        ParImpar = (numero % 2 == 0)? "Par" : "Ímpar";
        System.out.printf("O número é %s", ParImpar);
        teclado.close();
    }
}
