package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class VetoresEx3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int adicionar;

        ArrayList<Integer> vetorA = new ArrayList<Integer>();
        ArrayList<Integer> vetorPar = new ArrayList<Integer>();
        ArrayList<Integer> vetorImpar = new ArrayList<Integer>();

        for (int i = 0; i < 15; i++){
            System.out.println("Qual o número?");
            adicionar = ler.nextInt();
            vetorA.add(adicionar);

            if (adicionar % 2 == 0){
                vetorPar.add(adicionar);

            } else {
                vetorImpar.add(adicionar);
            }

        }

        for (int res : vetorA) {
            System.out.println("Valores obtidos totais: " + res);
            System.out.println("");
        }

        for (int res : vetorPar) {
            System.out.println("Valores pares : " + res);
            System.out.println("");
        }

        for (int res : vetorImpar) {
            System.out.println("Valores impares : " + res);
            System.out.println("");
        }

    }
}
