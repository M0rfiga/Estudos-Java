public class Ex2 {
        public static void main(String[] args) {
                float salarioMinimo, salarioFuncionario;

                //Usando a classe leitura mais uma vez!

                salarioFuncionario = Leitura.lerValorFloat("Digite o valor do salário do funcionário: R$ ");
                
                salarioMinimo = Leitura.lerValorFloat("Digite o valor do salário mínimo: R$ ");
                //Decidi testar se seria possivel passar como parametro uma funcao que retorna um valor e da certo! Bem legal.
                exibirsalarioFuncionario(obterResultado(salarioFuncionario, salarioMinimo));
        }
        static float obterResultado(float salarioFuncionario, float salarioMinimo){
                return (salarioFuncionario/salarioMinimo);
        }
        static void exibirsalarioFuncionario(float resultado) {
                System.out.print("O funcionario ganha " + resultado + " salários. ");
        }
}