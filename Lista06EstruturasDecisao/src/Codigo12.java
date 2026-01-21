import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo12 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, nota3 = 0, ME = 0, MA;
        String conceito = "", aprovacao = "";
        int ID = 0;
        System.out.println("Me informe seu numero de ID:");
        try {
            ID = teclado.nextInt();
            System.out.println("Me informe a primeira nota:");
            nota1 = teclado.nextDouble();
            System.out.println("Me informe a segunda nota:");
            nota2 = teclado.nextDouble();
            System.out.println("Me informe a terceira nota:");
            nota3 = teclado.nextDouble();
            System.out.println("Me informe a média dos exercícios:");
            ME = teclado.nextDouble();
        } catch (InputMismatchException e) {
			System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
			System.out.println("ERRO DESCONHECIDO");
        } MA = (nota1 + nota2 * 2 + nota3 * 3 + ME)/7;
        if (MA >= 90) {
            conceito = "A";
            aprovacao = "Aprovado";
        } else if (MA >= 75) {
            conceito = "B";
            aprovacao = "Aprovado";
        } else if (MA >= 60) {
            conceito = "C";
            aprovacao = "Aprovado";
        } else if (MA >= 40) {
            conceito = "D";
            aprovacao = "Reprovado";
        } else if (MA < 40) {
            conceito = "F";
            aprovacao = "Reprovado";
        } 
        System.out.printf("Aluno: %d", ID);
        System.out.printf("\nNotas: %.2f, %.2f, %.2f", nota1, nota2, nota3);
        System.out.printf("\nMédia dos exercícios: %.2f", ME);
        System.out.printf("\nMédia de aproveitamento: %.2f", MA);
        System.out.printf("\nConceito: %s", conceito);
        System.out.printf("\nAprovação: %s", aprovacao);
        teclado.close();
    }
}