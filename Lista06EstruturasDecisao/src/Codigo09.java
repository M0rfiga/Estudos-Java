import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo09 {
    public static void main(String[] args) throws Exception {
        /* Peso ideal, utilizando as seguintes fórmulas:
        ● para homens: (72.7 * h) – 58;
        ● para mulheres: (62.1 * h) – 44.7. */
        Scanner teclado = new Scanner(System.in);
        String sexo = "";
        double altura = 0, pesoIdeal = 0;
        System.out.println("Qual seu sexo?\nResponda com F para Feminino\nE M para Masculino");
        sexo = teclado.nextLine();
        System.out.println("Me informe sua altura em metros:");
        try {
            altura = teclado.nextDouble();
        } catch (InputMismatchException e) {
		    System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
		    System.out.println("ERRO DESCONHECIDO");
        }
        if ((sexo).equals("F")) pesoIdeal = (62.1 * altura) - 44.7;
        else if ((sexo).equals("M")) pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("Seu peso ideal é: %.2f", pesoIdeal);
        teclado.close();
    }
}