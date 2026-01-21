Lista de Exercícios 4: Switch Case
Estes exercícios não precisam ser entregues:



Converta os códigos abaixo para utilizarem uma estrutura switch case caso seja possível. Implemente também o try catch:



Código 01:

import java.util.Scanner;

public class DiasDaSemanaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");

        int dia = scanner.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        } else if (dia == 4) {
            System.out.println("Quarta-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Dia inválido");
        }

        scanner.close();
    }
}
Código 02:
import java.util.Scanner;

public class ConceitoNotasIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura individual de 4 notas
        System.out.print("Digite a nota 1 (0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2 (0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3 (0 a 10): ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota 4 (0 a 10): ");
        double nota4 = scanner.nextDouble();

        // Verificação de validade das notas
        boolean notasValidas = 
            (nota1 >= 0 && nota1 <= 10) &&
            (nota2 >= 0 && nota2 <= 10) &&
            (nota3 >= 0 && nota3 <= 10) &&
            (nota4 >= 0 && nota4 <= 10);

        if (!notasValidas) {
            System.out.println("Uma ou mais notas são inválidas. Todas devem estar entre 0 e 10.");
        } else {
            // Cálculo da média
            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.printf("Média: %.2f\n", media);

            // Avaliação do conceito com base na média
            if (media == 10) {
                System.out.println("Conceito A+");
            } else if (media >= 9) {
                System.out.println("Conceito A");
            } else if (media >= 8) {
                System.out.println("Conceito B");
            } else if (media >= 7) {
                System.out.println("Conceito C");
            } else if (media >= 6) {
                System.out.println("Conceito D");
            } else {
                System.out.println("Conceito F");
            }
        }

        scanner.close();
    }
}
Código 03:
import java.util.Scanner;

public class MenuOpcoesIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Listar usuários");
        System.out.println("3 - Editar usuário");
        System.out.println("4 - Remover usuário");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Cadastrar usuário");
            //aqui futuramente teremos os comandos para cadastrar o usuário
        } else if (opcao == 2) {
            System.out.println("Listar usuários");
            //aqui futuramente teremos os comandos para listar o usuário
        } else if (opcao == 3) {
            System.out.println("Editar usuário");
            //aqui futuramente teremos os comandos para editar o usuário
        } else if (opcao == 4) {
            System.out.println("Remover usuário");
            //aqui futuramente teremos os comandos para remover o usuário
        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
Código 04:
import java.util.Scanner;

public class AvaliadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida.");
        } else if (idade < 12) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else if (idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        scanner.close();
    }
}
Código 05:
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III");
        }

        scanner.close();
    }
}