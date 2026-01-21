import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo07 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero = 0, resultado = 0;
        String ParImpar = "";
        System.out.println("Informe um valor, caso seja Par somarei 5.\n Caso seja Ímpar somarei 8.");
        try {
            numero = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
            System.out.println("ERRO DESCONHECIDO");
        }
        ParImpar = (numero % 2 == 0)? "Par" : "Ímpar";
        if ((ParImpar).equals("Par")) resultado = numero + 5;
        else if ((ParImpar).equals("Ímpar")) resultado = numero + 8;
        System.out.printf("Resultado: %d", resultado);
        teclado.close();
    }
}