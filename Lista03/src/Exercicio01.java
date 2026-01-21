import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa para cálculo de média aritmética de três notas.
 * Utiliza estruturas condicionais para definir o status do aluno.
 */
public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        // Inicialização do Scanner para entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        // Declaração das variáveis de nota com precisão float
        float nota1 = 0, nota2 = 0, nota3 = 0;
        
        // --- ENTRADA DE DADOS COM TRATAMENTO DE ERROS ---
        try {
            System.out.print("Olá me diga sua nota na prova 1: ");
            nota1 = teclado.nextFloat();
            
            System.out.print("Olá me diga sua nota na prova 2: ");
            nota2 = teclado.nextFloat();
            
            System.out.print("Olá me diga sua nota na prova 3: ");
            nota3 = teclado.nextFloat();

        } catch (InputMismatchException e) {
            // Caso o usuário digite algo que não seja um número (ex: letras)
            System.out.print("ERRO: Digite um valor númerico");
        } catch (Exception e) {
            // Captura qualquer outro erro inesperado
            System.out.print("ERRO desconhecido");
        }

        // --- CÁLCULO DA MÉDIA ---
        // Fórmula aplicada: $M = \frac{n1 + n2 + n3}{3}$
        float media = (nota1 + nota2 + nota3) / 3;

        // --- ESTRUTURA DE DECISÃO (Lógica de Aprovação) ---
        if (media == 10) {
            // Caso a média seja exatamente 10
            System.out.print("Aprovado com Distinção");
        } else if (media >= 7){
            // Caso a média seja entre 7 e 9.9
            System.out.print("Aprovado");
        } else {
            // Caso a média seja inferior a 7
            System.out.print("Reprovado");
        } 
            
        // Fecha o scanner para liberar memória
        teclado.close();
    }
}