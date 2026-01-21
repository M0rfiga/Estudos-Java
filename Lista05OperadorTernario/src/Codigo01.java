import java.util.Scanner;

public class Codigo01 {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        // Solicita ao usuário que digite um número inteiro
        System.out.print("Digite um número: ");
        try {
            numero = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERRO: Digite um valor numérico");
        }
        // Variável que armazenará o resultado (Par ou Ímpar)
        String resultado;

        // Estrutura condicional que verifica se o número é par ou ímpar
        resultado = (numero % 2 == 0)? "Par" : "Ímpar";

        // Exibe o resultado na tela
        System.out.println("O número é " + resultado);

        // Fecha o objeto Scanner para liberar o recurso de entrada
        teclado.close();
    }
}