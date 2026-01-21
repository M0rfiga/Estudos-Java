/*Classificação do IMC segundo a OMS:

Abaixo de 18,5: Abaixo do peso

18,5 a 24,9: Peso normal

25,0 a 29,9: Sobrepeso

30,0 a 34,9: Obesidade grau I

35,0 a 39,9: Obesidade grau II

40,0 ou mais: Obesidade grau III (obesidade mórbida) */

import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        float peso = 0, altura = 0;

        try {
        System.out.print("Me informe seu peso: ");
        peso = teclado.nextFloat();

        System.out.print("Me informe sua altura: ");
        altura = teclado.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Insira um valor numerico");
        } catch (Exception e) {
            System.out.println("ERRO Desconhecido");
        }

        float IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.printf("Seu IMC é %.2f -> Abaixo do peso", IMC);
        } else if (IMC < 25) {
            System.out.printf("Seu IMC é %.2f -> Peso normal", IMC);
        } else if (IMC < 30) {
            System.out.printf("Seu IMC é %.2f -> Sobrepeso", IMC);
        } else if (IMC < 35) {
            System.out.printf("Seu IMC é %.2f -> Obesidade grau I", IMC);
        } else if (IMC < 40) {
            System.out.printf("Seu IMC é %.2f -> Obesidade grau II", IMC);
        } else if (IMC > 40) {
            System.out.printf("Seu IMC é %.2f -> Obesidade grau III (obesidade mórbida)", IMC);
        }
        teclado.close();
    }
}
