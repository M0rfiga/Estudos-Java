import java.util.Scanner; //linha de codigo que permite utilizarmos o comando para a leitura de dados

public class App {
    public static void main(String[] args) throws Exception {
        float metros_frente, metros_lateral, valor_metro_quadrado; //variavel para armazenar o valor

        //a linha de codigo abaixo prepara o teclado para ler os diversos tipos 
        Scanner teclado = new Scanner(System.in); 

        System.out.print("Quantos metros o terreno tem de frente? ");
        metros_frente = teclado.nextFloat();
        //comando que le o valor digitado pelo usuario e armazena na variavel metros_frente

        System.out.print("Quantos metros o terreno tem de lado? ");
        metros_lateral = teclado.nextFloat();
        float area = metros_frente * metros_lateral; //salva a variavel da area

        System.out.print("Qual o valor do metro quadrado? ");
        valor_metro_quadrado = teclado.nextFloat();
        float valor_total = area * valor_metro_quadrado; //salva a variavel do valor por metro quadrado

        System.out.println("Área total do terreno de " + metros_frente + "mts de frente com " + metros_lateral + " mts de lateral é: " + area + "mts"); // o + faz a variavel aparecer
        System.out.print("O valor deste terreno é: R$ " + valor_total);
        teclado.close();
    }
}
