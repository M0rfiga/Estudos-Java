Lista de Exercícios 5: Operador Ternário
Estes exercícios não precisam ser entregues:



Converta os códigos abaixo para utilizarem o operador ternário caso seja possível. Implemente também o try catch:


Código 01:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Solicita ao usuário que digite um número inteiro
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        // Variável que armazenará o resultado (Par ou Ímpar)
        String resultado;

        // Estrutura condicional que verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        // Exibe o resultado na tela
        System.out.println("O número é " + resultado);

        // Fecha o objeto Scanner para liberar o recurso de entrada
        teclado.close();
    }
}

Código 02:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita o valor da compra ao usuário
        System.out.print("Digite o valor da compra: ");
        double valorCompra = teclado.nextDouble();

        double desconto;

        // Se o valor for maior que 300, aplica 10% de desconto
        // Caso contrário, aplica 5%
        if (valorCompra > 300.0) {
            desconto = valorCompra * 0.10;
        } else {
            desconto = valorCompra * 0.05;
        }

        // Exibe o valor do desconto calculado
        System.out.println("Desconto aplicado: R$ " + desconto);

        teclado.close();
    }
}
Código 03:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lê a nota informada pelo usuário
        System.out.print("Digite a nota do aluno: ");
        int nota = teclado.nextInt();

        String status;

        // Verifica se a nota é maior ou igual a 70
        // Se for, o aluno está aprovado; caso contrário, reprovado
        if (nota >= 70) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }

        // Exibe o status final do aluno
        System.out.println("Status do aluno: " + status);

        teclado.close();
    }
}
Código 04:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = teclado.nextInt();

        int maior;

        // Verifica qual dos dois números é maior
        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }

        // Exibe o maior número
        System.out.println("Maior número: " + maior);

        teclado.close();
    }
}
Código 05:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

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