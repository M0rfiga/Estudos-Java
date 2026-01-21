import java.util.Scanner;

/**
 * Programa que demonstra leitura segura de dados e manipulação de strings/chars.
 * Utiliza métodos modulares para tratar exceções e limpar o buffer do Scanner.
 */
public class Questao02 {
    // Scanner estático compartilhado por todos os métodos da classe
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        char caracteres = 0;
        String texto = "";
        int i = 0;

        // --- OBSERVAÇÃO IMPORTANTE ---
        // O loop abaixo não será executado porque 'texto' começa vazio ("").
        // Portanto, texto.length() é 0, e a condição i < 0 é falsa desde o início.
        for(i = 0; i < texto.length(); i++) {
            texto = lerValorString("Digite uma palavra: ");
            caracteres = lerValorChar(texto);
        }
    }

    /**
     * Tenta ler um valor inteiro e repete o pedido em caso de erro.
     */
    static int lerValorInteiro(String mensagem) {
        int valor = 0;
        boolean ErroLeitura = true;
        do {
            try {
                System.out.print(mensagem);
                valor = teclado.nextInt();
                ErroLeitura = false;
            } catch (Exception e) {
                System.out.println("Valor digitado é incorreto.");
            } finally {
                // Sempre limpa o buffer após tentar ler um número
                limparBuffer();
            }
            // --- ATENÇÃO ---
            // Colocar o 'return' aqui dentro faz o loop parar na primeira tentativa,
            // mesmo que ocorra um erro. O ideal é que o return fique FORA do loop.
        } while (ErroLeitura);
        return valor;
    }
    
    /**
     * Limpa o lixo de memória do buffer do Scanner (evita pular leituras de String).
     */
    static void limparBuffer() {
        if (teclado.hasNextLine()) {
            teclado.nextLine();
        }
    }

    /**
     * Lê uma String do usuário e retorna apenas o primeiro caractere.
     */
    static char lerValorChar(String mensagem) {
        char valor = '\0';
        boolean ErroLeitura = true;
        do {
            try {
                System.out.print(mensagem);
                String entrada = teclado.nextLine();
                ErroLeitura = false;
                if (entrada.length() > 0) {
                    valor = entrada.charAt(0); // Captura o primeiro caractere da frase
                }
            } catch (Exception e) {
                System.out.println("Valor digitado é incorreto.");
            }
        } while (ErroLeitura);
        return valor;
    }

    /**
     * Lê uma linha inteira de texto.
     */
    static String lerValorString(String mensagem) {
        String valor = "";
        boolean ErroLeitura = true;
        do {
            try {
                System.out.print(mensagem);
                valor = teclado.nextLine();
                ErroLeitura = false;
            } catch (Exception e) {
                System.out.println("Valor digitado é incorreto.");
            }
        } while (ErroLeitura);
        return valor;
    }
}