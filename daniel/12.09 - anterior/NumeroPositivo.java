import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um numero \n te mostrarei o valor ao quadrado \n o valor ao cubo \n A sua raiz quadrada.");

        int num = leitorScanner.nextInt();

        System.out.printf("Numero ao quadrdado: %d %nNumero ao cubo: %d %nRaiz quadrada: %.2f", num*num, num*num*num, Math.sqrt(num));




        leitorScanner.close();

    }
    
}
