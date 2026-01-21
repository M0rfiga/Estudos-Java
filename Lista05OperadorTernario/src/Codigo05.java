import java.util.Scanner;

public class Codigo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        // Solicita ao usuário um número
        System.out.print("Digite um número: ");
        try {
            numero = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERRO: Digite um valor numérico");
        }
        // Estrutura condicional com várias ações diferentes
        if (numero > 0) {
            System.out.println("O número é positivo.");
            System.out.println("Calculando a raiz quadrada...");
            double raiz = Math.sqrt(numero);
            System.out.printf("A raiz quadrada de %d é %.2f%n", numero, raiz);
        } else {
            System.out.println("O número é negativo ou zero.");
            System.out.println("Calculando o quadrado do número...");
            int quadrado = numero * numero;
            System.out.printf("O quadrado de %d é %d%n", numero, quadrado);
        }

        teclado.close();
    }
}