import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double numero = 0, resultado = 0;
        System.out.println("Informe um número, encontrarei o dobro se for positivo\nE o triplo se for negativo.");
        try {
            numero = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
            System.out.println("ERRO DESCONHECIDO");
        }
        if (numero > 0) resultado = (numero * 2);
        else resultado = (numero * 3);

        System.out.printf("O resultado é %.2f", resultado);
        teclado.close();
    }
}