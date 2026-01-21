import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int qntdPosicoes = teclado.nextInt();

        int numeros[] = new int[qntdPosicoes];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        int menor = numeros[0];

        int posicaoMenor = 0;

        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicaoMenor);
        teclado.close();
    }
}

