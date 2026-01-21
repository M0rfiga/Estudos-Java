import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo08 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int A = 0, B = 0, C = 0;

        System.out.println("Informe o primeiro valor inteiro:");

        try {
            A = teclado.nextInt();
            System.out.println("Informe o segundo valor inteiro:");
            B = teclado.nextInt();
            System.out.println("Informe o terceiro valor inteiro:");
            C = teclado.nextInt();
        } catch (InputMismatchException e) {
		    System.out.println("ERRO: Insira um valor numérico(INTEIRO)");
        } catch (Exception e) {
		    System.out.println("ERRO DESCONHECIDO");
        }
        System.out.println("Ordem decrescente:");

        //if PAI 1, decide primeiro numero
        if (A > B && A > C) {
            System.out.println(A);
            //if FILHO 1, Decide o segundo numero
            if (B > C) System.out.println(B + "\n" + C);
            //else if FINAL 1, Decide o numero que sobrou
            else if (C > B) System.out.println(C + "\n" + B);
        } //if PAI 2
        else if (B > A && B > C) {
            System.out.println(B);
            //if FILHO 2, Decide o segundo numero
            if (A > C) System.out.println(A + "\n" + C);
            //else if FINAL 2, Decide o numero que sobrou
            else if (C > A) System.out.println(C + "\n" + A);
        } // if PAI 3
        else if (C > A && C > B) {
            System.out.println(C);
            //if FILHO 3, Decide o segundo numero
            if (A > B) System.out.println(A + "\n" + B);
            //else if FINAL 3, Decide o numero que sobrou
            else if (B > A) System.out.println(B + "\n" + A);
        }
        teclado.close();
    }
}