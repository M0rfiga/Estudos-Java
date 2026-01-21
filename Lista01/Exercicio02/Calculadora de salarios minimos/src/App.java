import java.util.Scanner; //linha de codigo que permite utilizarmos o comando para a leitura de dados

public class App {
    public static void main(String[] args) throws Exception {
        float salario_minimo; //variavel para armazenar o valor
        float salario_funcionario;
        
        
        //a linha de codigo abaixo prepara o teclado para ler os diversos tipos 
        Scanner teclado = new Scanner(System.in); 
        
        System.out.print("Informe o valor do salario minimo: ");
        salario_minimo = teclado.nextFloat();
        //comando que le o valor digitado pelo usuario e armazena na variavel salario_minimo

        System.out.print("Informe o valor do salario do funcionario: ");
        salario_funcionario = teclado.nextFloat();
        float salarios_minimos = salario_funcionario / salario_minimo; //salva a variavel salarios_minimos
        
        System.out.print("O funcionario ganha " + salarios_minimos + " salarios minimos");
        
        teclado.close();
    }
}