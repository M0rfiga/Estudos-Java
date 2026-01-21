import java.util.Scanner;

public class Codigo02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        System.out.println("Me informe seu nome:");
        nome = teclado.nextLine();
        System.out.println("Me informe seu sexo\nUse F para feminino\nUse M para masculino:");
        sexo = teclado.nextLine();
        System.out.println("Me informe seu estado civil\nUse CASADO(a) ou SOLTEIRO(a):");
        estadoCivil = teclado.nextLine();
        if ((sexo).equals("F") && (estadoCivil).equals("CASADA")) {
            System.out.println("Quanto anos você possui de casada?");
            String tempoCasada = teclado.nextLine();
            System.out.printf("Suas informações:\nNome: %s\nSexo:%s\nEstado Civil: %s\nAnos casada: %s", nome, sexo, estadoCivil, tempoCasada);
        } else if ((sexo).equals("F") && (estadoCivil).equals("SOLTEIRA")) {
            System.out.printf("Você %s é uma solteirona!", nome);
        } else System.out.println("Você vai achar alguém mano, não desista!");

        teclado.close();
    }
}