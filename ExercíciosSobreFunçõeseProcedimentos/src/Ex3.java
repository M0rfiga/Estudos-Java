public class Ex3 {
    public static void main(String[] args) {
        float qtdeCavalos;
        float valorFerradura;
        //Usando a classe leitura nao precisa do bloco try catch, pois ele ja esta na classe leitura!
        qtdeCavalos = Leitura.lerValorFloat("Digite a quantidade de cavalos comprados: ");
            
        valorFerradura = Leitura.lerValorFloat("Digite o valor de cada ferradura: R$ ");
            
        resultado(qtdeCavalos, valorFerradura);

    }
    static void resultado(float qtdeCavalos, float valorFerradura){
        System.out.println("Para a equipe com " +  qtdeCavalos + " cavalos, serao gastos R$ " + (qtdeCavalos * 4 * valorFerradura) + " reais!");
    }
}