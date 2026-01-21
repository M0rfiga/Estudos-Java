import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo10 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        //A fórmula é IMC = peso / ( altura )2
        double peso = 0, altura = 0;
        System.out.println("Vamos calcular seu IMC! Informe seu peso:");
        try {
            peso = teclado.nextDouble();
            System.out.println("Informe sua altura:");
            altura = teclado.nextDouble();
        } catch (InputMismatchException e) {
		    System.out.println("ERRO: Insira um valor numérico");
        } catch (Exception e) {
		    System.out.println("ERRO DESCONHECIDO");
        } double IMC = peso / Math.pow(altura, 2);
        System.out.printf("Seu IMC é %.2f", IMC);
        if (IMC < 18.5) System.out.println("Abaixo do peso");
        else if (IMC < 25) System.out.println("Peso Normal");
        else if (IMC < 30) System.out.println("Acima do Peso");
        else System.out.println("Sobrepeso");
        teclado.close();
    }
}