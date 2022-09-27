package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class VetoresEx4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double adicionar;

        ArrayList<Double> vetorA = new ArrayList<Double>();
        ArrayList<Double> raizQuadrada = new ArrayList<Double>();


        for (int i = 0; i < 15; i++){
            System.out.println("Qual o número?");
            adicionar = ler.nextDouble();
            vetorA.add(adicionar);

            if (adicionar > 0){
              //  adicionar = Math.sqrt(adicionar);
                raizQuadrada.add(adicionar * adicionar);
            }
        }

        for (double res : raizQuadrada) {
            System.out.println(res);
        }


    }
}
