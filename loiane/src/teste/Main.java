package teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual tamanho da tela?");

        Celulares celTeste2 = new Celulares();

        celTeste2.nome = "Jurandir";

        celTeste2.setTamanhoTela(ler.nextDouble());


        celTeste2.mostrarTela();
    }
}





/*
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o tamanho da tela?");
        double tamTela = ler.nextDouble();

        System.out.println("Oque pega");
        Celulares celTestes = new Celulares(tamTela);

        System.out.println(celTestes.getTamanhoTela());

        double pegarNumeroTela;



 */