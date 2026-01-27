Exercícios Sobre Funções e Procedimentos

Faça a alteração dos códigos abaixo da seguinte forma:

O Bloco de comandos que estiver destacado em verde deve ser convertido para funções;

O Bloco de comandos que estiver destacado em vermelho deve ser convertido para procedimentos:
Ex1{
    // importa a classe scanner para lidar com a entrada de dados
    import java.util.InputMismatchException;
    import java.util.Scanner; 
    public class Main
    {
            public static void main(String[] args) {
                    float frenteMts, lateralMts, areaTotalMts;
                    float valorMetroQrd;
                    
                    Scanner teclado;
                    
                    teclado = new Scanner(System.in);
                    
                    //Exemplo: frenteMts = lerValorFloat(teclado, "Quantos metros o terreno possui de frente: ");
                    System.out.print("Quantos metros o terreno possui de frente: ");
                    frenteMts = teclado.nextFloat();

                    //Exemplo: lateralMts = lerValorFloat(teclado, "Quantos metros o terreno possui de lateral: ");                
                    System.out.print("Quantos metros o terreno possui de lateral: ");
                    lateralMts = teclado.nextFloat();
                    
                    //Exemplo: valorMetroQrd = lerValorFloat(teclado, "Informe o valor do metro quadrado: ");  
                    System.out.print("Informe o valor do metro quadrado: ");
                    valorMetroQrd = teclado.nextFloat();
                    
                    //Exemplo: areaTotalMts = calcularAreaTotal(frenteMts, lateralMts);
                    areaTotalMts = (frenteMts * lateralMts);

                    //Exemplo: exibirDados(frenteMts, lateralMts, valorMetroQrd);
                    System.out.print("Area total o terreno de " + frenteMts + " metros de frente com " +  lateralMts + " metros de lateral é: ");
                    System.out.println( areaTotalMts + " mts.");
                    System.out.print("Valor total do terreno: R$ " + (valorMetroQrd * areaTotalMts) );
            }
    }
} Para os próximos códigos, você decidirá qual será o nome das funções e dos procedimentos.
Ex2 {
    // importa a classe scanner para lidar com a entrada de dados
    import java.util.InputMismatchException;
    import java.util.Scanner; 
    public class Main
    {
        public static void main(String[] args) {
                float salarioMinimo, salarioFuncionario;
                float resultado;
                
                Scanner teclado;
                
                teclado = new Scanner(System.in);  //Teclado sera util para lermos os valores do teclado
                
                System.out.print("Digite o valor do salário do funcionário: R$ ");
                salarioFuncionario = teclado.nextFloat();
                
                System.out.print("Digite o valor do salário mínimo: R$ ");
                salarioMinimo = teclado.nextFloat();
                
                resultado = (salarioFuncionario / salarioMinimo);
                
                System.out.print("O funcionario ganha " + resultado + " salários. ");
        }
}
} Ex3 {
    // importa a classe scanner para lidar com a entrada de dados
    import java.util.InputMismatchException;
    import java.util.Scanner; 

    public class App
    {
        public static void main(String[] args) {
            float qtdeCavalos;
            float valorFerradura;
        
            //Teclado sera util para lermos os valores do teclado
            Scanner teclado = new Scanner(System.in);  ;
            
            try {
                System.out.print("Digite a quantidade de cavalos comprados: ");
                qtdeCavalos = teclado.nextFloat();
                
                System.out.print("Digite o valor de cada ferradura: R$ ");
                valorFerradura = teclado.nextFloat();
                
                System.out.print("Para equipa " +  qtdeCavalos + " cavalos sera qasto R$ " + (qtdeCavalos * 4 * valorFerradura) + " reais. ");
            }  catch (InputMismatchException e) {
                System.out.println("Voce digitou um valor invalido. Por favor, digite apenas números.");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: ");
                e.printStackTrace();
            }

            //Fechamos a conexao com o teclado
            teclado.close(); 
        }
    }
} Ex4 {
    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class App
    {
        public static void main(String[] args) {
            float salario, salarioReajustado;
            float inss, fgts;
            float totalDesconto;

            Scanner teclado;
            
            teclado = new Scanner(System.in);  //Teclado sera util para lermos os valores do teclado

            try{
                System.out.print("Digite o valor do salário: R$ ");
                salario = teclado.nextFloat();
                
                salarioReajustado =  (salario * (float) 1.15) ;
                System.out.println("Salario reajustado: R$ " + salarioReajustado );
                
                inss = (salarioReajustado * 0.11f);
                fgts = (salarioReajustado * 0.08f);
                totalDesconto = inss + fgts;
                
                System.out.print("Desconto INSS: R$ " + inss + "\n");
                System.out.print("Desconto FGTS: R$ " + fgts + "\n");
                System.out.println("Total de descontos (INSS + FGTS): R$ " + totalDesconto );
                System.out.println("Salario Final: R$ " + (salarioReajustado - totalDesconto) );
            }  catch (InputMismatchException e) {
                System.out.println("Voce digitou um valor invalido. Por favor, digite apenas números.");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: ");
                e.printStackTrace();
            }
            
            //fechando o a conexao com o teclado
            teclado.close();
        }
    }
} Ex5 {
    // importa a classe scanner para lidar com a entrada de dados
    import java.util.InputMismatchException;
    import java.util.Scanner; 

    public class App {
        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);

            int qtdeFrangos = 0;
            
            float valorChipIdentificacao = 4f;
            float valorChipAlimento = 3.5f;

            float gastoTotalAneis;

            try {
                System.out.print("Digite a quantidade de frangos a ser identificados: ");
                qtdeFrangos = teclado.nextInt();  
                
                gastoTotalAneis = qtdeFrangos * (valorChipIdentificacao + (2 * valorChipAlimento));

                System.out.printf("O valor total para identicar %d frangos é R$ %.2f reais.", qtdeFrangos, gastoTotalAneis);
            } catch (InputMismatchException e) {
                // trata o erro quando o usuário digita um valor que não é um número inteiro
                System.out.println("Erro: você deve digitar um número inteiro.");
            } catch (Exception e){
                // trata qualquer outro erro que possa ocorrer
                System.out.println("\nErro inesperado: ");
                e.printStackTrace();
            }

            teclado.close();
        }
    }
} Ex6 {
    import java.util.InputMismatchException;
    import java.util.Scanner; 
    public class App
    {
        public static void main(String[] args) {
            //Teclado sera util para lermos os valores do teclado
            Scanner teclado = new Scanner(System.in);  
            
            int qtdeFatiasMussarela = 2, qtdeFatiasPresunto = 1, qtdeHamburguer = 1;
            float fatiaMussarelaGrms = 50, fatiaPresuntoGrms = 50, hamburguerGrms = 120;
            float pesoMussarelaKgs, pesoPresuntoKgs, pesoHamburguerKgs;

            int qtdeSanduiches;

            try{
                System.out.print("Digite a quantidade de sanduiches a serem fabricados: ");
                qtdeSanduiches = teclado.nextInt();
    
                pesoMussarelaKgs = (qtdeSanduiches * qtdeFatiasMussarela * fatiaMussarelaGrms) / 1000;
                pesoPresuntoKgs = (qtdeSanduiches * qtdeFatiasPresunto * fatiaPresuntoGrms) / 1000;
                pesoHamburguerKgs = (qtdeSanduiches * qtdeHamburguer * hamburguerGrms) / 1000;

                System.out.printf("\nPara fabricar %d sanduiches, você precisará de:\n\n", qtdeSanduiches);
                System.out.printf("%.2f kg de mussarela\n", pesoMussarelaKgs);
                System.out.printf("%.2f kg de presunto\n", pesoPresuntoKgs);
                System.out.printf("%.2f kg de hamburguer\n", pesoHamburguerKgs);

            }  catch (InputMismatchException e) {
                System.out.println("Voce digitou um valor invalido. Por favor, digite apenas números.");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: ");
                e.printStackTrace();
            }
            
            //fechando o a conecao com o teclado
            teclado.close();                
        }
    }
}
