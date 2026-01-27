public class Ex6 {
    public static void main(String[] args) {
        
        int qtdeFatiasMussarela = 2, qtdeFatiasPresunto = 1, qtdeHamburguer = 1;
        float fatiaMussarelaGrms = 50, fatiaPresuntoGrms = 50, hamburguerGrms = 120;
        float pesoMussarelaKgs, pesoPresuntoKgs, pesoHamburguerKgs;
        int qtdeSanduiches;
        //Mais uma vez, como o bloco do try catch so esta sendo usado para filtrar erros de valores de entrada, a classe leitura torna ele obsoleto.
        qtdeSanduiches = Leitura.lerValorInteiro("Digite a quantidade de sanduiches a serem fabricados: ");

        pesoMussarelaKgs = obterPesoMussarelaKgs(qtdeSanduiches, qtdeFatiasMussarela, fatiaMussarelaGrms);
        pesoPresuntoKgs = obterPesoPresuntoKgs(qtdeSanduiches, qtdeFatiasPresunto, fatiaPresuntoGrms);
        pesoHamburguerKgs = obterPesoHamburguerKgs(qtdeSanduiches, qtdeHamburguer, hamburguerGrms);

        exibirResultados(qtdeSanduiches, pesoMussarelaKgs, pesoPresuntoKgs, pesoHamburguerKgs);
    }
    static void exibirResultados(int qtdeSanduiches, float pesoMussarelaKgs, float pesoPresuntoKgs, float pesoHamburguerKgs) {
        System.out.printf("\nPara fabricar %d sanduiches, você precisará de:\n\n", qtdeSanduiches);
        System.out.printf("%.2f kg de mussarela\n", pesoMussarelaKgs);
        System.out.printf("%.2f kg de presunto\n", pesoPresuntoKgs);
        System.out.printf("%.2f kg de hamburguer\n", pesoHamburguerKgs);
    }
    static float obterPesoMussarelaKgs(float qtdeSanduiches, float qtdeFatiasMussarela, float fatiaMussarelaGrms) {
        return (qtdeSanduiches * qtdeFatiasMussarela * fatiaMussarelaGrms) / 1000;
    }
    static float obterPesoPresuntoKgs(float qtdeSanduiches, float qtdeFatiasPresunto, float fatiaPresuntoGrms) {
        return (qtdeSanduiches * qtdeFatiasPresunto * fatiaPresuntoGrms) / 1000;
    }
    static float obterPesoHamburguerKgs(float qtdeSanduiches, float qtdeHamburguer, float hamburguerGrms) {
        return (qtdeSanduiches * qtdeHamburguer * hamburguerGrms) / 1000;
    }
}