import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int valores[] = new int[10];
        int valoresPositivos[];
        int valoresNegativos[];
        int contadorPositivos = 0, contadorNegativos = 0;
        int indicePositivo = 0, indiceNegativo = 0;
        for(int i = 0; i < valores.length; i++) {
            valores[i] = Leitura.lerValorInteiro("Digite o valor[" + i + "] :");
            if (valores[i] == 0) {
                System.out.println("O valor não pode ser 0, insira um novo valor");
                i--;
            }
            if (valores[i] > 0) {
                contadorPositivos++;
            } else if (valores[i] < 0) {
                contadorNegativos++;
            }
        }
        valoresPositivos = new int[contadorPositivos];
        valoresNegativos = new int[contadorNegativos];

        for(int i = 0; i < valores.length; i++) {
            if (valores[i] > 0) {
                valoresPositivos[indicePositivo] = valores[i];
                indicePositivo++;
            } else if (valores[i] < 0) {
                valoresNegativos[indiceNegativo] = valores[i];
                indiceNegativo++;
            }
        }
        System.out.println("Valores positivos");
        for(int cont = 0; cont < valoresPositivos.length; cont++) {
            System.out.println("Positivo[" + cont + "]: " + valoresPositivos[cont]);
        }
        System.out.println("Valores negativos");
        for(int cont = 0; cont < valoresNegativos.length; cont++) {
            System.out.println("Negativo[" + cont + "]: " + valoresNegativos[cont]);
        }

        double percentualPositivos = (double) contadorPositivos / valores.length * 100;
        double percentualNegativos = (double) contadorNegativos / valores.length * 100;

        System.out.println("\n*** Percentuais ***");
        System.out.printf("Percentual de Positivos: %.2f%%\n", percentualPositivos);
        System.out.printf("Percentual de Negativos: %.2f%%\n", percentualNegativos);
        teclado.close();
    }
}
