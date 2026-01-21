import java.util.Scanner;

public class Codigo06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        boolean valor1, valor2;
        String resposta1 = "", resposta2 = "";
        System.out.println("Me informe se é fim de semana, responda SIM ou NAO");
        resposta1 = teclado.nextLine();
        System.out.println("Me informe se está chovendo, responda SIM ou NAO");
        resposta2 = teclado.nextLine();
        if ((resposta1).equals("SIM")) valor1 = true;
        else valor1 = false;
        if ((resposta2).equals("SIM")) valor2 = true;
        else valor2 = false;
        if (valor1 == true && valor2 == true) 
            System.out.println("Os dois são verdadeiros, logo é fim de semana e está chuvoso");
        else if (valor1 == true && valor2 == false)
            System.out.println("Somente 1 é verdadeiro, logo é um fim de semana sem chuvas");
        else if (valor1 == false && valor2 == true)
            System.out.println("Somente 2 é verdadeiro, logo não é fim de semana, mas está chuvoso");
        else System.out.println("Nenhum é verdadeiro, logo não é fim de semana nem tem chuva");
        teclado.close();
    }
}