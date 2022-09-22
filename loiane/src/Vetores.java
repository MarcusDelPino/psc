import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double[] tempDiaria = new double[365];

        tempDiaria[0] = 31;
        tempDiaria[1] = 31.5;
        tempDiaria[2] = 31.7;
        tempDiaria[3] = 31.1;
        tempDiaria[4] = 36;

        System.out.println("Add array");

        tempDiaria[5] = ler.nextDouble();
        System.out.println(tempDiaria.length);


        /*
        System.out.println(tempDiaria[4]);
        System.out.println(tempDiaria.length);

        for (int i = 0; i < tempDiaria.length; i++) {
            System.out.println(tempDiaria[i]);
        }

        for (double temp : tempDiaria){
            System.out.println(temp);
        }
    */
    }
}
