import java.util.Scanner;

public class VetoresIguais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorUm = new int[7];
        int [] vetorDois = new int[7];

        for (int i = 0; i < vetorUm.length; i++){
            System.out.println("Add um número ao vetor: ");
            vetorUm[i] = ler.nextInt();

        }

        for (int i = 0; i < vetorUm.length; i++) {
            System.out.println(vetorUm[i]);
        }

        for (int v2 = 0; v2 < vetorDois.length; v2++){
            vetorDois[v2] = vetorUm[v2] * 2;
        }

        for (int i = 0; i < vetorDois.length; i++) {
            System.out.println(vetorDois[i]);
        }




    }
}
