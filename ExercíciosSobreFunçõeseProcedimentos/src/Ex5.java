public class Ex5 {
    public static void main(String[] args) throws Exception {

        int qtdeFrangos;
        
        float valorChipIdentificacao = 4f;
        float valorChipAlimento = 3.5f;
        float gastoTotalAneis;
            //Classe leitura faz elimina a necessidade de try catch mais uma vez.
            qtdeFrangos = Leitura.lerValorInteiro("Digite a quantidade de frangos a serem identificados: ");  
            
            gastoTotalAneis = obterTotalAneis(qtdeFrangos, valorChipIdentificacao, valorChipAlimento);
            exibirResultado(qtdeFrangos, gastoTotalAneis);
    }
    static void exibirResultado(int qtdeFrangos, float gastoTotalAneis) {
        System.out.printf("O valor total para identicar %d frangos é R$ %.2f reais.", qtdeFrangos, gastoTotalAneis);
    }
    static float obterTotalAneis(float qtdeFrangos, float valorChipIdentificacao, float valorChipAlimento) {
        return qtdeFrangos * (valorChipIdentificacao + (2 * valorChipAlimento));
    }
}