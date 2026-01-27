public class Ex4 {
    public static void main(String[] args) {
        float salario, salarioReajustado;
        float inss, fgts;
        float totalDesconto;
        //Mais uma vez, classe leitura faz nao ser necessario o try catch.
            salario = Leitura.lerValorFloat("Digite o valor do salário: R$ ");
            
            salarioReajustado = obterSalarioReajustado(salario);
            System.out.println("Salario reajustado: R$ " + salarioReajustado );
            
            inss = obterINSS(salarioReajustado);
            fgts = obterFGTS(salarioReajustado);
            totalDesconto = obterTotalDesconto(inss, fgts);

            exibirDados(inss, fgts, totalDesconto, salarioReajustado);
        //Criei funcoes pra todas as variaveis que precisavam e fiz o procedimento para exibir na tela os resultados.
    }
    static void exibirDados(float inss, float fgts, float totalDesconto, float salarioReajustado) {
            System.out.print("Desconto INSS: R$ " + inss + "\n");
            System.out.print("Desconto FGTS: R$ " + fgts + "\n");
            System.out.println("Total de descontos (INSS + FGTS): R$ " + totalDesconto );
            System.out.println("Salario Final: R$ " + (salarioReajustado - totalDesconto) );
    }
    static float obterSalarioReajustado(float salario) {
        return (salario * (float) 1.15);
    }    
    static float obterFGTS(float salarioReajustado) {
        return (salarioReajustado * 0.08f);
    }
    static float obterINSS(float salarioReajustado) {
        return (salarioReajustado * 0.11f);
    }
    static float obterTotalDesconto(float inss, float fgts) {
        return inss + fgts;
        //Na realidade o fgts nn desconta ne, mas na atividade sim entao nao me questione
    }
}