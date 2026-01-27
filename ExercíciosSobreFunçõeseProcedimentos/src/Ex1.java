public class Ex1 {
        public static void main(String[] args) {
                float frenteMts, lateralMts, areaTotalMts;
                float valorMetroQrd;
                
                //Decidi importar a classe Leitura e usar dela para ler os valores de entrada!

                frenteMts = Leitura.lerValorFloat("Quantos metros o terreno possui de frente: ");

                lateralMts = Leitura.lerValorFloat("Quantos metros o terreno possui de lateral: ");
                
                valorMetroQrd = Leitura.lerValorFloat("Informe o valor do metro quadrado: ");
                //Transformei em funcoes como pedido na atividade
                areaTotalMts = calcularAreaTotal(frenteMts, lateralMts);
                exibirDados(frenteMts, lateralMts, valorMetroQrd, areaTotalMts);
        }
        public static float calcularAreaTotal(float frenteMts, float lateralMts) {
                return (frenteMts * lateralMts);
        }
        public static void exibirDados(float frenteMts, float lateralMts, float valorMetroQrd, float areaTotalMts){
                System.out.print("Area total do terreno de " + frenteMts + " metros de frente com " +  lateralMts + " metros de lateral é: ");
                System.out.println(areaTotalMts + " mts.");
                System.out.print("Valor total do terreno: R$ " + (valorMetroQrd * areaTotalMts) );
                }
        }